<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quantity Update Page</title>
</head>
<body>
<h2 align="center">
		<h1>Update Product Quantity</h1>
		<form action="quantityUpdate" method="post">
			Name: <input type="text" name="pName"> <br>
			Quantity: <input type="double" name="pQuantity"><br> 
			<input	type="submit" value="Update">
		</form>
	</h2>
</body>
</html>