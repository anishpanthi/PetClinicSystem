<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Owner Registration</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div align="center">
			<h1>Please Complete all the fields!</h1>
			<form action="ownerRegistration" method="post">
				<table border="0">
					<tr>
						<td colspan="2" align="center"><h2>Owner Information</h2></td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.firstname">
							<td>First Name:</td>
							<td><form:input path="ownerForm.firstname"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.firstname" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.lastname">
							<td>Last Name:</td>
							<td><form:input path="ownerForm.lastname"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.lastname" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.email">
							<td>Email:</td>
							<td><form:input path="ownerForm.email" class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.email" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.phone">
							<td>Phone Number:</td>
							<td><form:input path="ownerForm.phone" class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.phone" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>

					<tr>
						<spring:bind path="ownerForm.city">
							<td>City:</td>
							<td><form:input path="ownerForm.city" class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.city" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.housenumber">
							<td>House Number:</td>
							<td><form:input path="ownerForm.housenumber"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.housenumber" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.statename">
							<td>State:</td>
							<td><form:input path="ownerForm.statename"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.statename" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.streetnumber">
							<td>Street Number:</td>
							<td><form:input path="ownerForm.streetnumber"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.streetnumber" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="ownerForm.zipcode">
							<td>Zip Code:</td>
							<td><form:input path="ownerForm.zipcode"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="ownerForm.zipcode" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="userForm.username">
							<td>User Name:</td>
							<td><form:input path="userForm.username"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="userForm.username" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="userForm.password">
							<td>Password:</td>
							<td><form:password path="userForm.password"
									class="form-control" /></td>
							<%-- 							<td><form:errors path="userForm.password" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<td colspan="2" align="center"><h2>Pet Information</h2></td>
					<tr>
						<spring:bind path="petForm.type">
							<td>Pet Type:</td>
							<td><form:input path="petForm.type" class="form-control" /></td>
							<%-- 							<td><form:errors path="petForm.type" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="petForm.gender">
							<td>Gender:</td>
							<td><form:input path="petForm.gender" class="form-control" /></td>
							<%-- 							<td><form:errors path="petForm.gender" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<spring:bind path="petForm.age">
							<td>Age:</td>
							<td><form:input path="petForm.age" class="form-control" /></td>
							<%-- 							<td><form:errors path="petForm.age" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>

					<tr>
						<spring:bind path="petForm.name">
							<td>Pet Name:</td>
							<td><form:input path="petForm.name" class="form-control" /></td>
							<%-- 							<td><form:errors path="petForm.name" --%>
							<%-- 									cssStyle="color: #ff0000;" class="alert alert-danger" /></td> --%>
						</spring:bind>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>

					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Register" class="btn btn-default" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>