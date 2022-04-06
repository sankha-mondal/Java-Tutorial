package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SkillSet {
	@Id
	private int skillid;
	private String skillname;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<EmployeeDetails> listOfEmp;
	
	
	
	public int getSkillid() {
		return skillid;
	}
	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public List<EmployeeDetails> getListOfEmp() {
		return listOfEmp;
	}
	public void setListOfEmp(List<EmployeeDetails> listOfEmp) {
		this.listOfEmp = listOfEmp;
	}

}

