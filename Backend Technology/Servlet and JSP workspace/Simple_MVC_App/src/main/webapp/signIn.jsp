<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Login Page</h2>
<form action="LoginController" method="get">
	<label>Email: </label>
	<input type="email" name="email"><br/>
	<label>Password: </label>
	<input type="password" name="password"><br/>
	<input type="reset" value="Reset">
	<input type="submit" value="Sign In">
</form>
<a href="signUp.jsp" style="color:red">SignUp</a> |
<a href="delete.jsp" style="color:blue">DeleteAC</a> |
<a href="update.jsp" style="color:green">UpdateAC</a>

</body>
</html>