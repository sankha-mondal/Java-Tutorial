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
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
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
		String result = ls.updateLoginDetails(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("update.jsp");
		pw.println(result);
		rd1.include(request, response);
	}

}
