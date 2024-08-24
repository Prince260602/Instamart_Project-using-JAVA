<%@page import="DAO.UserDAO" import="Domain.User" import="java.text.ParseException" 
import="java.text.SimpleDateFormat"
import="java.util.Date"
import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request";
%>

<%@ page import="" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
					<div><a href="customerHome.jsp">Dashboard</a></div>
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
					<div class="head">My Account</div>
				</div><br>
				<div id="user-detail-container">
					<h1>Account Setting</h1><br>
					<div id="user-detail">
					<form action="editUser.jsp" method="get">
					<div>
					<% 
						User user=(User)session.getAttribute("user");						
					%>
						<div class="detail">
							<div><b>Firstname</b><br><%=user.getFirstName() %></div><br>
							<div><b>Username</b><br><%=user.getUsername() %></div><br>
							<div><b>Email</b><br><%=user.getEmail() %></div><br>
							<div><b>DOB</b><br><%=user.getDob() %></div><br>
						</div>
						<div class="detail">
							<div><b>Lastname</b><br><%=user.getLastName() %></div><br>
							<div><b>Password</b><br><%=user.getPassword() %></div><br>
							<div><b>Contact No</b><br><%=user.getContactNo() %></div><br>
							<div><b>Age</b><br><%=user.getAge() %></div><br>
						</div>
						<input type="submit" value="Edit" id="edit">
						</div>
						</form>
					</div>
				</div>
			</div>
			<div id="right-sec">
				<div id="logout"><a href="Logout">LOGOUT</a></div>
			</div>
		</div>
	</body>
</html>