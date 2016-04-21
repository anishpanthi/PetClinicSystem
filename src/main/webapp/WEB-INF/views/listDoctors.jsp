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

	<div class="container">
		<h1 align="center">List of Doctors</h1>
		<table class="table table-striped">
			<th>First Name</th>
			<th>Last Name</th>
			<th>House Number</th>
			<th>Phone</th>
			<th>State Name</th>
			<th>Street Number</th>
			<th>Zip Code</th>
			<th colspan="2" align="center">Actions</th>
			<c:forEach var="doctor" items="${doctors}">
				<tr>
					<td>${doctor.firstname}</td>
					<td>${doctor.lastname}</td>
					<td>${doctor.housenumber}</td>
					<td>${doctor.phone}</td>
					<td>${doctor.statename}</td>
					<td>${doctor.streetnumber}</td>
					<td>${doctor.zipcode}</td>
					<td><a href="listDoctors/edit/${doctor.id}"
						class="btn btn-primary">Update</a></td>
					<td><a href="listDoctors/delete/${doctor.id}"
						class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>