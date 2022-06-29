package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Create the PrintWriter class object 
				PrintWriter pw = response.getWriter();
				
				// receive the value from a SignIn. 
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				
				// then java bean class object 
				Login ll = new Login();
				ll.setEmail(email);
				ll.setPassword(password);
				
				// then create the service class object and call service method. 
				LoginService ls = new LoginService();
				
				RequestDispatcher rd1 = request.getRequestDispatcher("Home");
				RequestDispatcher rd2 = request.getRequestDispatcher("index.jsp");
				String result = ls.checkLoginDetails(ll);
				if(result.equals("success")) {
					rd1.forward(request, response);
				} else {
					pw.println("InValid emailid or password");
					rd2.include(request, response);
				}			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		// Create the PrintWriter class object 
		PrintWriter pw = response.getWriter();
		
		// receive the value from a form tag of SignUp page. 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// then java bean class object 
		Login ll = new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		
		// then create the service class object and call service method. 
		LoginService ls = new LoginService();
		String result = ls.createLoginDetails(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("signUp.jsp");
		pw.println(result);
		rd1.include(request, response);
	}

}
