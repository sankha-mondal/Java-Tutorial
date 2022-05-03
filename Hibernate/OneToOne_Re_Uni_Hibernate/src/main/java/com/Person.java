package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@Column(name="personId")   	//  To rename pid as personId as column name if require
	private int pid;			//  PK
	@Column(name="personName")	//  To rename pname as personName as column name if require
	private String pname;
	@OneToOne
	private Passport passport;	// this Passport is belonging to this Person or Person has Passport
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
		
}
