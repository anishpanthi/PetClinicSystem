<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<title><spring:message code="label.title" /></title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h1 align="center">
			<spring:message code="label.message" />
		</h1>

		<P align="center">
			<spring:message code="label.timeMessage" />
			${serverTime}.
		</P>
		<br /> <br /> <a href="login">Login</a> <br /> <br /> <a
			href="doctor">Doctor Registration</a> <br /> <br /> <a
			href="ownerRegistration">Owner Registration</a> <br /> <br /> <a
			href="feedback">Provide Feedback</a> <br /> <br />
	</div>
</body>
</html>
