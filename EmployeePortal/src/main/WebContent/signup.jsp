<!-- signup.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Page</title>
</head>
<body>
	<h2>SignUp Page</h2>
	<form method="post" action="SignupServlet">
		FirstName: <input type="text" name="FirstName"/>
		LastName: <input type="text" name="LastName"/><br/>
		Gmail: <input type="email" name="Gmail"/><br/>
		Password: <input type="password" name="Password"/><br/>
		<input type="submit" value="Signup"/>
	</form>
</body>
</html>