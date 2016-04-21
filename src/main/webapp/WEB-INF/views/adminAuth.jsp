<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>AMT - Pet Clinic System - Doctor</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />

<style>
body, html {
	height: 100%;
	background-repeat: no-repeat;
	background-image: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));
}

.user-row {
	margin-bottom: 14px;
}

.user-row:last-child {
	margin-bottom: 0;
}

.dropdown-user {
	margin: 13px 0;
	padding: 5px;
	height: 100%;
}

.dropdown-user:hover {
	cursor: pointer;
}

.table-user-information>tbody>tr {
	border-top: 1px solid rgb(221, 221, 221);
}

.table-user-information>tbody>tr:first-child {
	border-top: 0;
}

.table-user-information>tbody>tr>td {
	border-top: 0;
}

.toppad {
	margin-top: 20px;
}
</style>
<script>
	$(document)
			.ready(
					function() {
						var panels = $('.user-infos');
						var panelsButton = $('.dropdown-user');
						panels.hide();

						//Click dropdown
						panelsButton
								.click(function() {
									//get data-for attribute
									var dataFor = $(this).attr('data-for');
									var idFor = $(dataFor);

									//current button
									var currentButton = $(this);
									idFor
											.slideToggle(
													400,
													function() {
														//Completed slidetoggle
														if (idFor
																.is(':visible')) {
															currentButton
																	.html('<i class="glyphicon glyphicon-chevron-up text-muted"></i>');
														} else {
															currentButton
																	.html('<i class="glyphicon glyphicon-chevron-down text-muted"></i>');
														}
													})
								});

						$('[data-toggle="tooltip"]').tooltip();

						$('button').click(function(e) {
							e.preventDefault();
							alert("This is a demo.\n :-)");
						});
					});
</script>
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
	<div class="container">
		<div class="row">
			<div class="col-md-5  toppad  pull-right col-md-offset-3 ">
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<p class=" text-info">
						Welcome : ${pageContext.request.userPrincipal.name} | <a
							href="javascript:formSubmit()"> Logout</a>
					</p>
				</c:if>
			</div>
			<div
				class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">Admin</h3>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-3 col-lg-3 " align="center">
								<img alt="User Pic"
									src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png"
									class="img-circle img-responsive">
							</div>

							<div class=" col-md-9 col-lg-9 ">
								<table class="table table-user-information">
									<tbody>
										<tr>
											<td>First Name:</td>
											<td>${admin.firstname}</td>
										</tr>
										<tr>
											<td>Last Name:</td>
											<td>${admin.lastname}</td>
										</tr>
										<tr>
											<td>Email:</td>
											<td>${admin.email}</td>
										</tr>
										<tr>
											<td>House Number:</td>
											<td>${admin.housenumber}</td>
										</tr>

										<tr>
											<td>Phone:</td>
											<td>${admin.phone}</td>
										</tr>
										<tr>
											<td>State Name</td>
											<td>${admin.statename}</td>
										</tr>
										<tr>
											<td>City</td>
											<td>${admin.city}</td>
										</tr>
										<tr>
											<td>Street Number</td>
											<td>${admin.streetnumber}</td>
										</tr>
										<tr>
											<td>Zip Code</td>
											<td>${admin.zipcode}</td>
										</tr>
									</tbody>
								</table>

								<a href="admin/listDoctors" class="btn btn-primary">Doctor
									Details</a> <a href="admin/listOwners" class="btn btn-primary">Owner
									Details</a> <a href="admin/listAppointments"
									class="btn btn-primary">Appointment Details</a>
							</div>
						</div>
					</div>
					<div class="panel-footer">
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>