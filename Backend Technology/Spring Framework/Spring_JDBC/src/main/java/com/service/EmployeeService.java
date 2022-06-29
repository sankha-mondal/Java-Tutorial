package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service		// it's called as Service layer specific annotation. | so that no need to create obj in Main class.
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	
	//	 Retrieve records:-
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	
	
	
	//  Insert records:-
	
	public String storeEmployee(Employee emp) {
		if(employeeDao.storeEmployee(emp)>0) {
			return "Record stored...";
		} else {
			return "Did't store...";
		}
	}
	
	
	
	//  Delete records:-
	
	public String deleteEmployee(Employee emp) {
		if(employeeDao.deleteEmployee(emp)>0) {
			return "Record Deleted...";
		} else {
			return "Did't Delete...";
		}
	}
	
	
	
	//  Update records:-
	
	public String updateEmployee(Employee emp) {
		if(employeeDao.updateEmployee(emp)>0) {
			return "Record Updated...";
		} else {
			return "Did't Update...";
		}
	}
	
	
	
	//	 Retrieve Order BY records:-
	
	public List<Employee> getAllEmployeeOrdBy() {
		return employeeDao.getAllEmployeeOrdBy();
	}
	
	
	
	
}
