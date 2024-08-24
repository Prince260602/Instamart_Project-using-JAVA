<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <title>Instasmart - Login</title>
        <meta charset="utf-8">
        <link rel="icon" type="image/x-icon" href="resources/images/favicon.ico">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=1.0">
        <meta name="description" content="Furniture Rental"/>
        <link href="resources/css/furniture_rental.css" rel="stylesheet">
    </head>
    
    <body>
        <div class="login-block">
            <div class="login-set">
                <div class="mainlogo">
                    <img src="resources/images/logo.svg" />
                </div>
                <h6 class="text-center mb20 mt20">Fill details to create your profile</h6>
                <div class="clr20"></div>
				<form action="UpdateDetail" method="post">
                <div class="center-block form-md">
                    <div class="form-group">
                        <input type="text" class="form-control" id="dob" name="dob" placeholder= "DOB (dd/MM/yyyy)" required="" >
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="age" name="age" placeholder="Age" required="">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="contactNo" name="contactNo" placeholder="Contact Number" required="">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="street" name="street" placeholder="Street" required="">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="city" name="city"" placeholder="City" required="">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="state" name="state"" placeholder="State" required="">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="country" name="country" placeholder="Country" required="">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="pinCode" name="pinCode" placeholder="Pin code" required="">
                    </div>
                    <div class="clr20"></div>
                    <div class="text-center mb10">
                     <input type="submit" name="updateDetail" value="UPDATE DETAIL" id="updateDetail" class="btn btn_primary" / >
                    </div>
                    </form>
                    <div class="clr20"></di>
                </div>
                <div class="clr"></div>
            </div>
            <div class="clr"></div>
        </div>
        <div class="clr"></div>
    </body>
</html>