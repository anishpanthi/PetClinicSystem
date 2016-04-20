<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/default.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/default.date.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/default.time.css" />"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-1.12.3.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/picker.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/picker.date.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/picker.time.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/customdate.js" />"></script>
<title>Fill Payment Details</title>
</head>
<body>

	<div align="center">
		<h1>Please Complete all the fields!</h1>
		<form action="payment" method="post">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Credit Card
							Information</h2></td>
				</tr>
				<tr>
					<spring:bind path="paymentForm.creditNumber">
						<td><label for="creditNumber">&nbsp;&nbsp;Credit
								Number:&nbsp;&nbsp;</label></td>
						<td><form:input path="paymentForm.creditNumber"
								class="form-control" id="creditNumber" /></td>
					</spring:bind>
				</tr>
				<tr>
					<td><label>Payment Modes:</label></td>
				<td><form:select path="paymentForm.paymentMode" class="form-control">
						<form:option value="NONE">Select Payment Mode:</form:option>
						<c:forEach items="${modes}" var="mode">
							<form:option value="${mode}">${mode}</form:option>
						</c:forEach>
					</form:select></td>
				</tr>

				<tr>
					<spring:bind path="paymentForm.ownerid">
						<td><label for="ownerid">&nbsp;&nbsp; Owner
								Id:&nbsp;&nbsp;</label></td>
						<td><form:input path="paymentForm.ownerid"
								class="form-control" id="ownerid" /></td>
					</spring:bind>
				</tr>
				<tr>
					<spring:bind path="paymentForm.amount">
						<td><label for="amount">&nbsp;&nbsp;
								Amount:&nbsp;&nbsp;</label></td>
						<td><form:input path="paymentForm.amount"
								class="form-control" id="amount" /></td>
					</spring:bind>
				</tr>
				<tr>
					<spring:bind path="paymentForm.paymentDate">
						<td><label for="paymentDate">&nbsp;&nbsp; Payment
								Date:&nbsp;&nbsp;</label></td>
						<td><form:input path="paymentForm.paymentDate"
								class="form-control" id="paymentDate" /></td>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="Submit"
						class="btn btn-default" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>