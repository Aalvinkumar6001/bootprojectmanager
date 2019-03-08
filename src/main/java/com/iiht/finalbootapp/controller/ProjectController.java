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

import com.iiht.finalbootapp.model.Project;
import com.iiht.finalbootapp.service.ProjectService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectservice;
	

	@PostMapping("/create")
	public ResponseEntity<Object> addProject(@RequestBody Project project) {
		if (project == null || project.getProjectName() == null || project.getUser() == null) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		} else {

			projectservice.addProject(project);
			return new ResponseEntity<Object>(project, HttpStatus.CREATED);
		}

	}

	@GetMapping("/")
	public List<Project> getProjects() {
		List<Project> project = projectservice.getProject();
		return project;
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Object> deleteProject(@RequestBody Project project){
		projectservice.deleteProject(project);
		return new ResponseEntity<Object>(project, HttpStatus.CREATED);
	}
	
}
