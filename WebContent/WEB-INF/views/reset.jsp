<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Reset Page</title>
</head>
<body>
	<h1><c:out value="You guessed correctly in ${count} attempts"/></h1>
	<form action="Home" method="post">
		<button>Play Again!</button>
	</form>
</body>
</html>