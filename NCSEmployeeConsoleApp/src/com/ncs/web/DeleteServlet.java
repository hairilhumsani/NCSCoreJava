package com.ncs.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ncs.service.EmployeeService;
import com.ncs.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	
	EmployeeService employeeService = new EmployeeServiceImpl();
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);// extracting the previous session
		
		if(session != null)
		{
			// delete user based on employee id
			// extract selected employee Id
			
			
			
		}//end of session validation
		else
		{
			System.out.println("user is unauthorized ");
			resp.sendRedirect("LoginForm.html");
		}
	
	}//end of doGet

	

}//end of class
