package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component			//  equal to <bean class="com.Employee"></bean>
public class Employee {

	private int id;
	private String name;
	private float salary;
	private String skillSet[];
	private List<Long> phNumber;
	@Autowired 		//  because Address is complex type
	private Address add;
	
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String[] getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	public List<Long> getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(List<Long> phNumber) {
		this.phNumber = phNumber;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", skillSet="
				+ Arrays.toString(skillSet) + ", phNumber=" + phNumber + ", add=" + add + "]";
	}
	
	
}
