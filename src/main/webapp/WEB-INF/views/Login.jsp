<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	margin: auto;
	min-height: 200px;
}

/* Hide the carousel text when the screen is less than 600 pixels wide */
@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
}
</style>
<script>
	function login(){
	        	if(document.getElementById("user_name").value=="Scott" && document.getElementById("user_password").value=="Tiger"){
	        		document.location.href = 'webapp/Main.jsp';
	        	}else{
	        		alert("Login Failed");
	        	}
	      }
	
</script>
</head>
<body>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar"></button>
			<a class="navbar-brand" href="#">IMCS Employee Application</a>
		</div>
	</div>
	</nav>
<form id="form" method="post">
		<div class="form-group">
			<label class="col-md-4 control-label">UserName*</label>
			<div class="col-md-4 inputGroupContainer">
				<div class="input-group">
					<input id="user_name" placeholder="Username" class="form-control"
						type="text" required>
				</div>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-4 control-label">Password*</label>
			<div class="col-md-4 inputGroupContainer">
				<div class="input-group">
					<input id="user_password" placeholder="Password"
						class="form-control" type="password" required>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="col-md-4">
				<button type="button" class="btn" onclick="login()">Submit</button>
			</div>
		</div>

	</form></body>
</html>