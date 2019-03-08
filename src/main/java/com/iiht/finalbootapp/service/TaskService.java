package com.iiht.finalbootapp.service;


import java.util.List;

import com.iiht.finalbootapp.model.Task;


public interface TaskService {

	public Task addTask(Task task);
	public List<Task> getTask();
	public void deleteTask(Task task);


}
