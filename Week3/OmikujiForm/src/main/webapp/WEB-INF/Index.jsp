<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form!</title>
</head>
<body>
	<h1>Create a new Omikuji!</h1>
	<form action="/processFormData" method="post">
		<div>
			<label for="">Pick any number 5 to 20</label>
			<br>
			<input type="number" name="numbers"/>
			<br>
		</div>
		<div>
			<label for="">Enter the name of a city you would like to visit!</label>
			<br>
			<input type="text" name="city"/>
			<br>
		</div>
		<div>
			<label for="">Enter the name of a person you would like to spend time with!</label>
			<br>
				<input type="text" name="person"/>
				<br>
		</div>
		<div>
			<label for="">Enter something you would like to create!</label>
			<br>
			<input type="text" name="create"/>
			<br>
		</div>
		<div>
			<label for="">Enter any type of living thing</label>
			<br>
			<input type="text" name="living"/>
			<br>
		</div>
		<div>
			<label for="">Say something nice to someone:</label>
			<br>
			<textarea name="message"  cols="20" rows="10"></textarea>
			<br>
		</div>
		<input type="submit" value="Send"/>
		<p> Send and show a friend!</p>
	</form>
</body>
</html>