package com.ncs.web; 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class based on request scope only
 */
public class LoginServlet_Old extends HttpServlet {

	int x = 10;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		String username = req.getParameter("username").trim();
		String password = req.getParameter("password").trim();

		boolean isValidUser = false;
		String role = "";
		
		/* code from line 29 to 47 will be replaced by database code*/
		if(username.equals("mike") & password.equals("123"))
		{
			// write code to move HomePage
			//resp.sendRedirect("homepage"); // leads an exception in next page 
			
			// object is to redirect the original http object towards next page
			// Mike is HR
			
			 role = "admin"; // code to extract role from database
			isValidUser = true;
			
					
		}
		else if(username.equals("jenny") & password.equals("123"))
		{// Jenny is Developer
			role = "developer"; // code to extract role from database
			isValidUser = true;
			
		}
		
		//-------------------------------------------------------------------------------
		
		if(isValidUser) 
		{
			req.setAttribute("role", role);
			System.out.println("--->> 1. Inside Login Servlet - Ok for Mike");
			RequestDispatcher rd = req.getRequestDispatcher("homepage");
			rd.forward(req, resp);
		}
		else 
		{
			// Write code to move back to login page
			System.out.println("--->> 1. Inside Login Servlet - Error");
			resp.sendRedirect("LoginForm.html");
		}
		
	}//end of dopost
}//end of Servlet














