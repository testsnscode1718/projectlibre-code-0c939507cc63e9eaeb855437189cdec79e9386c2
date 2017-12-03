//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.02 at 12:16:58 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for UserType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllResourceAccessFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignmentStaffingPreference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="New"/>
 *               &lt;enumeration value="Existing"/>
 *               &lt;enumeration value="Ask Me"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CurrencyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CurrencyObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmailAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmailProtocol" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Internet Mail"/>
 *               &lt;enumeration value="MAPI Mail"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EnableUserToModifyViewSettingsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinancialPeriodEndObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FinancialPeriodStartObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\{[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\}|"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GlobalProfileObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailServerLoginName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NewProjectDurationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Fixed Units/Time"/>
 *               &lt;enumeration value="Fixed Duration and Units/Time"/>
 *               &lt;enumeration value="Fixed Units"/>
 *               &lt;enumeration value="Fixed Duration and Units"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OfficePhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OutgoingMailServer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PersonalName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RateSourcePreference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Resource"/>
 *               &lt;enumeration value="Role"/>
 *               &lt;enumeration value="Ask Me"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RespectActivityDurationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RoleLimitDisplayOption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Custom Role Limit"/>
 *               &lt;enumeration value="Calculated Primary Resources Limit"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TeamMemberActivityFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberApplicationTheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberDateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberDisplayTimeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TeamMemberDisplayTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberLocale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberProjectFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberTaskStatusFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberTimeframeFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberWorkUnitType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Hour"/>
 *               &lt;enumeration value="Day"/>
 *               &lt;enumeration value="Week"/>
 *               &lt;enumeration value="Month"/>
 *               &lt;enumeration value="Year"/>
 *               &lt;enumeration value="Days Hours"/>
 *               &lt;enumeration value="Hours Minutes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserInterfaceViewObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResourceRequest" type="{http://xmlns.oracle.com/Primavera/P6/V8.3/API/BusinessObjects}ResourceRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "UserType", propOrder =
{
   "allResourceAccessFlag",
   "assignmentStaffingPreference",
   "createDate",
   "createUser",
   "currencyId",
   "currencyName",
   "currencyObjectId",
   "emailAddress",
   "emailProtocol",
   "enableUserToModifyViewSettingsFlag",
   "financialPeriodEndObjectId",
   "financialPeriodStartObjectId",
   "guid",
   "globalProfileObjectId",
   "lastUpdateDate",
   "lastUpdateUser",
   "mailServerLoginName",
   "name",
   "newProjectDurationType",
   "objectId",
   "officePhone",
   "outgoingMailServer",
   "personalName",
   "rateSourcePreference",
   "reportingFlag",
   "respectActivityDurationType",
   "roleLimitDisplayOption",
   "teamMemberActivityFilters",
   "teamMemberApplicationTheme",
   "teamMemberDateFormat",
   "teamMemberDisplayTimeFlag",
   "teamMemberDisplayTimeFormat",
   "teamMemberLocale",
   "teamMemberProjectFilter",
   "teamMemberTaskStatusFilter",
   "teamMemberTimeframeFilter",
   "teamMemberWorkUnitType",
   "userInterfaceViewObjectId",
   "resourceRequests"
}) public class UserType
{

   @XmlElement(name = "AllResourceAccessFlag") protected Boolean allResourceAccessFlag;
   @XmlElement(name = "AssignmentStaffingPreference") protected String assignmentStaffingPreference;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "CurrencyId") protected String currencyId;
   @XmlElement(name = "CurrencyName") protected String currencyName;
   @XmlElement(name = "CurrencyObjectId") protected Integer currencyObjectId;
   @XmlElement(name = "EmailAddress") protected String emailAddress;
   @XmlElement(name = "EmailProtocol") protected String emailProtocol;
   @XmlElement(name = "EnableUserToModifyViewSettingsFlag", nillable = true) protected Boolean enableUserToModifyViewSettingsFlag;
   @XmlElement(name = "FinancialPeriodEndObjectId", nillable = true) protected Integer financialPeriodEndObjectId;
   @XmlElement(name = "FinancialPeriodStartObjectId", nillable = true) protected Integer financialPeriodStartObjectId;
   @XmlElement(name = "GUID") protected String guid;
   @XmlElement(name = "GlobalProfileObjectId") protected Integer globalProfileObjectId;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "MailServerLoginName") protected String mailServerLoginName;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "NewProjectDurationType") protected String newProjectDurationType;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "OfficePhone") protected String officePhone;
   @XmlElement(name = "OutgoingMailServer") protected String outgoingMailServer;
   @XmlElement(name = "PersonalName") protected String personalName;
   @XmlElement(name = "RateSourcePreference") protected String rateSourcePreference;
   @XmlElement(name = "ReportingFlag", nillable = true) protected Boolean reportingFlag;
   @XmlElement(name = "RespectActivityDurationType", nillable = true) protected Boolean respectActivityDurationType;
   @XmlElement(name = "RoleLimitDisplayOption") protected String roleLimitDisplayOption;
   @XmlElement(name = "TeamMemberActivityFilters") protected String teamMemberActivityFilters;
   @XmlElement(name = "TeamMemberApplicationTheme") protected String teamMemberApplicationTheme;
   @XmlElement(name = "TeamMemberDateFormat") protected String teamMemberDateFormat;
   @XmlElement(name = "TeamMemberDisplayTimeFlag") protected Boolean teamMemberDisplayTimeFlag;
   @XmlElement(name = "TeamMemberDisplayTimeFormat") protected String teamMemberDisplayTimeFormat;
   @XmlElement(name = "TeamMemberLocale") protected String teamMemberLocale;
   @XmlElement(name = "TeamMemberProjectFilter") protected String teamMemberProjectFilter;
   @XmlElement(name = "TeamMemberTaskStatusFilter") protected String teamMemberTaskStatusFilter;
   @XmlElement(name = "TeamMemberTimeframeFilter") protected String teamMemberTimeframeFilter;
   @XmlElement(name = "TeamMemberWorkUnitType") protected String teamMemberWorkUnitType;
   @XmlElement(name = "UserInterfaceViewObjectId", nillable = true) protected Integer userInterfaceViewObjectId;
   @XmlElement(name = "ResourceRequests", nillable = true) protected UserType.ResourceRequests resourceRequests;

   /**
    * Gets the value of the allResourceAccessFlag property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isAllResourceAccessFlag()
   {
      return allResourceAccessFlag;
   }

   /**
    * Sets the value of the allResourceAccessFlag property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setAllResourceAccessFlag(Boolean value)
   {
      this.allResourceAccessFlag = value;
   }

   /**
    * Gets the value of the assignmentStaffingPreference property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getAssignmentStaffingPreference()
   {
      return assignmentStaffingPreference;
   }

   /**
    * Sets the value of the assignmentStaffingPreference property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAssignmentStaffingPreference(String value)
   {
      this.assignmentStaffingPreference = value;
   }

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the currencyId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCurrencyId()
   {
      return currencyId;
   }

   /**
    * Sets the value of the currencyId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCurrencyId(String value)
   {
      this.currencyId = value;
   }

   /**
    * Gets the value of the currencyName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCurrencyName()
   {
      return currencyName;
   }

   /**
    * Sets the value of the currencyName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCurrencyName(String value)
   {
      this.currencyName = value;
   }

   /**
    * Gets the value of the currencyObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getCurrencyObjectId()
   {
      return currencyObjectId;
   }

   /**
    * Sets the value of the currencyObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setCurrencyObjectId(Integer value)
   {
      this.currencyObjectId = value;
   }

   /**
    * Gets the value of the emailAddress property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getEmailAddress()
   {
      return emailAddress;
   }

   /**
    * Sets the value of the emailAddress property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setEmailAddress(String value)
   {
      this.emailAddress = value;
   }

   /**
    * Gets the value of the emailProtocol property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getEmailProtocol()
   {
      return emailProtocol;
   }

   /**
    * Sets the value of the emailProtocol property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setEmailProtocol(String value)
   {
      this.emailProtocol = value;
   }

   /**
    * Gets the value of the enableUserToModifyViewSettingsFlag property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isEnableUserToModifyViewSettingsFlag()
   {
      return enableUserToModifyViewSettingsFlag;
   }

   /**
    * Sets the value of the enableUserToModifyViewSettingsFlag property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setEnableUserToModifyViewSettingsFlag(Boolean value)
   {
      this.enableUserToModifyViewSettingsFlag = value;
   }

   /**
    * Gets the value of the financialPeriodEndObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getFinancialPeriodEndObjectId()
   {
      return financialPeriodEndObjectId;
   }

   /**
    * Sets the value of the financialPeriodEndObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setFinancialPeriodEndObjectId(Integer value)
   {
      this.financialPeriodEndObjectId = value;
   }

   /**
    * Gets the value of the financialPeriodStartObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getFinancialPeriodStartObjectId()
   {
      return financialPeriodStartObjectId;
   }

   /**
    * Sets the value of the financialPeriodStartObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setFinancialPeriodStartObjectId(Integer value)
   {
      this.financialPeriodStartObjectId = value;
   }

   /**
    * Gets the value of the guid property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getGUID()
   {
      return guid;
   }

   /**
    * Sets the value of the guid property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setGUID(String value)
   {
      this.guid = value;
   }

   /**
    * Gets the value of the globalProfileObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getGlobalProfileObjectId()
   {
      return globalProfileObjectId;
   }

   /**
    * Sets the value of the globalProfileObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setGlobalProfileObjectId(Integer value)
   {
      this.globalProfileObjectId = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the mailServerLoginName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getMailServerLoginName()
   {
      return mailServerLoginName;
   }

   /**
    * Sets the value of the mailServerLoginName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setMailServerLoginName(String value)
   {
      this.mailServerLoginName = value;
   }

   /**
    * Gets the value of the name property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the newProjectDurationType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getNewProjectDurationType()
   {
      return newProjectDurationType;
   }

   /**
    * Sets the value of the newProjectDurationType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setNewProjectDurationType(String value)
   {
      this.newProjectDurationType = value;
   }

   /**
    * Gets the value of the objectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the officePhone property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOfficePhone()
   {
      return officePhone;
   }

   /**
    * Sets the value of the officePhone property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOfficePhone(String value)
   {
      this.officePhone = value;
   }

   /**
    * Gets the value of the outgoingMailServer property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOutgoingMailServer()
   {
      return outgoingMailServer;
   }

   /**
    * Sets the value of the outgoingMailServer property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOutgoingMailServer(String value)
   {
      this.outgoingMailServer = value;
   }

   /**
    * Gets the value of the personalName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPersonalName()
   {
      return personalName;
   }

   /**
    * Sets the value of the personalName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPersonalName(String value)
   {
      this.personalName = value;
   }

   /**
    * Gets the value of the rateSourcePreference property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRateSourcePreference()
   {
      return rateSourcePreference;
   }

   /**
    * Sets the value of the rateSourcePreference property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRateSourcePreference(String value)
   {
      this.rateSourcePreference = value;
   }

   /**
    * Gets the value of the reportingFlag property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isReportingFlag()
   {
      return reportingFlag;
   }

   /**
    * Sets the value of the reportingFlag property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setReportingFlag(Boolean value)
   {
      this.reportingFlag = value;
   }

   /**
    * Gets the value of the respectActivityDurationType property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isRespectActivityDurationType()
   {
      return respectActivityDurationType;
   }

   /**
    * Sets the value of the respectActivityDurationType property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setRespectActivityDurationType(Boolean value)
   {
      this.respectActivityDurationType = value;
   }

   /**
    * Gets the value of the roleLimitDisplayOption property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRoleLimitDisplayOption()
   {
      return roleLimitDisplayOption;
   }

   /**
    * Sets the value of the roleLimitDisplayOption property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRoleLimitDisplayOption(String value)
   {
      this.roleLimitDisplayOption = value;
   }

   /**
    * Gets the value of the teamMemberActivityFilters property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberActivityFilters()
   {
      return teamMemberActivityFilters;
   }

   /**
    * Sets the value of the teamMemberActivityFilters property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberActivityFilters(String value)
   {
      this.teamMemberActivityFilters = value;
   }

   /**
    * Gets the value of the teamMemberApplicationTheme property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberApplicationTheme()
   {
      return teamMemberApplicationTheme;
   }

   /**
    * Sets the value of the teamMemberApplicationTheme property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberApplicationTheme(String value)
   {
      this.teamMemberApplicationTheme = value;
   }

   /**
    * Gets the value of the teamMemberDateFormat property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberDateFormat()
   {
      return teamMemberDateFormat;
   }

   /**
    * Sets the value of the teamMemberDateFormat property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberDateFormat(String value)
   {
      this.teamMemberDateFormat = value;
   }

   /**
    * Gets the value of the teamMemberDisplayTimeFlag property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isTeamMemberDisplayTimeFlag()
   {
      return teamMemberDisplayTimeFlag;
   }

   /**
    * Sets the value of the teamMemberDisplayTimeFlag property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setTeamMemberDisplayTimeFlag(Boolean value)
   {
      this.teamMemberDisplayTimeFlag = value;
   }

   /**
    * Gets the value of the teamMemberDisplayTimeFormat property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberDisplayTimeFormat()
   {
      return teamMemberDisplayTimeFormat;
   }

   /**
    * Sets the value of the teamMemberDisplayTimeFormat property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberDisplayTimeFormat(String value)
   {
      this.teamMemberDisplayTimeFormat = value;
   }

   /**
    * Gets the value of the teamMemberLocale property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberLocale()
   {
      return teamMemberLocale;
   }

   /**
    * Sets the value of the teamMemberLocale property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberLocale(String value)
   {
      this.teamMemberLocale = value;
   }

   /**
    * Gets the value of the teamMemberProjectFilter property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberProjectFilter()
   {
      return teamMemberProjectFilter;
   }

   /**
    * Sets the value of the teamMemberProjectFilter property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberProjectFilter(String value)
   {
      this.teamMemberProjectFilter = value;
   }

   /**
    * Gets the value of the teamMemberTaskStatusFilter property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberTaskStatusFilter()
   {
      return teamMemberTaskStatusFilter;
   }

   /**
    * Sets the value of the teamMemberTaskStatusFilter property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberTaskStatusFilter(String value)
   {
      this.teamMemberTaskStatusFilter = value;
   }

   /**
    * Gets the value of the teamMemberTimeframeFilter property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberTimeframeFilter()
   {
      return teamMemberTimeframeFilter;
   }

   /**
    * Sets the value of the teamMemberTimeframeFilter property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberTimeframeFilter(String value)
   {
      this.teamMemberTimeframeFilter = value;
   }

   /**
    * Gets the value of the teamMemberWorkUnitType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTeamMemberWorkUnitType()
   {
      return teamMemberWorkUnitType;
   }

   /**
    * Sets the value of the teamMemberWorkUnitType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTeamMemberWorkUnitType(String value)
   {
      this.teamMemberWorkUnitType = value;
   }

   /**
    * Gets the value of the userInterfaceViewObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getUserInterfaceViewObjectId()
   {
      return userInterfaceViewObjectId;
   }

   /**
    * Sets the value of the userInterfaceViewObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setUserInterfaceViewObjectId(Integer value)
   {
      this.userInterfaceViewObjectId = value;
   }

   /**
    * Gets the value of the resourceRequests property.
    *
    * @return
    *     possible object is
    *     {@link UserType.ResourceRequests }
    *
    */
   public UserType.ResourceRequests getResourceRequests()
   {
      return resourceRequests;
   }

   /**
    * Sets the value of the resourceRequests property.
    *
    * @param value
    *     allowed object is
    *     {@link UserType.ResourceRequests }
    *
    */
   public void setResourceRequests(UserType.ResourceRequests value)
   {
      this.resourceRequests = value;
   }

   /**
    * <p>Java class for anonymous complex type.
    *
    * <p>The following schema fragment specifies the expected content contained within this class.
    *
    * <pre>
    * &lt;complexType>
    *   &lt;complexContent>
    *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
    *       &lt;sequence>
    *         &lt;element name="ResourceRequest" type="{http://xmlns.oracle.com/Primavera/P6/V8.3/API/BusinessObjects}ResourceRequestType" maxOccurs="unbounded" minOccurs="0"/>
    *       &lt;/sequence>
    *     &lt;/restriction>
    *   &lt;/complexContent>
    * &lt;/complexType>
    * </pre>
    *
    *
    */
   @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
   {
      "resourceRequest"
   }) public static class ResourceRequests
   {

      @XmlElement(name = "ResourceRequest") protected List<ResourceRequestType> resourceRequest;

      /**
       * Gets the value of the resourceRequest property.
       *
       * <p>
       * This accessor method returns a reference to the live list,
       * not a snapshot. Therefore any modification you make to the
       * returned list will be present inside the JAXB object.
       * This is why there is not a <CODE>set</CODE> method for the resourceRequest property.
       *
       * <p>
       * For example, to add a new item, do as follows:
       * <pre>
       *    getResourceRequest().add(newItem);
       * </pre>
       *
       *
       * <p>
       * Objects of the following type(s) are allowed in the list
       * {@link ResourceRequestType }
       *
       *
       */
      public List<ResourceRequestType> getResourceRequest()
      {
         if (resourceRequest == null)
         {
            resourceRequest = new ArrayList<ResourceRequestType>();
         }
         return this.resourceRequest;
      }

   }

}
