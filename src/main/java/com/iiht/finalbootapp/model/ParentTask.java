package com.iiht.finalbootapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParentTask")
public class ParentTask {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "parentTaskId")
	private long parentTaskId;

	@OneToOne
	@JoinColumn(name = "task")
	private Task task;

	public ParentTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParentTask(long parentTaskId, Task task) {
		super();
		this.parentTaskId = parentTaskId;
		this.task = task;
	}

	public long getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(long parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
