<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<body>
	<form:form action="addCustomer" method="POST" modelAttribute="cust">
		<input type="text" name="fname">
		<input type="text" name="lname">
		<input type="text" name="phNo">
		<input type="text" name="password">
		<input type="submit" name="submit">
	</form:form>

</body>
</html>