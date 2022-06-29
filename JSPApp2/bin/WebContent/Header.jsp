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
 String username = (String)session.getAttribute("username");
%>

<div style="background-color: gray; width: 100%;height: 10%">
	<div style="margin-left: 75%; font-size:medium; color:white;">
		Welcome <%=username%>
	</div>
</div>
</body>
</html>