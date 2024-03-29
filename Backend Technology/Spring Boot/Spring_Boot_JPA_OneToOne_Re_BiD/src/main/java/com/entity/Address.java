package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int id;
	
	@Column(name = "address_city")	
	private String city;
	
	@OneToOne(mappedBy = "address")  //(cascade = CascadeType.ALL) 
	private Student student;
	
	/**
	 *  1. (cascade = CascadeType.ALL) if we use this then accordingly 
	 *     all the mapped date will be effected. Like on Delete operation 
	 *     the data will delete from mapped table. 
	 *  
	 *  2. [mappedBy] is used to give the preference of creating column
	 *     in Student table.
	 *     
	 *  3. [mappedBy] name should be as same as the reference of the
	 *     Address of Student class here mappedBy = "address".
	 */
	
	public int getId() {
		return id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + "]";
	}
	

}
