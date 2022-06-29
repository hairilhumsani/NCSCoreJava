package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.DatabaseClass;
import models.Product;
import models.User;


public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isValidUser = DatabaseClass.validateUser(username, password);
		
		if(isValidUser)
		{
			HttpSession session = request.getSession(true);
			
			List<Product> userTransactions = DatabaseClass.getProductsByUser(username,password);
			
			session.setAttribute("username", username);
			session.setAttribute("transactions", userTransactions);
			
			if(username.equals("mike"))
			{
				session.setAttribute("pageToDisplay", "UserPage.jsp");
			}
			if(username.equals("jenny"))
			{
				session.setAttribute("pageToDisplay", "AddProject.jsp");
			}
			
			
			
			
			response.sendRedirect("ProductPage.jsp");;
			
		}
		else
		{
			request.setAttribute("UserFail", true);
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			response.sendRedirect("Login.html");
		}
		
		
	}

}
