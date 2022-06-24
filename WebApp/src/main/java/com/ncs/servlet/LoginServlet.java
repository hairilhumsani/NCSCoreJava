package com.ncs.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username").trim();
		String password = req.getParameter("password").trim();

		boolean isValidUser = false;
		String role = "";
		String color = "";
		
		/* code from line 29 to 47 will be replaced by database code*/
		if(username.equals("mike") & password.equals("123"))
		{
			// write code to move HomePage
			//resp.sendRedirect("homepage"); // leads an exception in next page 
			
			// object is to redirect the original http object towards next page
			// Mike is HR
			
			 role = "admin";
			 color = "red";
			 // code to extract role from database
			isValidUser = true;
			
					
		}
		else if(username.equals("jenny") & password.equals("123"))
		{// Jenny is Developer
			role = "developer";
			color = "blue";// code to extract role from database
			isValidUser = true;
			
		}
		
		//-------------------------------------------------------------------------------
		
		if(isValidUser)
		{
			req.setAttribute("role", role);
			req.setAttribute("color", color);
			System.out.println("--->> 1. Inside Login Servlet - Ok for Mike");
			RequestDispatcher rd = req.getRequestDispatcher("GetAllEmployeeServlet");
			rd.forward(req, resp);
		}
		else 
		{
			// Write code to move back to login page
			System.out.println("--->> 1. Inside Login Servlet - Error");
			resp.sendRedirect("LoginForm.html");
		}
		
	}//end of dopost
	}
