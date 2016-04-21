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
<title>Amt - Pet Clinic System</title>
</head>
<body>
	<div class="container">
		<c:url value="/j_spring_security_logout" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
	</div>
	<h1 align="center">List Of Owners</h1>
	<div class="container">
		<div class="col-md-5  toppad  pull-right col-md-offset-3 ">
			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<p class=" text-info">
					Welcome : ${pageContext.request.userPrincipal.name} | <a
						href="javascript:formSubmit()"> Logout</a>
				</p>
			</c:if>
		</div>
		<table class="table table-striped">
			<th>First Name</th>
			<th>Last Name</th>
			<th>House Number</th>
			<th>Phone</th>
			<th>State Name</th>
			<th>Street Number</th>
			<th>Zip Code</th>
			<th colspan=2>Action</th>
			<c:forEach var="owner" items="${owners}">
				<tr>
					<td>${owner.firstname}</td>
					<td>${owner.lastname}</td>
					<td>${owner.housenumber}</td>
					<td>${owner.phone}</td>
					<td>${owner.statename}</td>
					<td>${owner.streetnumber}</td>
					<td>${owner.zipcode}</td>
					<td><a href="listOwners/edit/${owner.id}"
						class="btn btn-primary">Update</a></td>
					<td><a href="listOwners/delete/${owner.id}"
						class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>