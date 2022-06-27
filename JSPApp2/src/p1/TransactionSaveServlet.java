package p1;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TransactionSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	// api
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 2 task , 1st : extract data , 2nd : type cast data 
		String date = request.getParameter("date");
		int amount = Integer.parseInt(request.getParameter("amount"));
		int secondAccount = Integer.parseInt(request.getParameter("secondAccount"));
		String type = request.getParameter("type");
		int  tid = new Random().nextInt(50000);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate transactionDate = LocalDate.parse(date, formatter);
		
		// data binding
		Transaction t = new Transaction(tid,transactionDate,amount,type,secondAccount);
		System.out.println(t);
		
		// saving data in database
		boolean isDataSaved = DatabaseClass.addTransaction(t);
		
		if(isDataSaved)
		{
			
			response.sendRedirect("AddTransaction.jsp");
		}
		else
		{
			System.out.println(" Some Exception !!!");
		}
	}

}
