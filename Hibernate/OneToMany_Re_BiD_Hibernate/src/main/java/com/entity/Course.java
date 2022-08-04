package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Employees {
	
	@Id
	@Column(name = "employee_id")
	private int id;
	
	@Column(name = "employee_name")
	private String name;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                            CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "P_E_id")
	private Project project;
	
	
}


