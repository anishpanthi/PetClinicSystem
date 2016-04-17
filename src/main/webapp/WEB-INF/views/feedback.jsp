<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Us Feedback</title>
</head>
<body>
	<h1>Please Provide Your Valuable Feedback.</h1>
	<form action="feedback" method="post">
		<table>
			<tr>
				<spring:bind path="feedback.firstname">
					<td><label>First Name:</label></td>
					<td><form:input path="feedback.firstname" /></td>
				</spring:bind>
			</tr>
			<tr>
				<spring:bind path="feedback.lastname">
					<td><label>Last Name:</label></td>
					<td><form:input path="feedback.lastname" /></td>
				</spring:bind>
			</tr>
			<tr>
				<spring:bind path="feedback.email">
					<td><label>Email:</label></td>
					<td><form:input path="feedback.email" /></td>
				</spring:bind>
			</tr>
			<tr>
				<spring:bind path="feedback.comments">
					<td><label>Comments:</label></td>
					<td><form:textarea path="feedback.comments" rows="5" cols="30" /></td>
				</spring:bind>
			</tr>
		</table>

		<br /> <input type="submit" value="Submit" />
	</form>
</body>
</html>