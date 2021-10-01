<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Products Page</title>
</head>
<body>
	<h1 align="center">Products page</h1>
	<hr>
	<h3 align="center">
		<form action="addProducts" method="post">
			<input type="text" name="pName" placeholder="Product Name"><br>
			<input type="text" name="pCategory" placeholder="category Name"><br>
			<input type="text" name="pCompany" placeholder="Company Name"><br>
			<input type="number" name="pQuantity" placeholder="Quantity"><br>
			<input type="number" name="pPrice" placeholder="Price"><br>
			<input type="Submit" value="Add_Product">
		</form>
	</h3>
</body>
</html>