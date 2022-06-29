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
<form action="checkUser" method="post">
	<label>Email: </label>
	<input type="email" name="email"><br>
	<label>Password: </label>
	<input type="password" name="password"><br>
	<input type="reset" value="Reset">
	<input type="submit" value="Submit">
</form>
</body>
</html>