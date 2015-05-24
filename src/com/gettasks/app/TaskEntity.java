package com.gettasks.app;

import java.io.Serializable;

public class TaskEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String ID = "Id";
	public static final String NUMBER = "Number";
	public static final String PLANNED_START_DATE = "PlannedStartDate";
	public static final String PLANNED_END_DATE = "PlannedEndDate";
	public static final String ACTUAL_START_DATE = "ActualStartDate";
	public static final String ACTUAL_END_DATE = "ActualEndDate";
	public static final String CREATION_DATE = "CreationDate";
	public static final String EXECUTOR_ID = "ExecutorId";
	public static final String KIND_ID = "KindId";
	public static final String INT_ROW_VER = "IntRowVer";
	public static final String STATE_ID = "StateId";
	public static final String VIN = "Vin";
	public static final String BRAND_ID = "BrandId";
	public static final String EXECUTOR_UNIT_ID = "ExecutorUnitId";
	public static final String ASSIGNEE_ID = "AssigneeId";
	public static final String GROUP_TASK_ID = "GroupTaskId";
	public static final String IS_GROUP = "IsGroup";
	public static final String TYPE_ID = "TypeId";
	public static final String IMPLEMENTATION_TYPE_ID = "ImplementationTypeId";
	public static final String MODEL_CODE_ID = "ModelCodeId";
	public static final String ASSIGNEE_UNIT_ID = "AssigneeUnitId";
	public static final String SURVEY_POINT_ID = "SurveyPointId";
	public static final String VEHICLE_POSITION = "VehiclePosition";
	public static final String GAS_AMOUNT = "GasAmount";
	public static final String IS_IN_TRAFFIC = "IsInTraffic";
	public static final String SPEEDOMETER = "Speedometer";
	public static final String VEHICLE_POSITION_DESCRIPTION = "VehiclePositionDescription";
	public static final String SIGN_USER_ID = "SignUserId";
	public static final String STATE_NUMBER = "StateNumber";
	public static final String CARRIER_ID = "CarrierId";
	public static final String SHIPPING_AGENT_ID = "ShippingAgentId";
	public static final String FIRST_DRIVER_ID = "FirstDriverId";
	public static final String SECOND_DRIVER_ID = "SecondDriverId";
	public static final String TRANSPORTATION_TYPE_ID = "TransportationTypeId";
	public static final String TRANSPORT_ID = "TransportId";
	public static final String FROM_UNIT_ID = "FromUnitId";
	public static final String TO_UNIT_ID = "ToUnitId";
	public static final String FROM_USER_ID = "FromUserId";
	public static final String TO_USER_ID = "ToUserId";
	public static final String SIGN_UNIT_ID = "SignUnitId";

	private int id;
	private String number;
	private String plannedStartDate;
	private String plannedEndDate;
	private String actualStartDate;
	private String actualEndDate;
	private String creationDate;
	private String executorId;
	private int kindId;
	private long intRowVer;
	private int stateId;
	private String vin;
	private String brandId;
	private String executorUnitId;
	private String assigneeId;
	private String groupTaskId;
	private boolean isGroup;
	private int typeId;
	private int implementationTypeId;
	private String modelCodeId;
	private String assigneeUnitId;
	private String surveyPointId;
	private int vehiclePosition;
	private double gasAmount;
	private String isInTraffic;
	private int speedometer;
	private String vehiclePositionDescription;
	private String signUserId;
	private String stateNumber;
	private String carrierId;
	private String shippingAgentId;
	private String firstDriverId;
	private String secondDriverId;
	private int transportationTypeId;
	private int transportId;
	private String fromUnitId;
	private String toUnitId;
	private String fromUserId;
	private String toUserId;
	private String signUnitId;

	public TaskEntity() {
		
	}
	
	public TaskEntity(String actEndDate, String actStartDate, String assigneeId, String assigneeUnitId, String brandId,
			String carrierId, String creationDate, String executorId, String executorUnitId, String firstDriverId,
			String fromUnitId, String fromUserId, double gasAmount, String groupTaskId, int id,
			int implementationTypeId, long intRowVer, boolean isGroup, String isInTraffic, int kindId, String modelCodeId,
			String number, String plannedEndDate, String plannedStartDate, String secondDriverId, String shippingAgentId, 
			String signUnitId, String signUserId, String stateNumber, String surveyPointId, String toUnitId,
			String toUserId, String vehiclePositionDescription, String vin) {
		this.actualEndDate = actEndDate;
		this.actualStartDate = actStartDate;
		this.assigneeId = assigneeId;
		this.assigneeUnitId = assigneeUnitId;
		this.brandId = brandId;
		this.carrierId = carrierId;
		this.creationDate = creationDate;
		this.executorId = executorId;
		this.executorUnitId = executorUnitId;
		this.firstDriverId = firstDriverId;
		this.fromUnitId = fromUnitId;
		this.fromUserId = fromUserId;
		this.gasAmount = gasAmount;
		this.groupTaskId = groupTaskId;
		this.id = id;
		this.implementationTypeId = implementationTypeId;
		this.intRowVer = intRowVer;
		this.isGroup = isGroup;
		this.isInTraffic = isInTraffic;
		this.kindId = kindId;
		this.modelCodeId = modelCodeId;
		this.number = number;
		this.plannedEndDate = plannedEndDate; 
		this.plannedStartDate = plannedStartDate;
		this.secondDriverId = secondDriverId;
		this.shippingAgentId = shippingAgentId;
		this.signUnitId = signUnitId;
		this.signUserId = signUserId; 
		this.stateNumber = stateNumber;
		this.surveyPointId = surveyPointId;
		this.toUnitId = toUnitId; 
		this.toUserId = toUserId; 
		this.vehiclePositionDescription = vehiclePositionDescription;
		this.vin = vin; 
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(String plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public String getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(String plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public String getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(String actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public String getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(String actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getExecutorId() {
		return executorId;
	}

	public void setExecutorId(String executorId) {
		this.executorId = executorId;
	}

	public int getKindId() {
		return kindId;
	}

	public void setKindId(int kindId) {
		this.kindId = kindId;
	}

	public long getIntRowVer() {
		return intRowVer;
	}

	public void setIntRowVer(long intRowVer) {
		this.intRowVer = intRowVer;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getExecutorUnitId() {
		return executorUnitId;
	}

	public void setExecutorUnitId(String executorUnitId) {
		this.executorUnitId = executorUnitId;
	}

	public String getAssigneeId() {
		return assigneeId;
	}

	public void setAssigneeId(String assigneeId) {
		this.assigneeId = assigneeId;
	}

	public String getGroupTaskId() {
		return groupTaskId;
	}

	public void setGroupTaskId(String groupTaskId) {
		this.groupTaskId = groupTaskId;
	}

	public boolean isGroup() {
		return isGroup;
	}

	public void setGroup(boolean isGroup) {
		this.isGroup = isGroup;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getImplementationTypeId() {
		return implementationTypeId;
	}

	public void setImplementationTypeId(int implementationTypeId) {
		this.implementationTypeId = implementationTypeId;
	}

	public String getModelCodeId() {
		return modelCodeId;
	}

	public void setModelCodeId(String modelCodeId) {
		this.modelCodeId = modelCodeId;
	}

	public String getAssigneeUnitId() {
		return assigneeUnitId;
	}

	public void setAssigneeUnitId(String assigneeUnitId) {
		this.assigneeUnitId = assigneeUnitId;
	}

	public String getSurveyPointId() {
		return surveyPointId;
	}

	public void setSurveyPointId(String surveyPointId) {
		this.surveyPointId = surveyPointId;
	}

	public int getVehiclePosition() {
		return vehiclePosition;
	}

	public void setVehiclePosition(int vehiclePosition) {
		this.vehiclePosition = vehiclePosition;
	}

	public double getGasAmount() {
		return gasAmount;
	}

	public void setGasAmount(double gasAmount) {
		this.gasAmount = gasAmount;
	}

	public String getIsInTraffic() {
		return isInTraffic;
	}

	public void setIsInTraffic(String isInTraffic) {
		this.isInTraffic = isInTraffic;
	}

	public int getSpeedometer() {
		return speedometer;
	}

	public void setSpeedometer(int speedometer) {
		this.speedometer = speedometer;
	}

	public String getVehiclePositionDescription() {
		return vehiclePositionDescription;
	}

	public void setVehiclePositionDescription(String vehiclePositionDescription) {
		this.vehiclePositionDescription = vehiclePositionDescription;
	}

	public String getSignUserId() {
		return signUserId;
	}

	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getStateNumber() {
		return stateNumber;
	}

	public void setStateNumber(String stateNumber) {
		this.stateNumber = stateNumber;
	}

	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public String getShippingAgentId() {
		return shippingAgentId;
	}

	public void setShippingAgentId(String shippingAgentId) {
		this.shippingAgentId = shippingAgentId;
	}

	public String getFirstDriverId() {
		return firstDriverId;
	}

	public void setFirstDriverId(String firstDriverId) {
		this.firstDriverId = firstDriverId;
	}

	public String getSecondDriverId() {
		return secondDriverId;
	}

	public void setSecondDriverId(String secondDriverId) {
		this.secondDriverId = secondDriverId;
	}

	public int getTransportationTypeId() {
		return transportationTypeId;
	}

	public void setTransportationTypeId(int transportationTypeId) {
		this.transportationTypeId = transportationTypeId;
	}

	public int getTransportId() {
		return transportId;
	}

	public void setTransportId(int transportId) {
		this.transportId = transportId;
	}

	public String getFromUnitId() {
		return fromUnitId;
	}

	public void setFromUnitId(String fromUnitId) {
		this.fromUnitId = fromUnitId;
	}

	public String getToUnitId() {
		return toUnitId;
	}

	public void setToUnitId(String toUnitId) {
		this.toUnitId = toUnitId;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getSignUnitId() {
		return signUnitId;
	}

	public void setSignUnitId(String signUnitId) {
		this.signUnitId = signUnitId;
	}

}
