<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product Found Successfully....</h1>
<table border="1">

		<tr>
			<th>Name</th>
			<th>Category</th>
			<th>Company</th>
			<th>Quantity</th>
			<th>Price</th>
			
		</tr>
		<c:forEach var="pdto" items="${lispdto}">
			<tr>
				<td><c:out value="${pdto.getPName()}"></c:out></td>
				<td><c:out value="${pdto.getPCategory()}"> </c:out></td>
				<td><c:out value="${pdto.getPCompany()}">    </c:out></td>
				<td><c:out value="${pdto.getPQuantity()}">    </c:out></td>
				<td><c:out value="${pdto.getPPrice()}">    </c:out></td>	
			</tr>
		</c:forEach>
	</table>
	
</html>