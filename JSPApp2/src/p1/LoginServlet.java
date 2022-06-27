package p1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
			
			
			
			
			response.sendRedirect("AddTransaction.jsp");;
			
		}
		else
		{
			response.sendRedirect("LoginPage.jsp");
		}
		
		
	}

}
