package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")		//  parent link
public class SampleController {
	
	//  http://localhost:8080/sample/say ==> http://localhost:8080/login
	@GetMapping(value = "say")
	public String sayHello() {
		return "Welcome to Simple Spring boot with security";
	}
}


