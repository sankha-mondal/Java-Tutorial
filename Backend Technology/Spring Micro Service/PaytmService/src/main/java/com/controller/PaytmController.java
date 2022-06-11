package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.PaytmService;

@RestController
@RequestMapping("paytm")
public class PaytmController {

	
	@Autowired
	PaytmService paytmService;
	
	//	 http://localhost:8484/paytm/findAccount/{pid}
	@GetMapping(value = "findAccount/{pid}")
	public String findAccountDetails(@PathVariable("pid") int pid) {
	
		return paytmService.findAccounBalance(pid);
		
	}
}
