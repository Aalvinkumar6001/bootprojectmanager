package com.iiht.finalbootapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.finalbootapp.model.Task;
import com.iiht.finalbootapp.repository.TaskRepository;


@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskrep;

	public Task addTask(Task task) {

		return taskrep.save(task);
	}

	public List<Task> getTask() {

		List<Task> task = taskrep.findAll();
		return task;
	}

	public void deleteTask(Task task) {
		taskrep.delete(task);
	}

}
