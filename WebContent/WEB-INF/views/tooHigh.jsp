<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Too High</title>
</head>
<body>
	<h1>You guessed too high</h1>
	<form action="Check" method="post">
		<input type="number" name="guess">
		<button>Submit</button>
	</form>
</body>
</html>