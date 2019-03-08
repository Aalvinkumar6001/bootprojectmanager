package com.iiht.finalbootapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "projectId")
	private long projectId;

	@Column(name = "projectName")
	private String projectName;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "startDate")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "endDate")
	private Date endDate;

	@Column(name = "priorityValue")
	private int priorityValue;

	@OneToOne
	private User user;

	@Column(name = "activeProject")
	private boolean activeProject;

	public Project(long projectId, String projectName, Date startDate, Date endDate, int priorityValue, User user,
			boolean activeProject) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priorityValue = priorityValue;
		this.user = user;
		this.activeProject = activeProject;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getPriorityValue() {
		return priorityValue;
	}

	public void setPriorityValue(int priorityValue) {
		this.priorityValue = priorityValue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isActiveProject() {
		return activeProject;
	}

	public void setActiveProject(boolean activeProject) {
		this.activeProject = activeProject;
	}

}
