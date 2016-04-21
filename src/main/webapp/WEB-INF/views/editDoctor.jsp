<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
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
	</div>
	<div align="center">
		<div class="col-md-5  toppad  pull-right col-md-offset-3 ">
			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<p class=" text-info">
					Welcome : ${pageContext.request.userPrincipal.name} | <a
						href="javascript:formSubmit()"> Logout</a>
				</p>
			</c:if>
		</div>
		<h1>Please Complete all the fields!</h1>
		<form action="${editDoctor.id}" method="post">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Edit Doctor
							Information</h2></td>
				</tr>
				<tr>
					<spring:bind path="editDoctor.firstname">
						<td><label for="firstname">&nbsp;&nbsp;First
								Name:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.firstname"
								class="form-control" id="firstname" /></td>
						<%-- 						<td><form:errors path="doctorForm.firstname" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="editDoctor.lastname">
						<td><label for="lastname">&nbsp;&nbsp;Last
								Name:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.lastname"
								class="form-control" id="lastname" /></td>
						<%-- 						<td><form:errors path="doctorForm.lastname" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<spring:bind path="editDoctor.email">
						<td><label for="email">&nbsp;&nbsp;
								Email:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.email" class="form-control"
								id="email" /></td>
						<%-- 						<td><form:errors path="doctorForm.email" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>

				<tr>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="editDoctor.city">
						<td><label for="city">&nbsp;&nbsp; City:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.city" class="form-control"
								id="city" /></td>
						<%-- 						<td><form:errors path="doctorForm.city" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="editDoctor.housenumber">
						<td><label for="housenumber">&nbsp;&nbsp; House
								Number:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.housenumber"
								class="form-control" id="housenumber" /></td>
						<%-- 						<td><form:errors path="doctorForm.housenumber" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="editDoctor.statename">
						<td><label for="statename">&nbsp;&nbsp;
								State:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.statename"
								class="form-control" id="statename" /></td>
						<%-- 						<td><form:errors path="doctorForm.statename" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="editDoctor.streetnumber">
						<td><label for="streetNumber">&nbsp;&nbsp; Street
								Number:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.streetnumber"
								class="form-control" id="streetnumber" /></td>
						<%-- 						<td><form:errors path="doctorForm.streetnumber" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="editDoctor.zipcode">
						<td><label for="zipcode">&nbsp;&nbsp; Zip
								Code:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.zipcode"
								class="form-control" id="zipcode" /></td>
						<%-- 						<td><form:errors path="doctorForm.zipcode" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<spring:bind path="editDoctor.phone">
						<td><label for="phone">&nbsp;&nbsp;
								Phone:&nbsp;&nbsp;</label></td>
						<td><form:input path="editDoctor.phone" class="form-control"
								id="phone" /></td>
						<%-- 						<td><form:errors path="doctorForm.phone" --%>
						<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="Submit"
						class="btn btn-default" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>