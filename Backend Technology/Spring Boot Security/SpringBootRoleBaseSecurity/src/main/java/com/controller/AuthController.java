package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

	
	@GetMapping(value="admin/say")
	public String helloAdmin() {
		return "Welcome to Spring security with admin";
	}
	
	@GetMapping(value="user/say")
	public String helloUser() {
		return "Welcome to Spring security with user";
	}
}
