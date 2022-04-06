package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id
	private int id;
	private String name;
	private int epid;
	
	public int getEpid() {
		return epid;
	}
	public void setEpid(int epid) {
		this.epid = epid;
	}
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


