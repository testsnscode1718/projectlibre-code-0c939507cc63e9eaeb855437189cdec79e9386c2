/*
 * file:       AstaDatabaseFileReader.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2016
 * date:       06/06/2016
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.asta;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import net.sf.mpxj.DayType;
import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Task;
import net.sf.mpxj.common.InputStreamHelper;
import net.sf.mpxj.common.NumberHelper;
import net.sf.mpxj.listener.ProjectListener;
import net.sf.mpxj.reader.ProjectReader;

/**
 * This class provides a generic front end to read project data from
 * a SQLite-based Asta PP file.
 */
public final class AstaDatabaseFileReader implements ProjectReader
{
   /**
    * {@inheritDoc}
    */
   @Override public void addProjectListener(ProjectListener listener)
   {
      if (m_projectListeners == null)
      {
         m_projectListeners = new LinkedList<ProjectListener>();
      }
      m_projectListeners.add(listener);
   }

   /**
    * {@inheritDoc}
    */
   @Override public ProjectFile read(String fileName) throws MPXJException
   {
      return read(new File(fileName));
   }

   /**
    * {@inheritDoc}
    */
   @Override public ProjectFile read(File file) throws MPXJException
   {
      try
      {
         String url = "jdbc:sqlite:" + file.getAbsolutePath();
         Properties props = new Properties();
         props.setProperty("date_string_format", "yyyy-MM-dd HH:mm:ss");
         // Note that we use the JDBC driver class directly here.
         // This ensures that it is an explicit dependency of MPXJ
         // and will work as expected in .Net.
         
         //claur avoid dependency on sqlite  
         //m_connection = org.sqlite.JDBC.createConnection(url, props);
         Class.forName("org.sqlite.JDBC");
         m_connection = DriverManager.getConnection(url);
         m_projectID = Integer.valueOf(0);
         return read();
      }

      catch (ClassNotFoundException ex)  //claur
      {
  		// TODO Auto-generated catch block
      	  throw new MPXJException("Sqlite missing", ex);
      }
      
      catch (SQLException ex)
      {
         throw new MPXJException("Failed to create connection", ex);
      } 

      finally
      {
         if (m_connection != null)
         {
            try
            {
               m_connection.close();
            }

            catch (SQLException ex)
            {
               // silently ignore exceptions when closing connection
            }
         }
      }
   }

   @Override public ProjectFile read(InputStream inputStream) throws MPXJException
   {
      File tempFile = null;

      try
      {
         tempFile = InputStreamHelper.writeStreamToTempFile(inputStream, "pp");
         return read(tempFile);
      }

      catch (IOException ex)
      {
         throw new MPXJException("Failed to read file", ex);
      }

      finally
      {
         if (tempFile != null)
         {
            tempFile.delete();
         }
      }
   }

   /**
    * Read a project from the current data source.
    *
    * @return ProjectFile instance
    * @throws MPXJException
    */
   public ProjectFile read() throws MPXJException
   {
      try
      {
         m_reader = new AstaReader();
         ProjectFile project = m_reader.getProject();
         project.getEventManager().addProjectListeners(m_projectListeners);

         processProjectProperties();
         processCalendars();
         processResources();
         processTasks();
         processPredecessors();
         processAssignments();

         m_reader = null;

         updateStructure(project);

         return (project);
      }

      catch (SQLException ex)
      {
         throw new MPXJException(MPXJException.READ_ERROR, ex);
      }

      catch (ParseException ex)
      {
         throw new MPXJException(MPXJException.READ_ERROR, ex);
      }

   }

   /**
    * Select the project properties row from the database.
    *
    * @throws SQLException
    */
   private void processProjectProperties() throws SQLException
   {
      List<Row> rows = getRows("select duration as durationhours, project_start as staru, project_end as ene, * from project_summary where projid=?", m_projectID);
      if (rows.isEmpty() == false)
      {
         m_reader.processProjectProperties(rows.get(0));
      }
   }

   /**
    * Process calendars.
    *
    * @throws SQLException
    * @throws ParseException
    */
   private void processCalendars() throws SQLException, ParseException
   {
      List<Row> rows = getRows("select id as exceptionnid, * from exceptionn");
      Map<Integer, DayType> exceptionTypeMap = m_reader.createExceptionTypeMap(rows);

      rows = getRows("select id as work_patternid, name as namn, * from work_pattern");
      Map<Integer, Row> workPatternMap = m_reader.createWorkPatternMap(rows);

      rows = getRows("select id, work_patterns from calendar");
      Map<Integer, List<Row>> workPatternAssignmentMap = createWorkPatternAssignmentMap(rows);

      rows = getRows("select id, exceptions from calendar");
      Map<Integer, List<Row>> exceptionAssignmentMap = createExceptionAssignmentMap(rows);

      rows = getRows("select id, shifts from work_pattern");
      Map<Integer, List<Row>> timeEntryMap = createTimeEntryMap(rows);

      rows = getRows("select id as calendarid, name as namk, * from calendar where projid=? order by id", m_projectID);
      for (Row row : rows)
      {
         m_reader.processCalendar(row, workPatternMap, workPatternAssignmentMap, exceptionAssignmentMap, timeEntryMap, exceptionTypeMap);
      }

      //
      // Update unique counters at this point as we will be generating
      // resource calendars, and will need to auto generate IDs
      //
      m_reader.getProject().getProjectConfig().updateUniqueCounters();
   }

   /**
    * Process resources.
    *
    * @throws SQLException
    */
   private void processResources() throws SQLException
   {
      List<Row> permanentRows = getRows("select id as permanent_resourceid, name as nase, calendar as calendav, * from permanent_resource where projid=? order by id", m_projectID);
      List<Row> consumableRows = getRows("select id as consumable_resourceid, name as nase, calendar as calendav, * from consumable_resource where projid=? order by id", m_projectID);
      m_reader.processResources(permanentRows, consumableRows);
   }

   /**
    * Process tasks.
    *
    * @throws SQLException
    */
   private void processTasks() throws SQLException
   {
      List<Row> bars = getRows("select bar.id as barid, calendar as calendau, bar_start as starv, bar_finish as enf, bar.name as namh, bar, wbn_code from bar inner join expanded_task on bar.expanded_task = expanded_task.id where bar.projid=? and bar_start !='' order by bar.natural_order", m_projectID);
      List<Row> tasks = getRows("select id as taskid, given_duration as given_durationhours, actual_duration as actual_durationhours, overall_percent_complete as overall_percenv_complete, name as nare, calendar as calendau, linkable_start as starz, linkable_finish as enj, * from task where projid=? order by wbs, natural_order", m_projectID);
      List<Row> milestones = getRows("select id as milestoneid, name as nare, calendar as calendau, * from milestone where projid=?", m_projectID);
      m_reader.processTasks(bars, tasks, milestones);
   }

   /**
    * Process predecessors.
    *
    * @throws SQLException
    */
   private void processPredecessors() throws SQLException
   {
      List<Row> rows = getRows("select start_lag_time as start_lag_timehours, end_lag_time as end_lag_timehours, link_kind as typi, * from link where projid=? order by id", m_projectID);
      m_reader.processPredecessors(rows);
   }

   /**
    * Process resource assignments.
    *
    * @throws SQLException
    */
   private void processAssignments() throws SQLException
   {
      List<Row> permanentAssignments = getRows("select allocated_to as allocatee_to, player, percent_complete, effort as efforw, permanent_schedul_allocation.id as permanent_schedul_allocationid, linkable_start as starz, linkable_finish as enj, given_allocation, delay as delaahours from permanent_schedul_allocation inner join perm_resource_skill on permanent_schedul_allocation.allocation_of = perm_resource_skill.id where permanent_schedul_allocation.projid=? order by permanent_schedul_allocation.id", m_projectID);
      m_reader.processAssignments(permanentAssignments);
   }

   /**
    * Set the ID of the project to be read.
    *
    * @param projectID project ID
    */
   public void setProjectID(int projectID)
   {
      m_projectID = Integer.valueOf(projectID);
   }

   /**
    * Retrieve a number of rows matching the supplied query.
    *
    * @param sql query statement
    * @return result set
    * @throws SQLException
    */
   private List<Row> getRows(String sql) throws SQLException
   {
      List<Row> result = new LinkedList<Row>();

      m_ps = m_connection.prepareStatement(sql);
      m_rs = m_ps.executeQuery();
      populateMetaData();
      while (m_rs.next())
      {
         result.add(new SqliteResultSetRow(m_rs, m_meta));
      }

      return (result);
   }

   /**
    * Retrieve a number of rows matching the supplied query
    * which takes a single parameter.
    *
    * @param sql query statement
    * @param var bind variable value
    * @return result set
    * @throws SQLException
    */
   private List<Row> getRows(String sql, Integer var) throws SQLException
   {
      List<Row> result = new LinkedList<Row>();

      m_ps = m_connection.prepareStatement(sql);
      m_ps.setInt(1, NumberHelper.getInt(var));
      m_rs = m_ps.executeQuery();
      populateMetaData();
      while (m_rs.next())
      {
         result.add(new SqliteResultSetRow(m_rs, m_meta));
      }

      return (result);
   }

   /**
    * Retrieves basic meta data from the result set.
    *
    * @throws SQLException
    */
   private void populateMetaData() throws SQLException
   {
      m_meta.clear();

      ResultSetMetaData meta = m_rs.getMetaData();
      int columnCount = meta.getColumnCount() + 1;
      for (int loop = 1; loop < columnCount; loop++)
      {
         String name = meta.getColumnName(loop);
         Integer type = Integer.valueOf(meta.getColumnType(loop));
         m_meta.put(name, type);
      }
   }

   /**
    * Set the name of the schema containing the Primavera tables.
    *
    * @param schema schema name.
    */
   public void setSchema(String schema)
   {
      if (schema.charAt(schema.length() - 1) != '.')
      {
         schema = schema + '.';
      }
      m_schema = schema;
   }

   /**
    * Retrieve the name of the schema containing the Primavera tables.
    *
    * @return schema name
    */
   public String getSchema()
   {
      return m_schema;
   }

   /**
    * Cleans up the structure, removes unnecessary summary tasks and
    * ensures tasks with blank names inherit their names from the
    * parent task.
    *
    * @param project ProjectFile instance
    */
   private void updateStructure(ProjectFile project)
   {
      //
      // Build the hierarchy
      //
      project.updateStructure();

      //
      // Ensure tasks with blank names inherit parent task names
      //
      for (Task task : project.getChildTasks())
      {
         updateBlankNames(null, task);
      }

      //
      // Create a list of tasks to prune
      //
      List<Task> tasks = new LinkedList<Task>();
      for (Task task : project.getAllTasks())
      {
         if (task.getChildTasks().size() == 1 && task.getChildTasks().get(0).getChildTasks().size() == 0 && task.getWBS().equals("-"))
         {
            tasks.add(task);
         }
      }

      //
      // Prune these tasks
      //
      for (Task task : tasks)
      {
         Task child = task.getChildTasks().get(0);
         Task parent = task.getParentTask();

         if (parent == null)
         {
            List<Task> parentList = project.getChildTasks();
            int parentListIndex = parentList.indexOf(task);
            if (parentListIndex == -1)
            {
               parentList.add(child);
            }
            else
            {
               parentList.add(parentListIndex, child);
            }
         }
         else
         {
            parent.addChildTaskBefore(child, task);
         }
         task.getChildTasks().clear();
         task.remove();
      }

      //
      // Ensure we have no gaps in the ID sequence
      //
      project.renumberTaskIDs();

      project.updateStructure();
   }

   /**
    * Called recursively to replace blank task names
    * with names inherited from parent tasks.
    *
    * @param parent parent task
    * @param task current task
    */
   private void updateBlankNames(Task parent, Task task)
   {
      if (parent != null && (task.getName() == null || task.getName().length() == 0))
      {
         task.setName(parent.getName());
      }

      for (Task child : task.getChildTasks())
      {
         updateBlankNames(task, child);
      }
   }

   /**
    * Create the work pattern assignment map.
    *
    * @param rows calendar rows
    * @return work pattern assignment map
    */
   private Map<Integer, List<Row>> createWorkPatternAssignmentMap(List<Row> rows) throws ParseException
   {
      Map<Integer, List<Row>> map = new HashMap<Integer, List<Row>>();
      for (Row row : rows)
      {
         Integer calendarID = row.getInteger("ID");
         String workPatterns = row.getString("WORK_PATTERNS");
         map.put(calendarID, createWorkPatternAssignmentRowList(workPatterns));
      }
      return map;
   }

   /**
    * Extract a list of work pattern assignments.
    *
    * @param workPatterns string representation of work pattern assignments
    * @return list of work pattern assignment rows
    */
   private List<Row> createWorkPatternAssignmentRowList(String workPatterns) throws ParseException
   {
      List<Row> list = new ArrayList<Row>();
      String[] patterns = workPatterns.split(",|:");
      int index = 1;
      while (index < patterns.length)
      {
         Integer workPattern = Integer.valueOf(patterns[index + 1]);
         Date startDate = AstaDataType.parseBasicTimestamp(patterns[index + 3]);
         Date endDate = AstaDataType.parseBasicTimestamp(patterns[index + 4]);

         Map<String, Object> map = new HashMap<String, Object>();
         map.put("WORK_PATTERN", workPattern);
         map.put("START_DATE", startDate);
         map.put("END_DATE", endDate);

         list.add(new MapRow(map));

         index += 5;
      }

      return list;
   }

   /**
    * Create the exception assignment map.
    *
    * @param rows calendar rows
    * @return exception assignment map
    */
   private Map<Integer, List<Row>> createExceptionAssignmentMap(List<Row> rows)
   {
      Map<Integer, List<Row>> map = new HashMap<Integer, List<Row>>();
      for (Row row : rows)
      {
         Integer calendarID = row.getInteger("ID");
         String exceptions = row.getString("EXCEPTIONS");
         map.put(calendarID, createExceptionAssignmentRowList(exceptions));
      }
      return map;
   }

   /**
    * Extract a list of exception assignments.
    *
    * @param exceptionData string representation of exception assignments
    * @return list of exception assignment rows
    */
   private List<Row> createExceptionAssignmentRowList(String exceptionData)
   {
      List<Row> list = new ArrayList<Row>();
      String[] exceptions = exceptionData.split(",|:");
      int index = 1;
      while (index < exceptions.length)
      {
         Date startDate = AstaDataType.parseEpochTimestamp(exceptions[index + 0]);
         Date endDate = AstaDataType.parseEpochTimestamp(exceptions[index + 1]);
         //Integer exceptionTypeID = Integer.valueOf(exceptions[index + 2]);

         Map<String, Object> map = new HashMap<String, Object>();
         map.put("STARU_DATE", startDate);
         map.put("ENE_DATE", endDate);

         list.add(new MapRow(map));

         index += 3;
      }

      return list;
   }

   /**
    * Create the time entry map.
    *
    * @param rows work pattern rows
    * @return time entry map
    */
   private Map<Integer, List<Row>> createTimeEntryMap(List<Row> rows) throws ParseException
   {
      Map<Integer, List<Row>> map = new HashMap<Integer, List<Row>>();
      for (Row row : rows)
      {
         Integer workPatternID = row.getInteger("ID");
         String shifts = row.getString("SHIFTS");
         map.put(workPatternID, createTimeEntryRowList(shifts));
      }
      return map;
   }

   /**
    * Extract a list of time entries.
    *
    * @param shiftData string representation of time entries
    * @return list of time entry rows
    */
   private List<Row> createTimeEntryRowList(String shiftData) throws ParseException
   {
      List<Row> list = new ArrayList<Row>();
      String[] shifts = shiftData.split(",|:");
      int index = 1;
      while (index < shifts.length)
      {
         index += 2;
         int entryCount = Integer.parseInt(shifts[index]);
         index++;

         for (int entryIndex = 0; entryIndex < entryCount; entryIndex++)
         {
            Integer exceptionTypeID = Integer.valueOf(shifts[index + 0]);
            Date startTime = AstaDataType.parseBasicTime(shifts[index + 1]);
            Date endTime = AstaDataType.parseBasicTime(shifts[index + 2]);

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("START_TIME", startTime);
            map.put("END_TIME", endTime);
            map.put("EXCEPTIOP", exceptionTypeID);

            list.add(new MapRow(map));

            index += 3;
         }
      }

      return list;
   }
   private AstaReader m_reader;
   private Integer m_projectID = Integer.valueOf(1);
   private String m_schema = "";
   private Connection m_connection;
   private PreparedStatement m_ps;
   private ResultSet m_rs;
   private Map<String, Integer> m_meta = new HashMap<String, Integer>();
   private List<ProjectListener> m_projectListeners;
}