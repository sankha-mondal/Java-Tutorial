package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Project {
	
		@Id
		@Column(name = "product_id")
		private int id;
		
		@Column(name = "product_name")
		private String projectName;
		
		@OneToMany(mappedBy = "project",
				cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
		//  @JoinColumn(name="P_E_id", referencedColumnName = "product_id")  ❌❌❌
		private List<Employees> listOfEmp;	// Project has many Employees
		
		/**
		 *  1. The PK of Project table becomes the FK of Employees table.
		 *  2. "P_E_id" column will be created in Employees table.
		 *  
		 *  3. @JoinColumn & referencedColumnName must not be in this class.
		 *  
		 *  
		 *  4. [mappedBy] is used to give the preference of creating column
		 *     in Employees table.
		 *     
		 *  5. [mappedBy] name should be as same as the reference of the
		 *     Project of Employees class here mappedBy = "project".
		 */
		
}
