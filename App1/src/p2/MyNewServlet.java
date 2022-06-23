package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// class Accountant extends Employee
// class InvalidException extends Exception
public class MyNewServlet extends HttpServlet {

	// http://localhost:8080/App1/MyNewServlet?x=10&y=20
	
	// http://localhost:8080/App1/MyNewServlet?x=10&y=20&action=add
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter browser = resp.getWriter();
		
		browser.print("<b><u>Welcome Mike</u></b>");

		
		String strX = req.getParameter("x");
		String strY = req.getParameter("y");
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		
		int sum = x+y;
		
		browser.print("<br/><hr/>Sum of <b>"+x+"</b> & <b>"+y+"</b> is :- <b>"+sum+"</b>");
		
		/**    Access Servlet Context which is application scope container **/
		
		ServletContext context = getServletContext();
		String ipAddress = context.getInitParameter("ServerIPAddress");
		
		browser.print("<br/>Context - IP Address :- "+ipAddress+"<br/><br/>");
		
		/**    Access Servlet Config which is Page scope container **/
		ServletConfig config = getServletConfig();
		String mathsTeacherName = config.getInitParameter("MathsTeacherName");
		browser.print("<br/>Config - Maths Teacher Name :- "+mathsTeacherName);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter browser = resp.getWriter();
		
		browser.print("Do post method is called");

		String username = req.getParameter("username").trim();
		String password = req.getParameter("password").trim();
		
		System.out.println(username);
		System.out.println(password);
		
		if(username.equals("mike") & password.equals("123"))
		{
			browser.print("Welcome "+username);
		}
		else
		{
			browser.print("Invalid User");
		}
		
	}
	
	

}
