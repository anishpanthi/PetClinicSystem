<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title><spring:message code="label.title" /></title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<br /> <span style="float: right"> <a href="?lang=en">English</a>
			| <a href="?lang=am">Ethiopia</a> | <a href="?lang=np">Nepali</a> | <a
			href="?lang=de">Dutch</a>
		</span>
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
			href="feedback">Provide Feedback</a> <br /> <br /> <a
			href="listFeedbacks">List All Feedback</a> <br /> <br />
	</div>
</body>
</html>
