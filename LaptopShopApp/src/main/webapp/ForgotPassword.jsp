<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Forgot Password</title>
	</head>
	
	<body>
	
	<% String forgotPassword = (String)request.getAttribute("ForgotPassword");%>
		<form action="ForgotPassword" method="post">
			User Name <input type="text" name="username"> <br/>  
			Security Question <input type="text" name="securityQuestion"> <br/> 
			Security Answer <input type="text" name="securityAnswer"> <br/> 
			<input type="submit">
			<a href="Login.html">Back</a>
			
			Password: <%=forgotPassword%>
		
		</form>

	</body>
</html>