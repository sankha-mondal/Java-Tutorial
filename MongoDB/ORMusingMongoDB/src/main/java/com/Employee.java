package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eId;
	private String eName;
	private float salary;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}


/**
Steps:-

1> Create pom and add require dependencies.
2> Add META-INF in src\main\resources folder.
3> Create Employee.java file
4> Create DomoTest.java file

*/


