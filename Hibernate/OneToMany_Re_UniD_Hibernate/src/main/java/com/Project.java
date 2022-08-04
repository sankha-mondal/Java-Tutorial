package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project {
	
		@Id
		@Column(name = "product_id")
		private int id;
		
		@Column(name = "product_name")
		private String projectName;
		
		@OneToMany
		@JoinColumn(name="P_E_id", referencedColumnName = "product_id")
		private List<Employees> listOfEmp;	// Project has many Employees
		
		/**
		 *  1. The PK of Project table becomes the FK of Employees table.
		 *  2. "P_E_id" column will be created in Employees table.
		 *  3. referencedColumnName is not mandatory.
		 */
		
		
}
