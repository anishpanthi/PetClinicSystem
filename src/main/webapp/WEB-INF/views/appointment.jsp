<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
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
<title>AMT - Pet Clinic System</title>
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
		<form action="appointment" method="post">
			<div class="col-md-5  toppad  pull-right col-md-offset-3 ">
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<p class=" text-info">
						<br/>Welcome : ${pageContext.request.userPrincipal.name} | <a
							href="javascript:formSubmit()"> Logout</a>
					</p>
				</c:if>
			</div><br/><br/>
			<h1 align="center">Please Provide Your Information to make
				appointment.</h1>
			<div class="container">
				<table align="center">
					<tr>
						<td>
					<tr>
						<spring:bind path="appointmentForm.date">
							<td><label for="day">&nbsp;&nbsp;Appointment
									Day:&nbsp;&nbsp; </label></td>
							<td><form:input path="appointmentForm.date"
									class="form-control" id="date" name="date" /></td>
						</spring:bind>
					</tr>
					<tr>
						<spring:bind path="appointmentForm.time">
							<td><label for="time">&nbsp;&nbsp;Appointment
									Time:&nbsp;&nbsp;</label></td>
							<td><form:input path="appointmentForm.time"
									class="form-control" id="time" /></td>
						</spring:bind>
					</tr>
					<tr>
						<spring:bind path="appointmentForm.reason">
							<td><label for="reason">&nbsp;&nbsp;Reason:&nbsp;&nbsp;</label></td>
							<td><form:textarea path="appointmentForm.reason" rows="5"
									cols="30" class="form-control" id="reason" /></td>
						</spring:bind>
					</tr>

					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Submit"
							class="btn btn-default" /></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>