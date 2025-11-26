package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project {
	
		@Id
		@Column(name = "project_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name = "project_name")
		private String projectName;
		
		@OneToMany(mappedBy = "project",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		//	@JoinColumn(name="P_E_id", referencedColumnName = "product_id")  ❌❌❌
		private List<Employees> listOfEmp = new ArrayList<>();	// Project has many Employees
		
		/**
		 *  1. The PK of Project table becomes the FK of Employees table.
		 *  2. "P_E_id" column will be created in Employees table.
		 *  
		 *  3. JoinColumn & referencedColumnName must not be in this(Project) class.
		 *    
		 *  4. [mappedBy] is used to give the preference of creating column
		 *     in Employees table.
		 *     
		 *  5. [mappedBy] name should be as same as the reference of the
		 *     Project of Employees class here mappedBy = "project".
		 */

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public List<Employees> getListOfEmp() {
			return listOfEmp;
		}

		public void setListOfEmp(List<Employees> listOfEmp) {
			this.listOfEmp = listOfEmp;
		}
	


		
		
}