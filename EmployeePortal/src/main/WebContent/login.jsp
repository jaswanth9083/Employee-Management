<!-- login.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login Page</title>
</head>
<body>
	<h2>Login Page</h2>
	<form method="post" action="login">
		UserName: <input type="text" name="username"/><br/>
		Password: <input type="password" name="password"/><br/>
		<input type="submit" value="login" />
	</form>
</body>
</html>


