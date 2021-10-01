<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>
<h1>Registration Page</h1>
	<form action="registerUser" method="post">
		<input type="text" name="username" placeholder="UserName"> <br><input
			type="password" name="password" placeholder="Password"><br> <input
			type="number" name="phone" placeholder="Phone"><br> <input
			type="text" name="address" placeholder="Address"><br> <input
			type="submit" value="Register">
	</form>
</body>
</html>