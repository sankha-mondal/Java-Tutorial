package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {
	
	
	//  Hard Coding... just for understanding...
	/**
	@RequestMapping(value ="/checkUser",method = RequestMethod.POST)
	public String checkUserDetails(HttpServletRequest req) {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		if(email.equals("ssm@gmail.com") && pass.equals("123")) {
			return "success";  		//  navigate to success.jsp 
		} else {
			return "failure";		//  navigate to failure.jsp 
		}
	}
	*/
	
	//  Checking with database...
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value ="/checkUser",method = RequestMethod.POST)
	public String checkUserDetails(HttpServletRequest req,Login ll) {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		ll.setEmail(email);
		ll.setPassword(pass);
		String result = loginService.checkUser(ll); 
		return result;	
	}

	@RequestMapping(value ="/storeUser",method = RequestMethod.POST)
	public String storeUserDetails(HttpServletRequest req,Login ll) {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		ll.setEmail(email);
		ll.setPassword(pass);
		String result = loginService.storeUser(ll); 
		return result;	
	}
	
}



