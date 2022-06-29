package p1;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isValidUser = DatabaseClass.validateUser(username, password);
		
		if(isValidUser)
		{
			HttpSession session = request.getSession(true);
			
			List<Transaction> userTransactions = DatabaseClass.getTransactionsByUser(username);
			
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
			
			
			
			
			response.sendRedirect("AddTransaction.jsp");;
			
		}
		else
		{
			response.sendRedirect("LoginPage.jsp");
		}
		
		
	}

}
