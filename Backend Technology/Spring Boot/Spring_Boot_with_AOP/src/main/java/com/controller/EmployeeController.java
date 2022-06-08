package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.EmployeeService;

@RestController
@RequestMapping("aop")  //  AOP apply for business i.e service not for controller.
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8080/aop/sayHello/Raj
	@GetMapping(value = "sayHello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return employeeService.sayHello(name);
	}
}


