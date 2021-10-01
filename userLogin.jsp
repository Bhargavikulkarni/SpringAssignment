<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<h1>User Login</h1>
<h4 style="color:red">${msg }</h4>
 <form action="loginUser" method="post">
 <input type="text" name="username" placeholder="UserName"><br><br>
   <input type="password" name="password" placeholder="password"><br><br>
   <input type="submit" value="Login">
   <input type="submit" value="Back">
   </form>
</body>
</html>