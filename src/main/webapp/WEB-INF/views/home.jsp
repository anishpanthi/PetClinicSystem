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
<!-- 	<nav class="navbar navbar-default"> -->
<!-- 		<div class="container-fluid"> -->
<!-- 			<!-- Brand and toggle get grouped for better mobile display -->
<!-- 			<div class="navbar-header"> -->
<!-- 				<button type="button" class="navbar-toggle collapsed" -->
<!-- 					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" -->
<!-- 					aria-expanded="false"> -->
<!-- 					<span class="sr-only">Toggle navigation</span> <span -->
<!-- 						class="icon-bar"></span> <span class="icon-bar"></span> <span -->
<!-- 						class="icon-bar"></span> -->
<!-- 				</button> -->
<!-- 				<a class="navbar-brand" href="#">Brand</a> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</nav> -->
<!-- 	<div class="container-fluid"> -->
<!-- 		<div class="row"> -->
<%-- 			<img src="${pageContext.request.contextPath}/resources/img/logo.jpg" class="img-responsive"> --%>
<!-- 		</div> -->
<!-- 	</div> -->

	<div class="container">
		<h1 align="center">
			<spring:message code="label.message" />
		</h1>

		<P align="center">
			<spring:message code="label.timeMessage" />
			${serverTime}.
		</P>
		<br /> <br /> <a href="login">Login</a> <br /> <br /> <a
			href="doctor">Doctor Registration</a> <br /> <br /> <a href="ownerRegistration">Owner
			Registration</a> <br /> <br /> <a href="feedback">Provide Feedback</a>
			<br /> <br /> <a href="payment">Make a Payment</a>
			<br /> <br /> <a href="appointment">Make an Appointment</a>
	</div>
</body>
</html>
