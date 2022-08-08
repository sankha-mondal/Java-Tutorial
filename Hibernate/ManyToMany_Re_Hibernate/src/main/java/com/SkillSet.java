package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@Column(name = "p_id")
	private int Pid;
	
	@Column(name = "project_name")
	private String projetName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Employees> employees;

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getProjetName() {
		return projetName;
	}

	public void setProjetName(String projetName) {
		this.projetName = projetName;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	
	

}



