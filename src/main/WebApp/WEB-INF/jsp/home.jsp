<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmployeeSpringMVC</title>
</head>
<body>

<h1> Employee Operations</h1>
${message}<br>
${requestScope.nouser}<br>

<a href = "/employee/employeeSearch">Employee Search</a><br>
<a href = "/employee/AddUpdate">Add/Update Employee</a><br>

</body>
</html>