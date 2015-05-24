package com.gettasks.app;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class InfoParser {
	
	private InfoParsedListener infoParsedListener;
	
	public InfoParser(InfoParsedListener infoParsedListener) {
		this.infoParsedListener = infoParsedListener;
	}
	
	public void parseInfo(String responseString) {
		JSONArray responseArray = (JSONArray) JSONValue.parse(responseString);
		List<TaskEntity> tasksList = new ArrayList<>();
		for (int i = 0; i < responseArray.size(); i++) {
			JSONObject respObj = (JSONObject) responseArray.get(i);
			TaskEntity task = new TaskEntity();
			
			if (respObj.containsKey(TaskEntity.ACTUAL_END_DATE)) {
				task.setActualEndDate(String.valueOf(respObj.get(TaskEntity.ACTUAL_END_DATE)));
			}
			if (respObj.containsKey(TaskEntity.ACTUAL_START_DATE)) {
				task.setActualStartDate(String.valueOf(respObj.get(TaskEntity.ACTUAL_START_DATE)));
			}
			if (respObj.containsKey(TaskEntity.ASSIGNEE_ID)) {
				task.setAssigneeId(String.valueOf(respObj.get(TaskEntity.ASSIGNEE_ID)));
			}
			if (respObj.containsKey(TaskEntity.ASSIGNEE_UNIT_ID)) {
				task.setAssigneeUnitId(String.valueOf(respObj.get(TaskEntity.ASSIGNEE_UNIT_ID)));
			}
			if (respObj.containsKey(TaskEntity.BRAND_ID)) {
				task.setBrandId(String.valueOf(respObj.get(TaskEntity.BRAND_ID)));
			}
			if (respObj.containsKey(TaskEntity.CARRIER_ID)) {
				task.setCarrierId(String.valueOf(respObj.get(TaskEntity.CARRIER_ID)));
			}
			if (respObj.containsKey(TaskEntity.CREATION_DATE)) {
				task.setCreationDate(String.valueOf(respObj.get(TaskEntity.CREATION_DATE)));
			}
			if (respObj.containsKey(TaskEntity.EXECUTOR_ID)) {
				task.setExecutorId(String.valueOf(respObj.get(TaskEntity.EXECUTOR_ID)));
			}
			if (respObj.containsKey(TaskEntity.EXECUTOR_UNIT_ID)) {
				task.setExecutorUnitId(String.valueOf(respObj.get(TaskEntity.EXECUTOR_UNIT_ID)));
			}
			if (respObj.containsKey(TaskEntity.FIRST_DRIVER_ID)) {
				task.setFirstDriverId(String.valueOf(respObj.get(TaskEntity.FIRST_DRIVER_ID)));
			}
			if (respObj.containsKey(TaskEntity.FROM_UNIT_ID)) {
				task.setFromUnitId(String.valueOf(respObj.get(TaskEntity.FROM_UNIT_ID)));
			}
			if (respObj.containsKey(TaskEntity.FROM_USER_ID)) {
				task.setFromUserId(String.valueOf(respObj.get(TaskEntity.FROM_USER_ID)));
			}
			if (respObj.containsKey(TaskEntity.GAS_AMOUNT)) {
				if (respObj.get(TaskEntity.GAS_AMOUNT) != null) {
					task.setGasAmount(Double.parseDouble(String.valueOf(respObj.get(TaskEntity.GAS_AMOUNT))));
				}
			}
			if (respObj.containsKey(TaskEntity.GROUP_TASK_ID)) {
				task.setGroupTaskId(String.valueOf(respObj.get(TaskEntity.GROUP_TASK_ID)));
			}
			if (respObj.containsKey(TaskEntity.ID)) {
				if (respObj.get(TaskEntity.ID) != null) {
					task.setId(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.ID))));
				}
			}
			if (respObj.containsKey(TaskEntity.IMPLEMENTATION_TYPE_ID)) {
				if (respObj.get(TaskEntity.IMPLEMENTATION_TYPE_ID) != null) {
					task.setImplementationTypeId(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.IMPLEMENTATION_TYPE_ID))));
				}
			}
			if (respObj.containsKey(TaskEntity.INT_ROW_VER)) {
				if (respObj.get(TaskEntity.INT_ROW_VER) != null) {
					task.setIntRowVer(Long.parseLong(String.valueOf(respObj.get(TaskEntity.INT_ROW_VER))));
				}
			}
			if (respObj.containsKey(TaskEntity.IS_GROUP)) {
				if (respObj.get(TaskEntity.IS_GROUP) != null) {
					task.setGroup(Boolean.parseBoolean(String.valueOf(respObj.get(TaskEntity.IS_GROUP))));
				}
			}
			if (respObj.containsKey(TaskEntity.IS_IN_TRAFFIC)) {
				task.setIsInTraffic(String.valueOf(respObj.get(TaskEntity.IS_IN_TRAFFIC)));
			}
			if (respObj.containsKey(TaskEntity.KIND_ID)) {
				if (respObj.get(TaskEntity.KIND_ID) != null) {
					task.setKindId(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.KIND_ID))));
				}
			}
			if (respObj.containsKey(TaskEntity.MODEL_CODE_ID)) {
				task.setModelCodeId(String.valueOf(respObj.get(TaskEntity.MODEL_CODE_ID)));
			}
			if (respObj.containsKey(TaskEntity.NUMBER)) {
				task.setNumber(String.valueOf(respObj.get(TaskEntity.NUMBER)));
			}
			if (respObj.containsKey(TaskEntity.PLANNED_END_DATE)) {
				task.setPlannedEndDate(String.valueOf(respObj.get(TaskEntity.PLANNED_END_DATE)));
			}
			if (respObj.containsKey(TaskEntity.PLANNED_START_DATE)) {
				task.setPlannedStartDate(String.valueOf(respObj.get(TaskEntity.PLANNED_START_DATE)));
			}
			if (respObj.containsKey(TaskEntity.SECOND_DRIVER_ID)) {
				task.setSecondDriverId(String.valueOf(respObj.get(TaskEntity.SECOND_DRIVER_ID)));
			}
			if (respObj.containsKey(TaskEntity.SHIPPING_AGENT_ID)) {
				task.setShippingAgentId(String.valueOf(respObj.get(TaskEntity.SHIPPING_AGENT_ID)));
			}
			if (respObj.containsKey(TaskEntity.SIGN_UNIT_ID)) {
				task.setSignUnitId(String.valueOf(respObj.get(TaskEntity.SIGN_UNIT_ID)));
			}
			if (respObj.containsKey(TaskEntity.SIGN_USER_ID)) {
				task.setSignUserId(String.valueOf(respObj.get(TaskEntity.SIGN_USER_ID)));
			}
			if (respObj.containsKey(TaskEntity.SPEEDOMETER)) {
				if (respObj.get(TaskEntity.SPEEDOMETER) != null) {
					task.setSpeedometer(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.SPEEDOMETER))));
				}
			}
			if (respObj.containsKey(TaskEntity.STATE_ID)) {
				if (respObj.get(TaskEntity.STATE_ID) != null) {
					task.setStateId(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.STATE_ID))));
				}
			}
			if (respObj.containsKey(TaskEntity.STATE_NUMBER)) {
				task.setStateNumber(String.valueOf(respObj.get(TaskEntity.STATE_NUMBER)));
			}
			if (respObj.containsKey(TaskEntity.SURVEY_POINT_ID)) {
				task.setSurveyPointId(String.valueOf(respObj.get(TaskEntity.SURVEY_POINT_ID)));
			}
			if (respObj.containsKey(TaskEntity.TO_UNIT_ID)) {
				task.setToUnitId(String.valueOf(respObj.get(TaskEntity.TO_UNIT_ID)));
			}
			if (respObj.containsKey(TaskEntity.TO_USER_ID)) {
				task.setToUserId(String.valueOf(respObj.get(TaskEntity.TO_USER_ID)));
			}
			if (respObj.containsKey(TaskEntity.TRANSPORT_ID)) {
				if (respObj.get(TaskEntity.TRANSPORT_ID) != null) {
					task.setTransportId(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.TRANSPORT_ID))));
				}
			}
			if (respObj.containsKey(TaskEntity.TRANSPORTATION_TYPE_ID)) {
				if (respObj.get(TaskEntity.TRANSPORTATION_TYPE_ID) != null) {
					task.setTransportationTypeId(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.TRANSPORTATION_TYPE_ID))));
				}
			}
			if (respObj.containsKey(TaskEntity.TYPE_ID)) {
				if (respObj.get(TaskEntity.TYPE_ID) != null) {
					task.setTypeId(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.TYPE_ID))));
				}
			}
			if (respObj.containsKey(TaskEntity.VEHICLE_POSITION)) {
				if (respObj.get(TaskEntity.VEHICLE_POSITION) != null) {
					task.setVehiclePosition(Integer.parseInt(String.valueOf(respObj.get(TaskEntity.VEHICLE_POSITION))));
				}
			}
			if (respObj.containsKey(TaskEntity.VEHICLE_POSITION_DESCRIPTION)) {
				task.setVehiclePositionDescription(String.valueOf(respObj.get(TaskEntity.VEHICLE_POSITION_DESCRIPTION)));
			}
			if (respObj.containsKey(TaskEntity.VIN)) {
				task.setVin(String.valueOf(respObj.get(TaskEntity.VIN)));
			}
			
			tasksList.add(task);
		}
		
		infoParsedListener.infoParsed(tasksList);
	}

}
