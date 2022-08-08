package com;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employees {
	
	@Id
	@Column(name = "e_id")
	private int eId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@ManyToMany
	@JoinTable(
		   name = "new_p_e_join",
		   joinColumns = { @JoinColumn(name = "Employee_id")},
		   inverseJoinColumns = { @JoinColumn(name = "Project_id")}
		   )
	private List<Project> projects;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
		

}


