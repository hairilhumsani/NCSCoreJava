<%@page import="p1.Transaction"%>
<%@page import="java.util.List"%>
<%@ page language="java"%>
<html>

</head>
<body>
<%
 String username = (String)session.getAttribute("username");
 List<Transaction> allTransaction = (List<Transaction>)session.getAttribute("transactions");
%>
<div style="background-color: gray; width: 100%;height: 10%">
	<div style="margin-left: 75%; font-size:medium; color:white;">
		Welcome <%=username%>
	</div>
</div>
<hr/>
	<%
		for(Transaction t : allTransaction)
		{
			%>
			<%=t%> <br/>
			<%
		}
	
	%>

</body>
</html>