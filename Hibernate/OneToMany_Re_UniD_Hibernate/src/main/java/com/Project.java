package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project {
		@Id
		@Column(name="product_id")
		private int pid;
	
		@Column(name="product_name")
		private String projectName;
	
		@OneToMany
		@JoinColumn(name="P_E_id", referencedColumnName = "product_id")
		private List<Employees> listOfEmp;	// Project has many Employees
		 
	
		/**
		 *  The PK of Project table becomes the FK of Employees table.
		 *  "P_E_id" column will create in Employees table.
		 *  referencedColumnName is not mandatory.
		 */
	
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
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
