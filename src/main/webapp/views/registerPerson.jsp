<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="/register" method="post" modelAttribute="person">
	<table>
		<tr>
			<td><form:label path="id" > ID: </form:label></td>
			<td><form:input path="id" /></td>
		<tr>
		<tr>
			<td><form:label path="name"> Name:</form:label></td>
			<td><form:input path="name" /></td>
		<tr>
		<tr>
			<td><form:label path="age" />Age:</td>
			<td><form:input path="age" /></td>
		<tr>
		<tr>
			<td><form:label path="salary"> Salary:</form:label></td>
			<td><form:input path="salary" /></td>
		<tr>
		<tr>
			<td><input type="submit"></td>
			<td><input type="reset"></td>
		</tr>
	</table>
</form:form>
</body>
</html>