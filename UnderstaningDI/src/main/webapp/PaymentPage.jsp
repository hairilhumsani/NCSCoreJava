<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int currentUserBankAccount = 123; // extrating during login time
%>
<form action="PaymentServlet" method="post">
  	
  	Enter Amount <input type="text" name="amount" value="2000"> <br/>
  	<input type="hidden" value="<%=currentUserBankAccount%>" name="payeeAccount"> <br/>
  	Reciever Bank Account  <input type="text" value="456" name="recieverAccount"><br/>
  	
  	
  	Select Payment Options
  	<input type="radio" name="paymentOption" value="netbanking"> NetBanking <br/>
  	<input type="radio" name="paymentOption" value="debitCard"> Debit Card <br/>
  	<input type="radio" name="paymentOption" value="UPI"> UPI <br/>
  	
  	<input type="submit">
  	
  	<hr/>
  	
  	<p>
  	<%
  		String notifcatin =(String) application.getAttribute("paymentNotification");
  		if(notifcatin != null)
  		{
  			out.print(notifcatin);
  		}
  	%>
  	</p>
</form>
</body>
</html>