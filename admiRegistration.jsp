<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>

<h1>Admin Registration Page</h1>
	<form action="registerAdmin" method="post">
		<input type="text" name="username" placeholder="UserName"> <br><input
			type="password" name="password" placeholder="Password"><br> <input
			type="number" name="phone" placeholder="Phone"><br> <input
			type="text" name="email" placeholder="Email-Id"><br> <input
			type="submit" value="Register">
	</form>

</body>
</html>