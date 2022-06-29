<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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