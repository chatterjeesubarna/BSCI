<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
<%@ page import ="java.sql.*" %>
<%
    String usershow = null;
    String userpg = null;
    String logshow = null;
    String logpg = null;
    
    if(session.getAttribute("userId") != null)
    {
        usershow = "Welcome " + session.getAttribute("userId").toString();
        userpg = "#";
        logshow = "Logoff";
        logpg = "logoff";
        //response.sendRedirect("login_aboutus.jsp");
    }
    else
    {
        usershow = "Register";
        userpg = "register";        
        logshow = "Login";
        logpg = "login";        
    }
%>

<html>

<head>
<title>Credentials</title>
<link href="default.css" rel="stylesheet" type="text/css" />
</head>

<body>

<% String n = request.getParameter("name");%>
								
<div id="header">
	<div id="logo">
		<h1><a href="#">Big-Sensor-Cloud Infrastructure</a></h1>
		<h2>By <a href="http://www.nodethirtythree.com/">SIT, IIT, Kharagpur</a> <a href="http://www.freecsstemplates.org/"></a></h2>
	</div>
	<marquee><b><font size = "4" color = "red" face="Lucida"><i>Big-Sensor-Cloud: A paradigm shift from traditional WSNs</i></font></b></marquee>
	
	<div id="menu">
		<ul>
			<li class="active"><a href="#" accesskey="1" title="">Home</a></li>
			<li><a href="#" accesskey="2" title="">Archives</a></li>
			<li><a href="#" accesskey="3" title="">About</a></li>
			<li><a href="#" accesskey="4" title="">Contact</a></li>
			<li><a href="logout.jsp" accesskey="4" title="">Logout</a></li>
		</ul>
	</div>
</div>

 
<div id="page">
	<div id="bg">
		<div id="content">
			<div class="post" style="padding-top: 57px;">
				<h2 class="title">Welcome to Big-Sensor-Cloud Infrastructure Version 1.0!</h2>
				<h3 class="date">Tuesday, October 28, 2014</h3>
				<div style="text-align: center;">
					<div style="box-sizing: border-box; display: inline-block; width: auto; max-width: 480px; background-color: #FFFFFF; border: 2px solid #0361A8; border-radius: 5px; box-shadow: 0px 0px 8px #0361A8; margin: 50px auto auto;">
						<div style="background: #0361A8; border-radius: 5px 5px 0px 0px; padding: 15px;"><span style="font-family: verdana,arial; color: #D4D4D4; font-size: 1.00em; font-weight:bold;">Get Credentials</span>
						</div>
						
							 <div style="background: ; padding: 15px">
								 <style type="text/css" scoped>
									td { text-align:left; font-family: verdana,arial; color: #064073; font-size: 1.00em; }
									input { border: 1px solid #CCCCCC; border-radius: 5px; color: #666666; display: inline-block; font-size: 1.00em;  padding: 5px; width: 100%; }
									input[type="button"], input[type="reset"], input[type="submit"] { height: auto; width: auto; cursor: pointer; box-shadow: 0px 0px 5px #0361A8; float: right; margin-top: 10px; }
									table.center { margin-left:auto; margin-right:auto; }
									.error { font-family: verdana,arial; color: #D41313; font-size: 1.00em; }
								</style>
								
								<center><font face='Verdana' size='2' color=green>Welcome <%=n %>
								
								<br><br><a href=update-profile.php>Update Profile</a> . <a href=change-password.php>Change Password</a> . <a href=logout.php>Logout</a></font></center><meta http-equiv="content-type" content="text/html; charset=UTF-8">
			  					<meta charset="utf-8">
			  					<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
			  					<title>Download Buttons</title>
			  					<!--<link rel="stylesheet" href="style.css">					
  								-->
   								<br><br>
								
								 <script type="text/javascript">             
								         alert ("Please download the key, and then create your Virtual Machine.");
								 </script> 

								 <a href="demo.private" download="http://10.14.18.159/login/key.private" class="button button-gray">Download Key</a> 
								<a href="iptable.php"  class="button button-darkblue">Create your Virtual Machine</a> 
								
								<br>
     								<input type="button" onClick="location.href='template1.jsp'" value="Next">
								<br>
								<form>
									<br>
								</form>
							</div>
					</div><!-- end box sizing -->
				</div>
			</div><!-- end post -->		
		</div> <!-- end contentn -->
		
		<div id="sidebar">
			<div id="about-box">
				<h2>About this Site</h2>
				<p>This site is under development.</p>
			</div>
			<ul>
				<li>
					<h2>Categories</h2>
					<ul>
						<li class="first"><a href="blue-login-box-html/login.html">Login</a></li>
						<li><a href="#">About us</a></li>
						<!--<li><a href="#">Donec felis duis</a></li>
						<li><a href="#">Eget tempus lorem</a></li>
						<li><a href="#">Veroeros consequat</a></li>
						<li><a href="#">Nullam blandit</a></li>
						<li><a href="#">Tempus aliquam </a></li> -->
					</ul>
				</li>
				<li>
					<h2>Links</h2>
					<ul>
						<li class="first"><a href="http://sit.iitkgp.ernet.in/~smisra/swan/index.html">SWAN</a></li>
						<li><a href="http://sit.iitkgp.ernet.in/">SIT</a></li>
						<li><a href="http://www.iitkgp.ac.in/">IIT Kharagpur</a></li>
					</ul>
				</li>
			</ul>
		</div><!-- end sidebar -->
		
		<div style="clear: both;">&nbsp;</div>
	</div><!-- end bg -->
</div><!-- end page -->

</body>
</html>