<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1 class=table>
		<tr>
			<th>Employee Number</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Salary</th>
			<th>Department Name</th>
		</tr>

		<c:set var="employee" value="${Employee }"></c:set>
		<tr class=success>
			<td><c:out value="${Employee.getNumber()}"></c:out></td>
			<td><c:out value="${Employee.getFirstName()}"></c:out></td>
			<td><c:out value="${Employee.getLastName()}"></c:out></td>
			<td><c:out value="${Employee.getGender()}"></c:out></td>
			<td><c:out value="${Employee.getSalary()}"></c:out></td>
			<td><c:out value="${Employee.getDeptName()}"></c:out></td>
		</tr>
	</table>
	<a href="/home">Home Page</a>
</body>
</html>