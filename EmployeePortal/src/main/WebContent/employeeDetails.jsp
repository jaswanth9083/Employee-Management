<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<h2>Employee Details</h2>
    <p>This page will later display employee details fetched by ID.</p>
    
    <form method = "post" action = "updateEmployee">
    	ID : <input type="text" name="id" value="101"/><br/>
    	Name : <input type="text" name="name" value="jashu G"/><br/>
    	Department : <input type="text" name="department" value="Engineering"/><br/>
    	<input type="submit" value="Update Employee">
    </form>
</body>
</html>