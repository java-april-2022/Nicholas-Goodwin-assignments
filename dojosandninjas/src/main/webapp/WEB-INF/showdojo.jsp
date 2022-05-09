<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing created dojo's!</title>
</head>
<body>
		<h1><c:out value="${dojo.name}"/></h1>
	
	<ul>
	<c:forEach var="ninja" items="${dojo.ninjas}">
	
		<li><c:out value="${ninja.firstName}"/> <c:out value="${ninja.lastName}"/></li>
	
	</c:forEach>
	</ul>
</body>
</html>