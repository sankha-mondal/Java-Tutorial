package com.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	
	public String sayHello(String name) {
		return "Welcome to Spring boot with business method with AOP "+name;
	}
}

