package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Account;
import com.service.AccountService;



@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	//  http://localhost:8383/account/create
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		System.out.println(account.getAccno());
		return accountService.createAccount(account);
	}
	
	//  http://localhost:8383/account/findAccountDetails/{accno}
	@GetMapping(value = "findAccountDetails/{accno}")
	public String findAccountDetails(@PathVariable("accno") int accno) {
		return accountService.getAccountDetails(accno);
	}
}
