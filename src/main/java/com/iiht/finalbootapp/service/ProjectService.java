package com.iiht.finalbootapp.service;

import java.util.List;
import com.iiht.finalbootapp.model.Project;

public interface ProjectService {
	public Project addProject(Project project);

	public List<Project> getProject();

	public void deleteProject(Project project);
}
