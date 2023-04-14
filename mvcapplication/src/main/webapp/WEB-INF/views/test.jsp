<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Test1 page loaded</h2>
<c:forEach var="d" items="${data}" >
<c:out value="${d.id}" />
</c:forEach>
</body>
</html>