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
@Table(name = "Task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "taskId")
	private long taskId;

	@Column(name = "taskName")
	private String taskName;

	@Column(name = "priorityValue")
	private int priorityValue;

	@OneToOne(mappedBy = "task")
	private ParentTask parentTask;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "startDate")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "endDate")
	private Date endDate;

	@OneToOne
	private User user;

	@Column(name = "taskTotal")
	private int taskTotal;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(long taskId, String taskName, int priorityValue, ParentTask parentTask, Date startDate, Date endDate,
			User user, int taskTotal) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.priorityValue = priorityValue;
		this.parentTask = parentTask;
		this.startDate = startDate;
		this.endDate = endDate;
		this.user = user;
		this.taskTotal = taskTotal;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriorityValue() {
		return priorityValue;
	}

	public void setPriorityValue(int priorityValue) {
		this.priorityValue = priorityValue;
	}

	public ParentTask getParentTask() {
		return parentTask;
	}

	public void setParentTask(ParentTask parentTask) {
		this.parentTask = parentTask;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getTaskTotal() {
		return taskTotal;
	}

	public void setTaskTotal(int taskTotal) {
		this.taskTotal = taskTotal;
	}

}
