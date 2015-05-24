package com.gettasks.app;

import java.util.List;

public class TasksHolder {

	private static TasksHolder instance;
	private List<TaskEntity> tasksList;
	private boolean tasksDownloaded = false;
	
	public static TasksHolder getInstance() {
		if (instance == null) {
			instance = new TasksHolder();
		}
		return instance;
	}
	
	public void setTasksDownloaded(boolean tasksDownloaded) {
		this.tasksDownloaded = tasksDownloaded;
	}
	
	public boolean tasksDownloaded() {
		return this.tasksDownloaded;
	}
	
	public void setTasksList(List<TaskEntity> tasksList) {
		this.tasksList = tasksList;
	}
	
	public List<TaskEntity> getTasksList() {
		return this.tasksList;
	}
}
