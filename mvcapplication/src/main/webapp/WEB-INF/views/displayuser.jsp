<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Users</title>
</head>
<body>
<h2>User Details are</h2>
<table border=1> 
<tr>
<td><c:out value="${user.name}"/></td>
<td><c:out value="${user.password}"/></td>
</tr>
</table>
</body>
</html>