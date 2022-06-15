package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySimpleController {
	
	//  http://localhost:8080/hellouser
	@GetMapping("/hellouser")
	public String getUser()
	{
		return "Hello User";
	}
	
	//  http://localhost:8080/helloadmin
	@GetMapping("/helloadmin")
	public String getAdmin()
	{
		return "Hello Admin";
	}

}
