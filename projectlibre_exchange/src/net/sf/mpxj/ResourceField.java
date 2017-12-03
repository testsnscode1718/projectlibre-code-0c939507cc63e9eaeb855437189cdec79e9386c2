/*
 * file:       ResourceField.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2005
 * date:       26/04/2005
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

package net.sf.mpxj;

import java.util.EnumSet;
import java.util.Locale;

/**
 * Instances of this type represent Resource fields.
 */
public enum ResourceField implements FieldType
{
   START(DataType.DATE), // Must always be first value

   DURATION1_UNITS(DataType.TIME_UNITS),
   DURATION2_UNITS(DataType.TIME_UNITS),
   DURATION3_UNITS(DataType.TIME_UNITS),
   DURATION4_UNITS(DataType.TIME_UNITS),
   DURATION5_UNITS(DataType.TIME_UNITS),
   DURATION6_UNITS(DataType.TIME_UNITS),
   DURATION7_UNITS(DataType.TIME_UNITS),
   DURATION8_UNITS(DataType.TIME_UNITS),
   DURATION9_UNITS(DataType.TIME_UNITS),
   DURATION10_UNITS(DataType.TIME_UNITS),

   ID(DataType.INTEGER),
   NAME(DataType.STRING),
   INITIALS(DataType.STRING),
   GROUP(DataType.STRING),
   MAX_UNITS(DataType.UNITS),
   BASE_CALENDAR(DataType.STRING),
   STANDARD_RATE(DataType.RATE),
   OVERTIME_RATE(DataType.RATE),
   TEXT1(DataType.STRING),
   TEXT2(DataType.STRING),
   CODE(DataType.STRING),
   ACTUAL_COST(DataType.CURRENCY),
   COST(DataType.CURRENCY),
   WORK(DataType.WORK),
   ACTUAL_WORK(DataType.WORK),
   BASELINE_WORK(DataType.WORK),
   OVERTIME_WORK(DataType.WORK),
   BASELINE_COST(DataType.CURRENCY),
   COST_PER_USE(DataType.CURRENCY),
   ACCRUE_AT(DataType.ACCRUE),
   REMAINING_COST(DataType.CURRENCY),
   REMAINING_WORK(DataType.WORK),
   WORK_VARIANCE(DataType.DURATION),
   COST_VARIANCE(DataType.CURRENCY),
   OVERALLOCATED(DataType.BOOLEAN),
   PEAK(DataType.UNITS),
   UNIQUE_ID(DataType.INTEGER),
   NOTES(DataType.ASCII_STRING),
   PERCENT_WORK_COMPLETE(DataType.PERCENTAGE),
   TEXT3(DataType.STRING),
   TEXT4(DataType.STRING),
   TEXT5(DataType.STRING),
   OBJECTS(DataType.NUMERIC),
   LINKED_FIELDS(DataType.BOOLEAN),
   EMAIL_ADDRESS(DataType.STRING),
   REGULAR_WORK(DataType.WORK),
   ACTUAL_OVERTIME_WORK(DataType.WORK),
   REMAINING_OVERTIME_WORK(DataType.WORK),
   OVERTIME_COST(DataType.CURRENCY),
   ACTUAL_OVERTIME_COST(DataType.CURRENCY),
   REMAINING_OVERTIME_COST(DataType.CURRENCY),
   BCWS(DataType.NUMERIC),
   BCWP(DataType.NUMERIC),
   ACWP(DataType.NUMERIC),
   SV(DataType.NUMERIC),
   AVAILABLE_FROM(DataType.DATE),
   AVAILABLE_TO(DataType.DATE),
   INDICATORS(DataType.STRING),
   TEXT6(DataType.STRING),
   TEXT7(DataType.STRING),
   TEXT8(DataType.STRING),
   TEXT9(DataType.STRING),
   TEXT10(DataType.STRING),
   START1(DataType.DATE),
   START2(DataType.DATE),
   START3(DataType.DATE),
   START4(DataType.DATE),
   START5(DataType.DATE),
   FINISH1(DataType.DATE),
   FINISH2(DataType.DATE),
   FINISH3(DataType.DATE),
   FINISH4(DataType.DATE),
   FINISH5(DataType.DATE),
   NUMBER1(DataType.NUMERIC),
   NUMBER2(DataType.NUMERIC),
   NUMBER3(DataType.NUMERIC),
   NUMBER4(DataType.NUMERIC),
   NUMBER5(DataType.NUMERIC),
   DURATION1(DataType.DURATION, ResourceField.DURATION1_UNITS),
   DURATION2(DataType.DURATION, ResourceField.DURATION2_UNITS),
   DURATION3(DataType.DURATION, ResourceField.DURATION3_UNITS),
   COST1(DataType.CURRENCY),
   COST2(DataType.CURRENCY),
   COST3(DataType.CURRENCY),
   FLAG10(DataType.BOOLEAN),
   FLAG1(DataType.BOOLEAN),
   FLAG2(DataType.BOOLEAN),
   FLAG3(DataType.BOOLEAN),
   FLAG4(DataType.BOOLEAN),
   FLAG5(DataType.BOOLEAN),
   FLAG6(DataType.BOOLEAN),
   FLAG7(DataType.BOOLEAN),
   FLAG8(DataType.BOOLEAN),
   FLAG9(DataType.BOOLEAN),
   HYPERLINK(DataType.STRING),
   HYPERLINK_ADDRESS(DataType.STRING),
   HYPERLINK_SUBADDRESS(DataType.STRING),
   HYPERLINK_HREF(DataType.STRING),
   ASSIGNMENT(DataType.STRING),
   TASK_SUMMARY_NAME(DataType.STRING),
   CAN_LEVEL(DataType.BOOLEAN),
   WORK_CONTOUR(DataType.STRING),
   COST4(DataType.CURRENCY),
   COST5(DataType.CURRENCY),
   COST6(DataType.CURRENCY),
   COST7(DataType.CURRENCY),
   COST8(DataType.CURRENCY),
   COST9(DataType.CURRENCY),
   COST10(DataType.CURRENCY),
   DATE1(DataType.DATE),
   DATE2(DataType.DATE),
   DATE3(DataType.DATE),
   DATE4(DataType.DATE),
   DATE5(DataType.DATE),
   DATE6(DataType.DATE),
   DATE7(DataType.DATE),
   DATE8(DataType.DATE),
   DATE9(DataType.DATE),
   DATE10(DataType.DATE),
   DURATION4(DataType.DURATION, ResourceField.DURATION4_UNITS),
   DURATION5(DataType.DURATION, ResourceField.DURATION5_UNITS),
   DURATION6(DataType.DURATION, ResourceField.DURATION6_UNITS),
   DURATION7(DataType.DURATION, ResourceField.DURATION7_UNITS),
   DURATION8(DataType.DURATION, ResourceField.DURATION8_UNITS),
   DURATION9(DataType.DURATION, ResourceField.DURATION9_UNITS),
   DURATION10(DataType.DURATION, ResourceField.DURATION10_UNITS),
   FINISH6(DataType.DATE),
   FINISH7(DataType.DATE),
   FINISH8(DataType.DATE),
   FINISH9(DataType.DATE),
   FINISH10(DataType.DATE),
   FLAG11(DataType.BOOLEAN),
   FLAG12(DataType.BOOLEAN),
   FLAG13(DataType.BOOLEAN),
   FLAG14(DataType.BOOLEAN),
   FLAG15(DataType.BOOLEAN),
   FLAG16(DataType.BOOLEAN),
   FLAG17(DataType.BOOLEAN),
   FLAG18(DataType.BOOLEAN),
   FLAG19(DataType.BOOLEAN),
   FLAG20(DataType.BOOLEAN),
   NUMBER6(DataType.NUMERIC),
   NUMBER7(DataType.NUMERIC),
   NUMBER8(DataType.NUMERIC),
   NUMBER9(DataType.NUMERIC),
   NUMBER10(DataType.NUMERIC),
   NUMBER11(DataType.NUMERIC),
   NUMBER12(DataType.NUMERIC),
   NUMBER13(DataType.NUMERIC),
   NUMBER14(DataType.NUMERIC),
   NUMBER15(DataType.NUMERIC),
   NUMBER16(DataType.NUMERIC),
   NUMBER17(DataType.NUMERIC),
   NUMBER18(DataType.NUMERIC),
   NUMBER19(DataType.NUMERIC),
   NUMBER20(DataType.NUMERIC),
   START6(DataType.DATE),
   START7(DataType.DATE),
   START8(DataType.DATE),
   START9(DataType.DATE),
   START10(DataType.DATE),
   TEXT11(DataType.STRING),
   TEXT12(DataType.STRING),
   TEXT13(DataType.STRING),
   TEXT14(DataType.STRING),
   TEXT15(DataType.STRING),
   TEXT16(DataType.STRING),
   TEXT17(DataType.STRING),
   TEXT18(DataType.STRING),
   TEXT19(DataType.STRING),
   TEXT20(DataType.STRING),
   TEXT21(DataType.STRING),
   TEXT22(DataType.STRING),
   TEXT23(DataType.STRING),
   TEXT24(DataType.STRING),
   TEXT25(DataType.STRING),
   TEXT26(DataType.STRING),
   TEXT27(DataType.STRING),
   TEXT28(DataType.STRING),
   TEXT29(DataType.STRING),
   TEXT30(DataType.STRING),
   PHONETICS(DataType.STRING),
   ASSIGNMENT_DELAY(DataType.STRING),
   ASSIGNMENT_UNITS(DataType.STRING),
   BASELINE_START(DataType.DATE),
   BASELINE_FINISH(DataType.DATE),
   CONFIRMED(DataType.BOOLEAN),

   LEVELING_DELAY(DataType.STRING),
   RESPONSE_PENDING(DataType.BOOLEAN),

   TEAMSTATUS_PENDING(DataType.BOOLEAN),
   CV(DataType.NUMERIC),
   UPDATE_NEEDED(DataType.BOOLEAN),
   COST_RATE_TABLE(DataType.STRING),
   ACTUAL_START(DataType.DATE),
   ACTUAL_FINISH(DataType.DATE),
   WORKGROUP(DataType.WORKGROUP),
   PROJECT(DataType.STRING),
   OUTLINE_CODE1(DataType.STRING),
   OUTLINE_CODE2(DataType.STRING),
   OUTLINE_CODE3(DataType.STRING),
   OUTLINE_CODE4(DataType.STRING),
   OUTLINE_CODE5(DataType.STRING),
   OUTLINE_CODE6(DataType.STRING),
   OUTLINE_CODE7(DataType.STRING),
   OUTLINE_CODE8(DataType.STRING),
   OUTLINE_CODE9(DataType.STRING),
   OUTLINE_CODE10(DataType.STRING),
   MATERIAL_LABEL(DataType.STRING),
   TYPE(DataType.RESOURCE_TYPE),
   VAC(DataType.CURRENCY),
   GROUP_BY_SUMMARY(DataType.STRING),
   WINDOWS_USER_ACCOUNT(DataType.STRING),
   BASELINE1_WORK(DataType.WORK),
   BASELINE1_COST(DataType.CURRENCY),
   BASELINE2_WORK(DataType.WORK),
   BASELINE2_COST(DataType.CURRENCY),
   BASELINE3_WORK(DataType.WORK),
   BASELINE3_COST(DataType.CURRENCY),
   BASELINE4_WORK(DataType.WORK),
   BASELINE4_COST(DataType.CURRENCY),
   BASELINE5_WORK(DataType.WORK),
   BASELINE5_COST(DataType.CURRENCY),
   BASELINE6_WORK(DataType.WORK),
   BASELINE6_COST(DataType.CURRENCY),
   BASELINE7_WORK(DataType.WORK),
   BASELINE7_COST(DataType.CURRENCY),
   BASELINE8_WORK(DataType.WORK),
   BASELINE8_COST(DataType.CURRENCY),
   BASELINE9_WORK(DataType.WORK),
   BASELINE9_COST(DataType.CURRENCY),
   BASELINE10_WORK(DataType.WORK),
   BASELINE10_COST(DataType.CURRENCY),
   ENTERPRISE_COST1(DataType.CURRENCY),
   ENTERPRISE_COST2(DataType.CURRENCY),
   ENTERPRISE_COST3(DataType.CURRENCY),
   ENTERPRISE_COST4(DataType.CURRENCY),
   ENTERPRISE_COST5(DataType.CURRENCY),
   ENTERPRISE_COST6(DataType.CURRENCY),
   ENTERPRISE_COST7(DataType.CURRENCY),
   ENTERPRISE_COST8(DataType.CURRENCY),
   ENTERPRISE_COST9(DataType.CURRENCY),
   ENTERPRISE_COST10(DataType.CURRENCY),
   ENTERPRISE_DATE1(DataType.DATE),
   ENTERPRISE_DATE2(DataType.DATE),
   ENTERPRISE_DATE3(DataType.DATE),
   ENTERPRISE_DATE4(DataType.DATE),
   ENTERPRISE_DATE5(DataType.DATE),
   ENTERPRISE_DATE6(DataType.DATE),
   ENTERPRISE_DATE7(DataType.DATE),
   ENTERPRISE_DATE8(DataType.DATE),
   ENTERPRISE_DATE9(DataType.DATE),
   ENTERPRISE_DATE10(DataType.DATE),
   ENTERPRISE_DATE11(DataType.DATE),
   ENTERPRISE_DATE12(DataType.DATE),
   ENTERPRISE_DATE13(DataType.DATE),
   ENTERPRISE_DATE14(DataType.DATE),
   ENTERPRISE_DATE15(DataType.DATE),
   ENTERPRISE_DATE16(DataType.DATE),
   ENTERPRISE_DATE17(DataType.DATE),
   ENTERPRISE_DATE18(DataType.DATE),
   ENTERPRISE_DATE19(DataType.DATE),
   ENTERPRISE_DATE20(DataType.DATE),
   ENTERPRISE_DATE21(DataType.DATE),
   ENTERPRISE_DATE22(DataType.DATE),
   ENTERPRISE_DATE23(DataType.DATE),
   ENTERPRISE_DATE24(DataType.DATE),
   ENTERPRISE_DATE25(DataType.DATE),
   ENTERPRISE_DATE26(DataType.DATE),
   ENTERPRISE_DATE27(DataType.DATE),
   ENTERPRISE_DATE28(DataType.DATE),
   ENTERPRISE_DATE29(DataType.DATE),
   ENTERPRISE_DATE30(DataType.DATE),
   ENTERPRISE_DURATION1_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION2_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION3_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION4_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION5_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION6_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION7_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION8_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION9_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION10_UNITS(DataType.TIME_UNITS),
   ENTERPRISE_DURATION1(DataType.DURATION, ENTERPRISE_DURATION1_UNITS),
   ENTERPRISE_DURATION2(DataType.DURATION, ENTERPRISE_DURATION2_UNITS),
   ENTERPRISE_DURATION3(DataType.DURATION, ENTERPRISE_DURATION3_UNITS),
   ENTERPRISE_DURATION4(DataType.DURATION, ENTERPRISE_DURATION4_UNITS),
   ENTERPRISE_DURATION5(DataType.DURATION, ENTERPRISE_DURATION5_UNITS),
   ENTERPRISE_DURATION6(DataType.DURATION, ENTERPRISE_DURATION6_UNITS),
   ENTERPRISE_DURATION7(DataType.DURATION, ENTERPRISE_DURATION7_UNITS),
   ENTERPRISE_DURATION8(DataType.DURATION, ENTERPRISE_DURATION8_UNITS),
   ENTERPRISE_DURATION9(DataType.DURATION, ENTERPRISE_DURATION9_UNITS),
   ENTERPRISE_DURATION10(DataType.DURATION, ENTERPRISE_DURATION10_UNITS),
   ENTERPRISE_FLAG1(DataType.BOOLEAN),
   ENTERPRISE_FLAG2(DataType.BOOLEAN),
   ENTERPRISE_FLAG3(DataType.BOOLEAN),
   ENTERPRISE_FLAG4(DataType.BOOLEAN),
   ENTERPRISE_FLAG5(DataType.BOOLEAN),
   ENTERPRISE_FLAG6(DataType.BOOLEAN),
   ENTERPRISE_FLAG7(DataType.BOOLEAN),
   ENTERPRISE_FLAG8(DataType.BOOLEAN),
   ENTERPRISE_FLAG9(DataType.BOOLEAN),
   ENTERPRISE_FLAG10(DataType.BOOLEAN),
   ENTERPRISE_FLAG11(DataType.BOOLEAN),
   ENTERPRISE_FLAG12(DataType.BOOLEAN),
   ENTERPRISE_FLAG13(DataType.BOOLEAN),
   ENTERPRISE_FLAG14(DataType.BOOLEAN),
   ENTERPRISE_FLAG15(DataType.BOOLEAN),
   ENTERPRISE_FLAG16(DataType.BOOLEAN),
   ENTERPRISE_FLAG17(DataType.BOOLEAN),
   ENTERPRISE_FLAG18(DataType.BOOLEAN),
   ENTERPRISE_FLAG19(DataType.BOOLEAN),
   ENTERPRISE_FLAG20(DataType.BOOLEAN),
   ENTERPRISE_NUMBER1(DataType.NUMERIC),
   ENTERPRISE_NUMBER2(DataType.NUMERIC),
   ENTERPRISE_NUMBER3(DataType.NUMERIC),
   ENTERPRISE_NUMBER4(DataType.NUMERIC),
   ENTERPRISE_NUMBER5(DataType.NUMERIC),
   ENTERPRISE_NUMBER6(DataType.NUMERIC),
   ENTERPRISE_NUMBER7(DataType.NUMERIC),
   ENTERPRISE_NUMBER8(DataType.NUMERIC),
   ENTERPRISE_NUMBER9(DataType.NUMERIC),
   ENTERPRISE_NUMBER10(DataType.NUMERIC),
   ENTERPRISE_NUMBER11(DataType.NUMERIC),
   ENTERPRISE_NUMBER12(DataType.NUMERIC),
   ENTERPRISE_NUMBER13(DataType.NUMERIC),
   ENTERPRISE_NUMBER14(DataType.NUMERIC),
   ENTERPRISE_NUMBER15(DataType.NUMERIC),
   ENTERPRISE_NUMBER16(DataType.NUMERIC),
   ENTERPRISE_NUMBER17(DataType.NUMERIC),
   ENTERPRISE_NUMBER18(DataType.NUMERIC),
   ENTERPRISE_NUMBER19(DataType.NUMERIC),
   ENTERPRISE_NUMBER20(DataType.NUMERIC),
   ENTERPRISE_NUMBER21(DataType.NUMERIC),
   ENTERPRISE_NUMBER22(DataType.NUMERIC),
   ENTERPRISE_NUMBER23(DataType.NUMERIC),
   ENTERPRISE_NUMBER24(DataType.NUMERIC),
   ENTERPRISE_NUMBER25(DataType.NUMERIC),
   ENTERPRISE_NUMBER26(DataType.NUMERIC),
   ENTERPRISE_NUMBER27(DataType.NUMERIC),
   ENTERPRISE_NUMBER28(DataType.NUMERIC),
   ENTERPRISE_NUMBER29(DataType.NUMERIC),
   ENTERPRISE_NUMBER30(DataType.NUMERIC),
   ENTERPRISE_NUMBER31(DataType.NUMERIC),
   ENTERPRISE_NUMBER32(DataType.NUMERIC),
   ENTERPRISE_NUMBER33(DataType.NUMERIC),
   ENTERPRISE_NUMBER34(DataType.NUMERIC),
   ENTERPRISE_NUMBER35(DataType.NUMERIC),
   ENTERPRISE_NUMBER36(DataType.NUMERIC),
   ENTERPRISE_NUMBER37(DataType.NUMERIC),
   ENTERPRISE_NUMBER38(DataType.NUMERIC),
   ENTERPRISE_NUMBER39(DataType.NUMERIC),
   ENTERPRISE_NUMBER40(DataType.NUMERIC),
   ENTERPRISE_TEXT1(DataType.STRING),
   ENTERPRISE_TEXT2(DataType.STRING),
   ENTERPRISE_TEXT3(DataType.STRING),
   ENTERPRISE_TEXT4(DataType.STRING),
   ENTERPRISE_TEXT5(DataType.STRING),
   ENTERPRISE_TEXT6(DataType.STRING),
   ENTERPRISE_TEXT7(DataType.STRING),
   ENTERPRISE_TEXT8(DataType.STRING),
   ENTERPRISE_TEXT9(DataType.STRING),
   ENTERPRISE_TEXT10(DataType.STRING),
   ENTERPRISE_TEXT11(DataType.STRING),
   ENTERPRISE_TEXT12(DataType.STRING),
   ENTERPRISE_TEXT13(DataType.STRING),
   ENTERPRISE_TEXT14(DataType.STRING),
   ENTERPRISE_TEXT15(DataType.STRING),
   ENTERPRISE_TEXT16(DataType.STRING),
   ENTERPRISE_TEXT17(DataType.STRING),
   ENTERPRISE_TEXT18(DataType.STRING),
   ENTERPRISE_TEXT19(DataType.STRING),
   ENTERPRISE_TEXT20(DataType.STRING),
   ENTERPRISE_TEXT21(DataType.STRING),
   ENTERPRISE_TEXT22(DataType.STRING),
   ENTERPRISE_TEXT23(DataType.STRING),
   ENTERPRISE_TEXT24(DataType.STRING),
   ENTERPRISE_TEXT25(DataType.STRING),
   ENTERPRISE_TEXT26(DataType.STRING),
   ENTERPRISE_TEXT27(DataType.STRING),
   ENTERPRISE_TEXT28(DataType.STRING),
   ENTERPRISE_TEXT29(DataType.STRING),
   ENTERPRISE_TEXT30(DataType.STRING),
   ENTERPRISE_TEXT31(DataType.STRING),
   ENTERPRISE_TEXT32(DataType.STRING),
   ENTERPRISE_TEXT33(DataType.STRING),
   ENTERPRISE_TEXT34(DataType.STRING),
   ENTERPRISE_TEXT35(DataType.STRING),
   ENTERPRISE_TEXT36(DataType.STRING),
   ENTERPRISE_TEXT37(DataType.STRING),
   ENTERPRISE_TEXT38(DataType.STRING),
   ENTERPRISE_TEXT39(DataType.STRING),
   ENTERPRISE_TEXT40(DataType.STRING),
   ENTERPRISE(DataType.BOOLEAN),
   IMPORT(DataType.BOOLEAN),
   CREATED(DataType.DATE),
   BUDGET(DataType.BOOLEAN),
   TASK_OUTLINE_NUMBER(DataType.STRING),
   GUID(DataType.GUID),

   ACTIVE(DataType.BOOLEAN),
   ASSIGNMENT_OWNER(DataType.STRING),
   BASELINE_BUDGET_COST(DataType.CURRENCY),
   BASELINE_BUDGET_WORK(DataType.WORK),

   BASELINE1_BUDGET_COST(DataType.CURRENCY),
   BASELINE1_BUDGET_WORK(DataType.WORK),
   BASELINE1_FINISH(DataType.DATE),
   BASELINE1_START(DataType.DATE),

   BASELINE2_BUDGET_COST(DataType.CURRENCY),
   BASELINE2_BUDGET_WORK(DataType.WORK),
   BASELINE2_FINISH(DataType.DATE),
   BASELINE2_START(DataType.DATE),

   BASELINE3_BUDGET_COST(DataType.CURRENCY),
   BASELINE3_BUDGET_WORK(DataType.WORK),
   BASELINE3_FINISH(DataType.DATE),
   BASELINE3_START(DataType.DATE),

   BASELINE4_BUDGET_COST(DataType.CURRENCY),
   BASELINE4_BUDGET_WORK(DataType.WORK),
   BASELINE4_FINISH(DataType.DATE),
   BASELINE4_START(DataType.DATE),

   BASELINE5_BUDGET_COST(DataType.CURRENCY),
   BASELINE5_BUDGET_WORK(DataType.WORK),
   BASELINE5_FINISH(DataType.DATE),
   BASELINE5_START(DataType.DATE),

   BASELINE6_BUDGET_COST(DataType.CURRENCY),
   BASELINE6_BUDGET_WORK(DataType.WORK),
   BASELINE6_FINISH(DataType.DATE),
   BASELINE6_START(DataType.DATE),

   BASELINE7_BUDGET_COST(DataType.CURRENCY),
   BASELINE7_BUDGET_WORK(DataType.WORK),
   BASELINE7_FINISH(DataType.DATE),
   BASELINE7_START(DataType.DATE),

   BASELINE8_BUDGET_COST(DataType.CURRENCY),
   BASELINE8_BUDGET_WORK(DataType.WORK),
   BASELINE8_FINISH(DataType.DATE),
   BASELINE8_START(DataType.DATE),

   BASELINE9_BUDGET_COST(DataType.CURRENCY),
   BASELINE9_BUDGET_WORK(DataType.WORK),
   BASELINE9_FINISH(DataType.DATE),
   BASELINE9_START(DataType.DATE),

   BASELINE10_BUDGET_COST(DataType.CURRENCY),
   BASELINE10_BUDGET_WORK(DataType.WORK),
   BASELINE10_FINISH(DataType.DATE),
   BASELINE10_START(DataType.DATE),

   BOOKING_TYPE(DataType.BOOKING_TYPE),
   BUDGET_COST(DataType.CURRENCY),
   BUDGET_WORK(DataType.WORK),
   CALENDAR_GUID(DataType.GUID),
   COST_CENTER(DataType.STRING),
   DEFAULT_ASSIGNMENT_OWNER(DataType.STRING),
   ENTERPRISE_BASE_CALENDAR(DataType.STRING),
   ENTERPRISE_REQUIRED_VALUES(DataType.STRING),
   ENTERPRISE_TEAM_MEMBER(DataType.STRING),
   ENTERPRISE_UNIQUE_ID(DataType.INTEGER),
   ERROR_MESSAGE(DataType.STRING),
   GENERIC(DataType.BOOLEAN),
   INACTIVE(DataType.BOOLEAN),
   REQUEST_DEMAND(DataType.STRING),
   SUMMARY(DataType.STRING),
   TEAM_ASSIGNMENT_POOL(DataType.BOOLEAN),
   WBS(DataType.STRING),
   UNAVAILABLE(DataType.STRING), // Dummy entry
   SUBPROJECT_RESOURCE_UNIQUE_ID(DataType.INTEGER),
   HYPERLINK_DATA(DataType.BINARY),
   OUTLINE_CODE1_INDEX(DataType.INTEGER),
   OUTLINE_CODE2_INDEX(DataType.INTEGER),
   OUTLINE_CODE3_INDEX(DataType.INTEGER),
   OUTLINE_CODE4_INDEX(DataType.INTEGER),
   OUTLINE_CODE5_INDEX(DataType.INTEGER),
   OUTLINE_CODE6_INDEX(DataType.INTEGER),
   OUTLINE_CODE7_INDEX(DataType.INTEGER),
   OUTLINE_CODE8_INDEX(DataType.INTEGER),
   OUTLINE_CODE9_INDEX(DataType.INTEGER),
   OUTLINE_CODE10_INDEX(DataType.INTEGER),
   COST_RATE_A(DataType.BINARY),
   COST_RATE_B(DataType.BINARY),
   COST_RATE_C(DataType.BINARY),
   COST_RATE_D(DataType.BINARY),
   COST_RATE_E(DataType.BINARY),
   AVAILABILITY_DATA(DataType.BINARY),
   ENTERPRISE_DATA(DataType.BINARY),
   OVERTIME_RATE_UNITS(DataType.RATE_UNITS),
   STANDARD_RATE_UNITS(DataType.RATE_UNITS),

   INDEX(DataType.INTEGER),
   HYPERLINK_SCREEN_TIP(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE1(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE2(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE3(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE4(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE5(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE6(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE7(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE8(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE9(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE10(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE11(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE12(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE13(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE14(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE15(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE16(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE17(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE18(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE19(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE20(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE21(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE22(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE23(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE24(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE25(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE26(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE27(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE28(DataType.STRING),
   ENTERPRISE_OUTLINE_CODE29(DataType.STRING),
   ENTERPRISE_RBS(DataType.STRING),
   ENTERPRISE_NAME_USED(DataType.STRING),
   ENTERPRISE_IS_CHECKED_OUT(DataType.BOOLEAN),
   ENTERPRISE_CHECKED_OUT_BY(DataType.STRING),
   ENTERPRISE_LAST_MODIFIED_DATE(DataType.DATE),
   ENTERPRISE_MULTI_VALUE20(DataType.STRING),
   ENTERPRISE_MULTI_VALUE21(DataType.STRING),
   ENTERPRISE_MULTI_VALUE22(DataType.STRING),
   ENTERPRISE_MULTI_VALUE23(DataType.STRING),
   ENTERPRISE_MULTI_VALUE24(DataType.STRING),
   ENTERPRISE_MULTI_VALUE25(DataType.STRING),
   ENTERPRISE_MULTI_VALUE26(DataType.STRING),
   ENTERPRISE_MULTI_VALUE27(DataType.STRING),
   ENTERPRISE_MULTI_VALUE28(DataType.STRING),
   ENTERPRISE_MULTI_VALUE29(DataType.STRING),
   ACTUAL_WORK_PROTECTED(DataType.WORK),
   ACTUAL_OVERTIME_WORK_PROTECTED(DataType.WORK),
   PARENT_ID(DataType.INTEGER),

   // KEEP THESE TOGETHER AND IN ORDER
   ENTERPRISE_CUSTOM_FIELD1(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD2(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD3(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD4(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD5(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD6(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD7(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD8(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD9(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD10(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD11(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD12(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD13(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD14(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD15(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD16(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD17(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD18(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD19(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD20(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD21(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD22(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD23(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD24(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD25(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD26(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD27(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD28(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD29(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD30(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD31(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD32(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD33(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD34(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD35(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD36(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD37(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD38(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD39(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD40(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD41(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD42(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD43(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD44(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD45(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD46(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD47(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD48(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD49(DataType.STRING),
   ENTERPRISE_CUSTOM_FIELD50(DataType.STRING),
   // KEEP THESE TOGETHER AND IN ORDER

   FINISH(DataType.DATE); // Must always be last value

   /**
    * Constructor.
    *
    * @param dataType field data type
    * @param unitsType units type
    */
   private ResourceField(DataType dataType, FieldType unitsType)
   {
      m_dataType = dataType;
      m_unitsType = unitsType;
   }

   /**
    * Constructor.
    *
    * @param dataType field data type
    */
   private ResourceField(DataType dataType)
   {
      this(dataType, null);
   }

   /**
    * {@inheritDoc}
    */
   @Override public FieldTypeClass getFieldTypeClass()
   {
      return FieldTypeClass.RESOURCE;
   }

   /**
    * {@inheritDoc}
    */
   @Override public String getName()
   {
      return (getName(Locale.ENGLISH));
   }

   /**
    * {@inheritDoc}
    */
   @Override public String getName(Locale locale)
   {
      String[] titles = LocaleData.getStringArray(locale, LocaleData.RESOURCE_COLUMNS);
      String result = null;

      if (m_value >= 0 && m_value < titles.length)
      {
         result = titles[m_value];
      }

      return (result);
   }

   /**
    * {@inheritDoc}
    */
   @Override public int getValue()
   {
      return (m_value);
   }

   /**
    * {@inheritDoc}
    */
   @Override public DataType getDataType()
   {
      return (m_dataType);
   }

   /**
    * {@inheritDoc}
    */
   @Override public FieldType getUnitsType()
   {
      return m_unitsType;
   }

   /**
    * Retrieves the string representation of this instance.
    *
    * @return string representation
    */
   @Override public String toString()
   {
      return (getName());
   }

   /**
    * This method takes the integer enumeration of a resource field
    * and returns an appropriate class instance.
    *
    * @param type integer resource field enumeration
    * @return ResourceField instance
    */
   public static ResourceField getInstance(int type)
   {
      ResourceField result = null;

      if (type >= 0 && type < MAX_VALUE)
      {
         result = TYPE_VALUES[type];
      }

      return (result);
   }

   public static final int MAX_VALUE = EnumSet.allOf(ResourceField.class).size();
   private static final ResourceField[] TYPE_VALUES = new ResourceField[MAX_VALUE];
   static
   {
      int value = 0;
      for (ResourceField e : EnumSet.allOf(ResourceField.class))
      {
         e.m_value = value++;
         TYPE_VALUES[e.getValue()] = e;
      }
   }

   private int m_value;
   private DataType m_dataType;
   private FieldType m_unitsType;
}
