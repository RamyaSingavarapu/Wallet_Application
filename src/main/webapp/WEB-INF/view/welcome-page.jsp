<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form action="customerPage">
 <h1 align="center">${MyWebsiteTitle}</h1>
 <p align="center">${message}</p>
 <hr>
 <a href="/sprint_3/customerPage">link to registration page</a>

 </form>
</body>
</html>