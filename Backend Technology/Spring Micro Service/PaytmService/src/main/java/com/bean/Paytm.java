package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paytm {
@Id
private int pid;
private Integer accno;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public Integer getAccno() {
	return accno;
}
public void setAccno(Integer accno) {
	this.accno = accno;
}

}
