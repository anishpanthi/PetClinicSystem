<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<title>Feedbacks</title>
</head>
<body>
	<h1 align="center">Customer Feedbacks</h1>
	<div class="container">
		<table class="table table-striped">
			<th>First Name</th>
			<th>Last Name</th>
			<th>House Number</th>
			<th>Phone</th>
			<th>State Name</th>
			<th>Street Number</th>
			<th>Zip Code</th>
			<!-- 			<th> Pet List</th>		 -->
			<c:forEach var="doctor" items="${doctors}">
				<tr>
					<td>${doctor.firstname}</td>
					<td>${doctor.lastname}</td>
					<td>${doctor.housenumber}</td>
					<td>${doctor.phone}</td>
					<td>${doctor.statename}</td>
					<td>${doctor.streetnumber}</td>
					<td>${doctor.zipcode}</td>
					<%-- 					<td>${doctor.petlist}</td> --%>
				</tr>
			</c:forEach>
		</table>
		<br />
		<br /> <a href="/petclinic">Goto Home</a>
	</div>
</body>
</html>