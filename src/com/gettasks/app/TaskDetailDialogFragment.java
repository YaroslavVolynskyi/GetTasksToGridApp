package com.gettasks.app;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TaskDetailDialogFragment extends DialogFragment {
	
	private TaskEntity task;
	
	public static final String TASK_KEY = "taskKey";
	
	public TaskDetailDialogFragment() {
	}

	@Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
    	Bundle args = getArguments();
		if (args != null) {
			this.task = (TaskEntity) args.get(TASK_KEY);
		}
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.task_detail_dialog, null);
        ListView detailsList = (ListView) v.findViewById(R.id.details_listview);
		ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getItemsList(task));
		detailsList.setAdapter(listAdapter);
        builder.setView(v);
    	
    	return builder.create();
    }
    
    private List<String> getItemsList(TaskEntity task) {
		List<String> items = new ArrayList<>();
		if (task != null) {
			items.add(TaskEntity.ID + " = " + task.getId());
			items.add(TaskEntity.NUMBER + " = " + task.getNumber());
			items.add(TaskEntity.ACTUAL_START_DATE + " = " + task.getActualStartDate());
			items.add(TaskEntity.ACTUAL_END_DATE + " = " + task.getActualEndDate());
			items.add(TaskEntity.ASSIGNEE_ID + " = " + task.getAssigneeId());
			items.add(TaskEntity.ASSIGNEE_UNIT_ID + " = " + task.getAssigneeUnitId());
			items.add(TaskEntity.BRAND_ID + " = " + task.getBrandId());
			items.add(TaskEntity.CARRIER_ID + " = " + task.getCarrierId());
			items.add(TaskEntity.CREATION_DATE + " = " + task.getCreationDate());
			items.add(TaskEntity.EXECUTOR_ID + " = " + task.getExecutorId());
			items.add(TaskEntity.EXECUTOR_UNIT_ID + " = " + task.getExecutorUnitId());
			items.add(TaskEntity.FIRST_DRIVER_ID + " = " + task.getFirstDriverId());
			items.add(TaskEntity.FROM_UNIT_ID + " = " + task.getFromUnitId());
			items.add(TaskEntity.FROM_USER_ID + " = " + task.getFromUserId());
			items.add(TaskEntity.GAS_AMOUNT + " = " + task.getGasAmount());
			items.add(TaskEntity.GROUP_TASK_ID + " = " + task.getGroupTaskId());
			items.add(TaskEntity.IMPLEMENTATION_TYPE_ID + " = " + task.getImplementationTypeId());
			items.add(TaskEntity.INT_ROW_VER + " = " + task.getIntRowVer());
			items.add(TaskEntity.IS_GROUP + " = " + task.isGroup());
			items.add(TaskEntity.IS_IN_TRAFFIC + " = " + task.getIsInTraffic());
			items.add(TaskEntity.KIND_ID + " = " + task.getKindId());
			items.add(TaskEntity.MODEL_CODE_ID + " = " + task.getModelCodeId());
			items.add(TaskEntity.PLANNED_START_DATE + " = " + task.getPlannedStartDate());
			items.add(TaskEntity.PLANNED_END_DATE + " = " + task.getPlannedEndDate());
			items.add(TaskEntity.SECOND_DRIVER_ID + " = " + task.getSecondDriverId());
			items.add(TaskEntity.SHIPPING_AGENT_ID + " = " + task.getShippingAgentId());
			items.add(TaskEntity.SIGN_UNIT_ID + " = " + task.getSignUnitId());
			items.add(TaskEntity.SIGN_USER_ID + " = " + task.getSignUserId());
			items.add(TaskEntity.SPEEDOMETER + " = " + task.getSpeedometer());
			items.add(TaskEntity.STATE_ID + " = " + task.getStateId());
			items.add(TaskEntity.STATE_NUMBER + " = " + task.getStateNumber());
			items.add(TaskEntity.SURVEY_POINT_ID + " = " + task.getSurveyPointId());
			items.add(TaskEntity.TO_UNIT_ID + " = " + task.getToUnitId());
			items.add(TaskEntity.TO_USER_ID + " = " + task.getToUserId());
			items.add(TaskEntity.TRANSPORT_ID + " = " + task.getTransportId());
			items.add(TaskEntity.TRANSPORTATION_TYPE_ID + " = " + task.getTransportationTypeId());
			items.add(TaskEntity.TYPE_ID + " = " + task.getTypeId());
			items.add(TaskEntity.VEHICLE_POSITION + " = " + task.getVehiclePosition());
			items.add(TaskEntity.VEHICLE_POSITION_DESCRIPTION + " = " + task.getVehiclePositionDescription());
			items.add(TaskEntity.VIN + " = " + task.getVin());
		}
		return items;
	}

}
