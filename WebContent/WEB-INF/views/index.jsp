<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Number Game Home</title>
</head>
<body>
	<h1>Welcome to the Great Number Game</h1>
	<h3>I'm thinking of a number between 1 and 100. Take a guess!</h3>
	<form action="Check" method="post">
		<input type="number" name="guess">
		<button>Submit</button>
	</form>
</body>
</html>