<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>New User</title>
	</head>
	
	<body>
<%@include file="ErrorNewUser.jsp"%>
		<form action="NewUser" method="post">
			User Name <input type="text" name="username"> <br/> 
			Password<input type="password" name="password"> <br/> 
			Security Question <input type="text" name="securityQuestion"> <br/> 
			Security Answer <input type="text" name="securityAnswer"> <br/> 
			<input type="submit">
		
		</form>

	</body>
</html>