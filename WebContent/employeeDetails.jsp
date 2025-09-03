<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.project.servlet.Employee" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8"><title>Employee Details</title></head>
<body>
  <h2>Employee Details</h2>
  <p style="color:red;"><%= request.getAttribute("errorMessage") == null ? "" : request.getAttribute("errorMessage") %></p>

  <%
     Employee emp = (Employee)request.getAttribute("employee");
     if (emp == null) {
  %>
     <p>Employee not found.</p>
  <%
     } else {
  %>
     <form method="post" action="employeeDetails">
        ID: <input type="text" name="id" value="<%=emp.getId()%>" readonly /><br/>
        Name: <input type="text" name="name" value="<%=emp.getName()%>" /><br/>
        Department: <input type="text" name="department" value="<%=emp.getDepartment()%>" /><br/>
        <input type="submit" value="Update Employee"/>
     </form>
  <%
     }
  %>


  <p><a href="employees">Back to list</a> | <a href="logout.jsp">Logout</a></p>
  
</body></html>
