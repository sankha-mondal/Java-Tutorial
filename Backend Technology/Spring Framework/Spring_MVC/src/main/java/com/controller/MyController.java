package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller						//   it is like a servlet
public class MyController {

	@RequestMapping(value = "link1",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("I Came Here 1");
		ModelAndView mav = new ModelAndView();	//  One link work | normal example
		mav.setViewName("display.jsp");
		return mav;
	}

//-----------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public ModelAndView checkUserDetails(HttpServletRequest req) {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ModelAndView mav = new ModelAndView();							//  Application
		if(email.equals("ssm@gmail.com") && password.equals("123")) {
				mav.setViewName("success.jsp");  // move to success.jsp page 
		} else {
			mav.setViewName("failure.jsp");		// move to failure.jsp page 
		}
		return mav;
	}
	
}
