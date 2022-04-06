package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Project {
		@Id
		private int pid;
		private String projectName;
		@OneToMany
		@JoinColumn(name="eid", referencedColumnName="pid")
		private List<Employees> listOfEmp;
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
