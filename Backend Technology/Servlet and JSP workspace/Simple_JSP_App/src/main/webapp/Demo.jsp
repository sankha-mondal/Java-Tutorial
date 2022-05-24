<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Simple HTML Page</h2>
<%! int a,b ; %>
<%
	out.println("Welcome to JSP page...");
	//int a = 10;
	//int b = 20;
	out.println("<font color='red'>Sum of a+b is "+(a+b)+"</font>");	
%>
<font color='green'>Sum of <%=a%> + <%=b%> is <%=(a+b) %></font>
	
</body>
</html>