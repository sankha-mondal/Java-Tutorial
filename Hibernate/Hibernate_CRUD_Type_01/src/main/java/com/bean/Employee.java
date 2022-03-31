//  Employee.java is use to create the signature of Table name:-

package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity							//  Minimum annotation.
// @Table(name = "employee")    			//  only use when class name & table name are different 
public class Employee {
	@Id						//  Minimum annotation.
//	@Column(name = "id")				//  only use when class attribute & column name are different
	private int id;
//	@Column(name = "name")				//  only use when class attribute & column name are different
	private String name;
//	@Column(name = "salary")			//  only use when class attribute & column name are different
	private float salary;
	
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
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
