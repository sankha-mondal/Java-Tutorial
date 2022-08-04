package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	
	@Id
	@Column(name = "employee_id")
	private int id;
	
	@Column(name = "employee_name")
	private String name;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


