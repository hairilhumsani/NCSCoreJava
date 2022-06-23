package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet2
 */
public class MyServlet2 extends HttpServlet {
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
