<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Delete Your Account</h2>
<form action="DeleteController" method="post">
	<label>Email: </label>
	<input type="email" name="email"><br/>
	<input type="reset" value="Reset">
	<input type="submit" value="Delete A/c">
</form><br>
<a href="signIn.jsp" style="color:red">SignIn</a> |
<a href="signUp.jsp" style="color:blue">SignUp</a> |
<a href="update.jsp" style="color:green;">UpdateAC</a>

</body>
</html>