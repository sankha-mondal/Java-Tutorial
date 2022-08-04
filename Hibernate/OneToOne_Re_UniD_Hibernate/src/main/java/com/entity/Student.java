package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stu_id")
	private int id;
	
	@Column(name="stu_firstname")
	private String firstName;
	
	@Column(name="stu_lastname")
	private String lastName;
	
	@Column(name="stu_email")
	private String email;
	
	//Set up mapping between student & Address table | Student has Address
	@OneToOne //(cascade = CascadeType.ALL)      
	@JoinColumn(name = "S_A_id")
	private Address address;
	
	/**
	 *  1. (cascade = CascadeType.ALL) if we use this then accordingly 
	 *     all the mapped date will be effected. Like on Delete operation 
	 *     the data will delete from mapped table. 
	 *  2. The PK of Address table becomes FK i.e S_A_id of Student table.
	 *  3. "S_A_id" column will be created in Student table.
	 *    
	 */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}

