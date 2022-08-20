package com.services;

import java.util.List;

import com.entity.Employees;
import com.entity.Project;

public interface EmployeeService {
	
//  Retrieve all Employees Operation:-  Op:1
	
	List<Employees> findAllEmployees();
	
//  Retrieve Employee by PK:-   Op:2
	
	Employees findEmployeesByPK(Integer id);
	
//  Retrieve all Employees by Project Operation:-  Op:3	
	
	List<Employees> findAllEmployeesByProject(Integer projectId);
	
//  Insert Operation:-    Op:4
	
	String createEmployees(Employees employees, Integer projectId);
	
//  Update Operation:-    Op:5
	
	String updateEmployees(Employees employees);
	
//  Delete Operation:-    Op:6
	
	String deleteEmployees(Integer id);
	
//  Search Operation:-   Op;7
	
	List<Employees> searchEmployee(String keyword);

}
