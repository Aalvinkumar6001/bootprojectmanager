package com.iiht.finalbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.finalbootapp.model.Task;
import com.iiht.finalbootapp.service.TaskService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/task")
public class TaskController {


	@Autowired
	private TaskService taskservice;
	

	@PostMapping("/create")
	public ResponseEntity<Object> addTask(@RequestBody Task task) {
		if (task == null || task.getTaskName() == null || task.getUser() == null) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		} else {

			taskservice.addTask(task);
			return new ResponseEntity<Object>(task, HttpStatus.CREATED);
		}

	}

	@GetMapping("/")
	public List<Task> getTask() {
		List<Task> task = taskservice.getTask();
		return task;
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Object> deletetask(@RequestBody Task task){
		taskservice.deleteTask(task);
		return new ResponseEntity<Object>(task, HttpStatus.CREATED);
	}
	
}
