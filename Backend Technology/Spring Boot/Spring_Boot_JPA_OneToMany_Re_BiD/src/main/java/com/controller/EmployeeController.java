package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employees;
import com.entity.Project;
import com.services.EmployeeService;

@RestController
@RequestMapping("employees")    //  http://localhost:8383/employees/
@CrossOrigin			        //  Enable cors policies
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
//=======================================================================================================================
	
	//  Insert Operation :-    Op:4
	
	//  http://localhost:8383/employees/projectId/{projectId}/create
		@PostMapping(value = "projectId/{projectId}/create",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String createProject(@RequestBody Employees employee, @PathVariable Integer projectId) {
			return empService.createEmployees(employee, projectId);
		}

}
