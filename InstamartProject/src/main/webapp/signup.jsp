<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

    <head>

        <title>Furniture Rental - SignUp</title>

        <meta charset="utf-8">

        <link rel="icon" type="image/x-icon" href="resources/images/favicon.ico">

        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=1.0">

        <meta name="description" content="Furniture Rental"/>

        <link href="resources/css/furniture_rental.css" rel="stylesheet">
 
    </head>

    <body>

    <form action="signup" method="get">

        <div class="login-block">

            <div class="login-set">

                <div class="mainlogo">

                    <img src="resources/images/logo.svg" />

                </div>

                <h6 class="text-center mb20 mt20">Signup to feel the rental experience</h6>

                <div class="clr20"></div>
 
                <div class="center-block form-md">

                    <div class="form-group">

                        <input type="text" class="form-control" id="firstname" name="firstname" placeholder="First Name">

                    </div>
 
                    <div class="form-group">

                        <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Last Name">

                    </div>
 
                    <div class="form-group">

                        <input type="text" class="form-control" id="username" name="username" placeholder="Username">

                        <%if(request.getAttribute("error") != null) { %>

                        <label class="error-text" id="errorMsg">

                            <span><%=request.getAttribute("error") %></span>

                            <img src="resources/images/icons/warning_sign.svg" />

                            <div class="clr"></div>

                        </label>

                        <%} %>

                    </div>
 
                    <div class="form-group">

                        <input type="email" class="form-control" id="email" name="email" placeholder="Email">

                    </div>
 
                    <div class="form-group">

                        <input type="password" class="form-control" id="password" name="password" placeholder="Password">

                    </div>

                    <div class="clr20"></div>
 
                    <div class="text-center mb10">

                        <input type="submit" class="btn btn_primary" id="register"value="Sign Up">

                    </div>

                    <div class="clr20"></div>
 
                    <div class="forgetlink mt10">

                        <span>Already a user ?</span>

                        <a href="index.jsp" class="alink">Sign in</a>

                        <span> instead</span>

                    </div>

                </div>

                <div class="clr"></div>

            </div>

            <div class="clr"></div>

        </div></form>

        <div class="clr"></div>

    </body>

</html>
