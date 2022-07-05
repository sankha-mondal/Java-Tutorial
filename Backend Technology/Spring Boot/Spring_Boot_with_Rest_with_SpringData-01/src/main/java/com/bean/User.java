package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String uEmail;
	private String uName;
	private String uPassword;
	private long uPhone;
	private String uAddress;
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public long getuPhone() {
		return uPhone;
	}
	public void setuPhone(long uPhone) {
		this.uPhone = uPhone;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uEmail=" + uEmail + ", uName=" + uName + ", uPassword=" + uPassword + ", uPhone="
				+ uPhone + ", uAddress=" + uAddress + "]";
	}
	
	public User(int uId, String uEmail, String uName, String uPassword, long uPhone, String uAddress) {
		super();
		this.uId = uId;
		this.uEmail = uEmail;
		this.uName = uName;
		this.uPassword = uPassword;
		this.uPhone = uPhone;
		this.uAddress = uAddress;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	


	
}

