<%@page import="DAO.UserDAO" import="Domain.User" import="java.text.ParseException" 
import="java.text.SimpleDateFormat"
import="java.util.Date"
%>

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
					<div class="head">Product</div>
					<div><b>&ensp;/&ensp;</b></div>
					<div class="head">Create</div>					
				</div><br><br>
				<div id="product-detail-container">
					<center><div><h1>Create Product</h1></div></center><br>
					<form action="CreateProduct">
					<div id="product-detail">
					<div>
						<div class="detail">
							<div>
								<input type="text" id="name" name="name" placeholder="Name" >
							</div><br>
							<div>
								<select name="catalogServiceSector">
									<option>-CatalogServiceSector-</option>
									<option value="home">1.Home</option>
									<option value="office">2.Office</option>
								</select>
							</div><br>
							<div>
								<select name="prductCategory">
									<option>-ProductCategory-</option>
									<option value="furniture">1.Furniture</option>
									<option value="electronics">2.Electronics</option>
									<option value="appliance">3.Appliance</option>
								</select>
							</div><br>
							<div>
								<input type="text" id="dimensions" name="dimensions" placeholder="Dimensions (height x breadth x length) in cm">
							</div><br>
							<div>
								<select name="material">
									<option>-Material-</option>
									<option value="wood">1.Wood</option>
									<option value="steel">2.Steel</option>
									<option value="leather">3.Leather</option>
									<option value="metal">4.Metal</option>
									<option value="ceramic">5.Ceramic</option>
									<option value="glass">6.Glass</option>
								</select>
							</div><br>
							<div>
								<input type="text" id="imageUrl" name="imageUrl" placeholder="ImageUrl">
							</div><br>
							<div>
								<input type="text" id="productRate" name="productRate" placeholder="Cost/month">
							</div><br>
						</div>
						<div class="detail">
							<div>
								<select name="brand">
									<option>-Brand-</option>
									<option value="bosh">1.Bosh</option>
									<option value="samsung">2.Samsung</option>
									<option value="lg">3.LG</option>
									<option value="whirlpool">4.Whirlpool</option>
									<option value="onida">5.Onida</option>
									<option value="stanley">6.Stanley</option>
									<option value="mintwud">7.Mintwud</option>
									<option value="philips">8.Philips</option>
								</select>
							</div><br>
							<div>
								<select name="catalogServiceArea">
									<option>-CatalogServiceArea-</option>
									<option value="livingRoom">1.Living Room</option>
									<option value="conferenceRoom">2.Conference Room</option>
									<option value="privateOffice">3.Private Office</option>
									<option value="diningRoom">4.Dining Room</option>
									<option value="launtryRoom">5.Launtry Room</option>
									<option value="bedRoom">6.Bed Room</option>
									<option value="Kitchen">7.Kitchen</option>
								</select>
							</div><br>
							<div>
								<select name="prductType">
									<option>-ProductType-</option>
									<option value="chair">1.Chair</option>
									<option value="tv">2.TV</option>
									<option value="sofa">3.Sofa</option>
									<option value="washingMachine">4.Washing Machine</option>
									<option value="table">5.Table</option>
									<option value="bed">6.Bed</option>
									<option value="oven">7.Oven</option>
									<option value="desk">8.Desk</option>
									<option value="mic">9.Mic</option>
									<option value="laptop">10.Laptopon</option>
									<option dinningTable>11.Dinning Table</option>
								</select>
							</div><br>
							<div>
								<input type="text" id="weight" name="weight" placeholder="Weight in kg">
							</div><br>
							<div>
								<input type="text" id="colors" name="colors" placeholder="colors">
							</div><br>
							<div>
								<input type="text" id="city" name="city" placeholder="Location">
							</div><br>
						</div>
						</div>
						</div>
						<center>
							<button id="cancelProductCreation"><a href="listProducts.jsp">CANCEL</a></button>
							<input type="submit" value="Create" id="productCreate">
						</center>
					</form>
				</div>
			</div>
			<div id="right-sec">
				<div id="logout"><a href="Logout">LOGOUT</a></div>
			</div>
		</div>
	</body>
</html>