package com.ncs.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// this page should build on HTML 
// class only focus on Request scope
public class EmployeeHomePageServlet_old extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(" ------>> 2 Inside Employee Home Page -------");
		resp.setContentType("text/html");
		PrintWriter browser = resp.getWriter();
		
		String username = req.getParameter("username").trim(); // write code to get username from previous page
		String role = (String)req.getAttribute("role");
		
		browser.print("Welcome "+username);
		browser.print("role"+role);
		browser.print("<br/><hr/>");
		System.out.println(" Username :- "+username);
		System.out.println(" Role :- "+role);
		
		
		
		if(role.equals("admin"))
		{
			browser.print("<a href='addEmployee.html'> Add Employee </a>");
			
		}
		else if(role.equals("developer"))
		{
			browser.print(" Project information of the Developer ");
		}
		
		

	}
	
	
	
}
