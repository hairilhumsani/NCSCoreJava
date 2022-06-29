package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.DatabaseClass;
import models.User;

import java.io.IOException;

/**
 * Servlet implementation class NewUser
 */
public class NewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DatabaseClass dbClass = new DatabaseClass();
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("It works");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String securityQuestion = request.getParameter("securityQuestion");
		String securityAnswer = request.getParameter("securityAnswer");
		
		boolean isValidUser = DatabaseClass.validateUser(username, password);
		
		if(isValidUser)
		{
			System.out.println(dbClass.getAllUser());
			request.setAttribute("haveValidUser", true);
			response.sendRedirect("newUser.jsp");
		}
		else
		{
			User user = new User(username,password,securityQuestion,securityAnswer,null);
			dbClass.addUser(user);
			request.setAttribute("userSuccess", true);
			response.sendRedirect("Login.html");
		}
	}

}
