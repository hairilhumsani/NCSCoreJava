<%@page import="p1.BankAccount" isELIgnored="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%
	String arr[] = {"Java","Dot Net","Angular","React","Python"}; // xyz
  for(int i = 0;i<arr.length;i++)
  {
	  %>
	   <input type="text" value="<%=arr[i]%>"><br/>
	  <%
  } // end of for loop
  
  
%>
<hr/>
	<select>
		<%
		for(int i = 0;i<arr.length;i++)
		  {
		  	%>
		  	<option> <%=arr[i]%>   </option>
		  	<%
		  }
		%>
	</select>

</body>
</html>