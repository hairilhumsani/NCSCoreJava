<%@page import="models.DatabaseClass"%>
<%@page import="models.Product" %>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@include file="Header.jsp"%>


<%List<Product> allProduct = DatabaseClass.getAllProduct();
%>

<hr/>
	<%
		for(Product p : allProduct)
		{
			%>
			<%=p %> <br/>
			<%
		}
	
	%>

</body>
</html>