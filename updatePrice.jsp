<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Price Update Page</title>
</head>
<body>
<h2 align="center">
		<h1>Update Product Price</h1>
		<form action="priceUpdate" method="post">
			Name: <input type="text" name="pName"> <br>
			Price: <input type="double" name="pPrice"> <br>
			<input	type="submit" value="Update">
		</form>
	</h2>
</body>
</html>