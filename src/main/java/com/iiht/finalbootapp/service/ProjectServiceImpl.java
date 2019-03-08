package com.iiht.finalbootapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.finalbootapp.model.Project;
import com.iiht.finalbootapp.repository.ProjectRepository;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectrep;

	public Project addProject(Project project) {

		return projectrep.save(project);
	}

	public List<Project> getProject() {

		List<Project> project = projectrep.findAll();
		return project;
	}

	public void deleteProject(Project project) {
		projectrep.delete(project);
	}

}
