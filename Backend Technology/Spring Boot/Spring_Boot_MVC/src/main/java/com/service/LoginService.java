package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	public String checkUser(Login login) {   		//  Sign In
		if(loginDao.checkLoginDetails(login)) {
			return "success";
		} else {
			return "failure";
		}
	}
	
	public String storeUser(Login login) {			//  Sign Up
		if(loginDao.storeLoginDetails(login)>0) {
			return "account";
		} else {
			return "accountN";
		}
	}
	
}


