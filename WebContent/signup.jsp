<!-- signup.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8"><title>Sign Up</title></head>
<body>
  <h2>Sign Up</h2>
  <p style="color:red;"><%= request.getAttribute("errorMessage") == null ? "" : request.getAttribute("errorMessage") %></p>

  <form method="post" action="SignupServlet">
    FirstName: <input type="text" name="FirstName"/> <br/>
    LastName:  <input type="text" name="LastName"/>  <br/>
    Gmail:     <input type="email" name="Gmail"/>    <br/>
    Password:  <input type="password" name="Password"/><br/>
    <input type="submit" value="Signup"/>
  </form>

  <p><a href="login.jsp">Back to Login</a></p>
</body></html>
