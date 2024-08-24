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

                <h6 class="text-center mb20 mt20">Welcome  Instasmarter Project ! </h6>

                <%if(request.getAttribute("success") != null) { %>

                        <label style="text-align:center;color:green;"id="success">

                            <span><%=request.getAttribute("success") %></span>

                            <div class="clr"></div>

                        </label>

                        <%request.removeAttribute("success");} %>

                <%if(request.getAttribute("error") != null) { %>

                        <label class="error-text" id="error">

                            <span><%=request.getAttribute("error") %></span>

                            <img src="resources/images/icons/warning_sign.svg" />

                            <div class="clr"></div>

                        </label>

                        <%request.removeAttribute("error");} %>

                <div class="clr20"></div>

				<form action="Validation" method="post">

                <div class="center-block form-md">

                    <div class="form-group">

                        <input type="text" class="form-control" id="email" name="username"" placeholder="Username">

                    </div>
 
                    <div class="form-group">

                        <input type="password" class="form-control" id="password" name="password" placeholder="Password">

                    </div>

                    <div class="clr20"></div>
 
                    <div class="text-center mb10">

                     <input type="submit" name="login" value="Sign In" id="login" class="btn btn_primary" / >

                    </div>

                    </form>

                    <div class="clr20"></div>
 
                    <div class="forgetlink mt10">

                        <span>Register to INSTASMART ?</span>

                        <a href="signup.jsp" id='signUp' class="alink">Sign Up</a>

                        <span> instead</span>

                    </div>

                </div>

                <div class="clr"></div>

            </div>

            <div class="clr"></div>

        </div>

        <div class="clr"></div>

    </body>

</html>
