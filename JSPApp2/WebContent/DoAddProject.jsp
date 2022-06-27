<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorPage.jsp" isErrorPage="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="projectAtr" class="p1.NCSProject" scope="session"></jsp:useBean>
	
	<jsp:setProperty property="*" name="projectAtr"/>
	
	<%
		boolean abc = projectAtr.doSave();
	%>
	<hr/>
	Id <jsp:getProperty property="id" name="projectAtr"/> <br/>
	Name <jsp:getProperty property="name" name="projectAtr"/> <br/>
	Deployed <jsp:getProperty property="deployed" name="projectAtr"/> <br/>
	years <jsp:getProperty property="year" name="projectAtr"/> <br/>
	
	
</body>
</html>