package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.DatabaseClass;
import models.Product;

import java.io.IOException;
import java.util.List;

public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String question = request.getParameter("securityQuestion");
		String answer = request.getParameter("securityAnswer");

		String userForgotPassword = DatabaseClass.getUserForgot(username, question, answer);
		//HttpSession session = request.getSession(true);
		
			request.setAttribute("ForgotPassword", userForgotPassword);
			RequestDispatcher rd = request.getRequestDispatcher("ForgotPassword.jsp");
			
			rd.forward(request, response);

	}
}
