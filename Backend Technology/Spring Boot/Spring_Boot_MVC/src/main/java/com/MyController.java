package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value = "/")
	public String sayHello() {
		return "index";
	}
	
	@RequestMapping(value = "/signIn")
	public String loginPage() {
		return "signIn";
	}
	
	@RequestMapping(value = "/signUp")
	public String singUpPage() {
		return "signUp";
	}
}


