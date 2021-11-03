<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to MVC Application</title>
</head>
<body style="background-color: powderblue; font-family: verdana">

	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="/login" method="post">
		Username: <input type="text" name="uname" placeholder="username" />
		Password: <input type="password" name="password"
			placeholder="password" /><br>
		<br> <input type="submit" value="Login" />
	</form>


</body>
</html>