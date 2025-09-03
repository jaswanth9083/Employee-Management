<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.project.servlet.Employee" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8"><title>Employee List</title></head>
<body>
  <h2>Employee List</h2>
  <p style="color:red;"><%= request.getAttribute("errorMessage") == null ? "" : request.getAttribute("errorMessage") %></p>

  <%
    List<Employee> employees = (List<Employee>)request.getAttribute("employees");
    if (employees == null || employees.isEmpty()) {
  %>
      <p>No employees found.</p>
  <%
    } else {
  %>
      <table border="1" cellpadding="6">
        <tr><th>ID</th><th>Name</th><th>Department</th></tr>
        <%
          for (Employee e : employees) {
        %>
          <tr>
            <td><a href="employeeDetails?id=<%=e.getId()%>"><%=e.getId()%></a></td>
            <td><%=e.getName()%></td>
            <td><%=e.getDepartment()%></td>
          </tr>
        <% } %>
      </table>
  <% } %>


  <p><a href="index.jsp">Home</a> | <a href="logout.jsp">Logout</a></p>
  
</body></html>
