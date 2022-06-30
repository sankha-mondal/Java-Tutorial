package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	
	//  SingIn Operation:
	public String checkUser(Login login) {   		
		if(loginDao.checkLoginDetails(login)) {
			return "success"; 	 //  navigate to success.jsp page
		} else {
			return "failure";	 //  navigate to failure.jsp page
		}
	}
	
	
	//  SingUp Operation:
	public String storeUser(Login login) {			
		if(loginDao.storeLoginDetails(login)>0) {
			return "account";	 //  navigate to account.jsp page
		} else {
			return "accountN";	 //  navigate to accountN.jsp page
		}
	}
	
}


