<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management Application</title>
</head>
<body>
<h1> Hello ${user}, Welcome!</h1>
<h2 style="color:green">Student Management Application</h2>
<ul>
<li><a href="add">Add a Student</a></li>
<li><a href="search">Search a Student</a></li>
<li><a href="delete">Delete a Student</a></li>
</ul>
</body>
</html>