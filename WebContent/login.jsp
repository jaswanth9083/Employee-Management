<!-- login.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8"><title>Login</title></head>
<body>
  <h2>Login</h2>
  <p style="color:green;"><%= request.getAttribute("infoMessage") == null ? "" : request.getAttribute("infoMessage") %></p>
  <p style="color:red;"><%= request.getAttribute("errorMessage") == null ? "" : request.getAttribute("errorMessage") %></p>

  <form method="post" action="login">
    Email: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Login"/>
  </form>

  
  <p><a href="signup.jsp">Create an account</a> | <a href="index.jsp">Home</a></p>
  
</body></html>


