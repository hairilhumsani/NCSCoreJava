<%@page import="p1.Transaction"%>
<%@page import="java.util.List"%>
<%@ page language="java"%>
<html>

</head>
<body>
<%
 List<Transaction> allTransaction = (List<Transaction>)session.getAttribute("transactions");
%>

<hr/>
	<%
		for(Transaction t : allTransaction)
		{
			%>
			<%=t %> <br/>
			<%
		}
	
	%>




</body>
</html>