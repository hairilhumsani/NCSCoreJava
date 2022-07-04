package com.ncs.web;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.ncs.businesslogic.Account;
import com.ncs.businesslogic.Payment;
import com.ncs.util.PaymentFactory;

/**
 * Servlet implementation class PaymentServlet
 */
public class PaymentServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int amount = Integer.parseInt(request.getParameter("amount"));
		int payeeAccount = Integer.parseInt(request.getParameter("payeeAccount"));
		int recieverAccount = Integer.parseInt(request.getParameter("recieverAccount"));
		String paymentOption = request.getParameter("paymentOption");
		
	                          // call of 3rd api
		Payment paymentMode = PaymentFactory.getPayment(paymentOption); // DI - external 
		Account a = new Account();
		String notification = a.fundTransfer(paymentMode, amount, payeeAccount, recieverAccount);
		
		ServletContext application = getServletContext();
		application.setAttribute("paymentNotification", notification);
		
		response.sendRedirect("PaymentPage.jsp");
		
	}

}


