package com.gettasks.app;

import java.util.List;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TaskGridAdapter extends BaseAdapter {

	private List<TaskEntity> tasksList;
	private Activity activity;
	
	public static final String DIALOG_TAG = "TASK_DIALOG_TAG";

	public TaskGridAdapter(List<TaskEntity> tasksList, Activity activity) {
		this.tasksList = tasksList;
		this.activity = activity;
	}

	public void setTasksList(List<TaskEntity> newTasksList) {
		this.tasksList = newTasksList;
	}

	@Override
	public int getCount() {
		if (tasksList != null) {
			return tasksList.size();
		}
		return 0;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(activity);
			convertView = inflater.inflate(R.layout.taskgrid_item, parent, false);
		}

		TextView id = (TextView) convertView.findViewById(R.id.idTextView);
		TextView number = (TextView) convertView.findViewById(R.id.numberTextView);

		if (tasksList != null && tasksList.size() > 0) {
			id.setText(String.format("%s = %s", TaskEntity.ID, String.valueOf(tasksList.get(position).getId())));
			number.setText(String.format("%s = %s", TaskEntity.NUMBER, tasksList.get(position).getNumber()));
		}

		convertView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startTaskDetailDialog(tasksList.get(position));
			}
		});
		
		return convertView;
	}
	
	private void startTaskDetailDialog(TaskEntity task) {
		TaskDetailDialogFragment dialog = new TaskDetailDialogFragment();
		Bundle args = new Bundle();
		args.putSerializable(TaskDetailDialogFragment.TASK_KEY, task);
		dialog.setArguments(args);
		dialog.show(activity.getFragmentManager(), DIALOG_TAG);
	}

}
