package com.ncs.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ncs.model.Laptop;

// this page should build on HTML
public class EmployeeHomePageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session = req.getSession(false);// extracting the previous session
		
		if(session != null)
		{
			
			System.out.println(" ------>> 2 Inside Employee Home Page -------");
			resp.setContentType("text/html");
			PrintWriter browser = resp.getWriter();
			
			String username = (String)session.getAttribute("username");
			String role = (String)session.getAttribute("role");
			Laptop laptop = (Laptop)session.getAttribute("user-device");
			
			browser.print("Welcome "+username);
			browser.print("role"+role);
			browser.print("device Issued :- "+laptop);
			browser.print("<br/><hr/>");
			System.out.println(" Username :- "+username);
			System.out.println(" Role :- "+role);
			System.out.println("laptop "+laptop);
			
			if(role.equals("admin"))
			{
				browser.print("<a href='addEmployee.html'> Add Employee </a><br/><br/>");
				browser.print("<a href='allemployee'> View All Employee </a><br/><br/>");
				
				
				
			}
			else if(role.equals("developer"))
			{
				browser.print(" Project information of the Developer ");
			}
			
		}// end if
		else
		{
			System.out.println("user is unauthorized ");
			resp.sendRedirect("LoginForm.html");
		}
		
		
		
		
		
		
		
		

	}
	
	
	
}
