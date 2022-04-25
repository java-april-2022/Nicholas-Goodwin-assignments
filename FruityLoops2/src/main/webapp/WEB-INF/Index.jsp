<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/fruit.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Fruit Shop!</title>
</head>
<body>
	<h1>Fruit Shop</h1>
	<div class="container">
		<table class="table">
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="fruit" items="${fruits}"> <%--this produced an error that was c:forEach not recognized, after some googling and inserting dependecies it was still there but I restarted and it is fixed now, not really sure about that?--%>
		<tr>
			<td>${fruit.name}</td>
			<td>${fruit.price}</td>
		</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>