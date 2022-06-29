<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp"%>
<hr/>
<form action="TransactionSaveServlet" method="post">
	Enter Date <input type="date" name="date"><br/>
	Enter Amount <input type="number" name="amount"><br/>
	
	Select Transaction Type 
	<select name="type">
		<option> ATM Withdrawal</option>
		<option> Online Fund Transfer </option>
		<option> Online Payment</option>
		
	</select> 
	 
	Enter Account to Transfer <input type="number" name="secondAccount"><br/>
	
	<input type="Submit">
	
	
</form>
<hr/>

<% 
	String pageToDisplay = (String)session.getAttribute("pageToDisplay");
%>
<!-- 
<%@include file="UserPage.jsp"%>

 include directive contains only fixed value
 -->


<jsp:include page="<%=pageToDisplay%>"></jsp:include>
</body>
</html>















