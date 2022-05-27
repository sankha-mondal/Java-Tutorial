package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Welcome to Simple Servlet Program");  // it display the output in server console.
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to Server Program Client...");  // it will display the output on client browser.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html; charset=utf-8"); //  pw only reading the lines as text but we want it to read html also
		
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email"); // it is used to received the email field.
		String password = request.getParameter("password"); // it is used to received the password field.
		/*
		 * do with JDBC to check email and password from database.
		 */
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");  // Home is URL pattern of servlet
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html"); // html page we have to give name.html
		if(email.equals("ssm@gmail.com") && password.equals("123")) {
			pw.println("Successfully Login...");
			rd1.forward(request, response);		//  we will get the output of only target page 
		} else {
			pw.println("Failure try once again...");
			rd2.include(request, response);		//  source + target page in one page.
		}
		
	}

}
