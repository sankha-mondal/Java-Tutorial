package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	private int ppid;		//  PK
	private String description;
	
	public int getPpid() {
		return ppid;
	}
	public void setPpid(int ppid) {
		this.ppid = ppid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
