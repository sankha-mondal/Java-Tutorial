package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class EmployeeDetails {
	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<SkillSet> listOfSkill;
	
	
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
	public List<SkillSet> getListOfSkill() {
		return listOfSkill;
	}
	public void setListOfSkill(List<SkillSet> listOfSkill) {
		this.listOfSkill = listOfSkill;
	}

}

