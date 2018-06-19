<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Too Low</title>
</head>
<body>
	<h1>You guessed too low</h1>
	<form action="Check" method="post">
		<input type="number" name="guess">
		<button>Submit</button>
	</form>
</body>
</html>