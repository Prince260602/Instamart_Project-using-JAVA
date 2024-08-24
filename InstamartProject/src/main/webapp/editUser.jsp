<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Domain.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Settings</title>
		<link rel="stylesheet" type="text/css" href="stylesheet.css">
		
	</head>
	<body>
		<div id="container">
			<div id="left-sec">
				<div id="logo">
					<img alt="logo" src="resources/images/logo.svg" >
				</div><br>
				<div id="nav-list">
					<div><a href="">Dashboard</a></div>
					<div id="productsPage"><a href="Products">Products</a></div>
					<div id="packagePage"><a href="RentalPackages">Packages</a></div>
					<div class="active"><a href="Rentals">My Rentals</a></div>
					<div id="rentalPage"><a href="">My Orders</a></div>
					<div id="settings"><a href="settings.jsp">Settings</a></div>
				</div>
			</div>
			<div id="middle-sec">
				<div id="page-head">
					<div class="head">Home</div>
					<div><b>&ensp;/&ensp;</b></div>
					<div class="head">Settings</div>
					<div><b>&ensp;/&ensp;</b></div>
					<div class="head">Edit</div>
				</div><br>
				<div id="user-detail-container">
					<h1>Account Setting</h1><br>
					<div id="user-detail">
						<form action="UpdateUser" method="get">
						<%
							User user=(User)session.getAttribute("user");						
						%>
						
						<div>
							<div>
								<input type="text" id="firstname" name="firstname" placeholder="Firstname" value="<%=user.getFirstName() %>">
							</div><br>
							<div>
								<input type="text" id="lastname" name="lastname" placeholder="Lastname" value="<%=user.getLastName() %>">
							</div><br>
							<div>
								<input type="text" id="usertname" name="username" placeholder="Username" readonly="readonly" value="<%=user.getUsername() %>">
							</div><br>
							<div>
								<input type="text" id="email" name="email" placeholder="Email" value="<%=user.getEmail() %>">
							</div><br>
							<div>
								<input type="text" id="password" name="password" placeholder="Password" value="<%=user.getPassword() %>">
							</div><br>
							<div>
								<input type="text" id="contactNo" name="contactNo" placeholder="Contact No" value="<%=user.getContactNo() %>">
							</div><br>
							<div>
								<input type="text" id="dob" name="dob" placeholder="DOB (yyyy-MM-dd)" value="<%=user.getDob() %>">
							</div><br>
								<input type="text" id="age" name="age" placeholder="Age" value="<%=user.getAge() %>">
							</div><br><br>
								<div id="cancel"><a href="setting.jsp">CANCEL</a></div>
								<input type="submit" value="UPDATE" id="update">
							</div>
						</form>
					</div>
				</div>
				<div id="right-sec">
				<div id="logout"><a href="Logout">LOGOUT</a></div>
				</div>
			</div>
	</body>
</html>
