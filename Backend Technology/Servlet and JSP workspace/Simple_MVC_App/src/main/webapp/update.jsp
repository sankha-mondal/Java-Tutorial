<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Update Your Account</h2>
<form action="UpdateController" method="post">
	<label>Email: </label>
	<input type="email" name="email"><br/>
	<label>New Password: </label>
	<input type="password" name="password"><br/>
	<input type="reset" value="Reset">
	<input type="submit" value="Update A/c">
</form>
<a href="signIn.jsp" style="color:red">SignIn</a> |
<a href="signUp.jsp" style="color:blue">SignUp</a> |
<a href="delete.jsp" style="color:green">DeleteAC</a>

</body>
</html>