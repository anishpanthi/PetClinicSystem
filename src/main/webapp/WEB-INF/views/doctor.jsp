<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<title>Doctor Registration</title>
</head>
<body>
	<div align="center">
		<h1>Please Complete all the fields!</h1>
		<form action="doctor" method="post">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Doctor Information</h2></td>
				</tr>
				<tr>
					<spring:bind path="doctorForm.firstname">
						<td><label for="firstname">&nbsp;&nbsp;First
								Name:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.firstname"
								class="form-control" id="firstname" /></td>
<%-- 						<td><form:errors path="doctorForm.firstname" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="doctorForm.lastname">
						<td><label for="lastname">&nbsp;&nbsp;Last
								Name:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.lastname"
								class="form-control" id="lastname" /></td>
<%-- 						<td><form:errors path="doctorForm.lastname" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<spring:bind path="doctorForm.email">
						<td><label for="email">&nbsp;&nbsp;
								Email:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.email" class="form-control"
								id="email" /></td>
<%-- 						<td><form:errors path="doctorForm.email" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="userForm.username">
						<td><label for="username">&nbsp;&nbsp;
								Username:&nbsp;&nbsp;</label></td>
						<td><form:input path="userForm.username" class="form-control"
								id="username" /></td>
<%-- 						<td><form:errors path="userForm.username" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<spring:bind path="userForm.password">
						<td><label for="password">&nbsp;&nbsp;
								PassWord:&nbsp;&nbsp;</label></td>
						<td><form:password path="userForm.password"
								class="form-control" id="password" /></td>
<%-- 						<td><form:errors path="userForm.password" --%>
<%-- <%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="doctorForm.city">
						<td><label for="city">&nbsp;&nbsp; City:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.city" class="form-control"
								id="city" /></td>
<%-- 						<td><form:errors path="doctorForm.city" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="doctorForm.housenumber">
						<td><label for="housenumber">&nbsp;&nbsp; House
								Number:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.housenumber"
								class="form-control" id="housenumber" /></td>
<%-- 						<td><form:errors path="doctorForm.housenumber" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="doctorForm.statename">
						<td><label for="statename">&nbsp;&nbsp;
								State:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.statename"
								class="form-control" id="statename" /></td>
<%-- 						<td><form:errors path="doctorForm.statename" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="doctorForm.streetnumber">
						<td><label for="streetNumber">&nbsp;&nbsp; Street
								Number:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.streetnumber"
								class="form-control" id="streetnumber" /></td>
<%-- 						<td><form:errors path="doctorForm.streetnumber" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="doctorForm.zipcode">
						<td><label for="zipcode">&nbsp;&nbsp; Zip
								Code:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.zipcode"
								class="form-control" id="zipcode" /></td>
<%-- 						<td><form:errors path="doctorForm.zipcode" --%>
<%-- 								cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<spring:bind path="doctorForm.phone">
						<td><label for="phone">&nbsp;&nbsp;
								Phone:&nbsp;&nbsp;</label></td>
						<td><form:input path="doctorForm.phone" class="form-control"
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