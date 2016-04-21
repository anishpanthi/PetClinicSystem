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
<title>AMT - Pet Clinic System</title>
</head>
<body>
	<h1 align="center">Customer Payment Information</h1>
	<div class="container">
		<table class="table table-striped">
			<th>Credit Number</th>
			<th>Payment Mode</th>
			<th>Owner Id</th>
			<th>Payment Date</th>
			<th>Amount</th>
			<c:forEach var="pay" items="${payments}">
				<tr>
					<td>${pay.creditNumber}</td>
					<td>${pay.paymentMode}</td>
					<td>${pay.ownerid}</td>
					<td>${pay.paymentDate}</td>
					<td>${pay.amount}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>