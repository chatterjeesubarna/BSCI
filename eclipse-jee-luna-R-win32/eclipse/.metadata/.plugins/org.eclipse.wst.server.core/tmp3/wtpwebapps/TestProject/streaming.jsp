<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
<title>Data Streaming</title>
 <link rel="stylesheet" href="style.css">
<link href="default.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div id="header">
	<div id="logo">
		<h1><a href="#">Sensor-cloud Infrastructure</a></h1>
		<h2><a href="http://www.nodethirtythree.com/">Sense the world right away!</a> <a href="http://www.freecsstemplates.org/"></a></h2>
	</div>
	<div id="menu">
		<ul>
			<li class="active"><a href="#" accesskey="1" title="">Home</a></li>
			<li><a href="#" accesskey="2" title="">Archives</a></li>
			<li><a href="#" accesskey="3" title="">About</a></li>
			<li><a href="contact.jsp" accesskey="4" title="">Contact</a></li>
		</ul>
	</div>
</div>


<!-- Manmeet's code begins -->

	<div style="text-align: center;">
		<div style="box-sizing: border-box; display: inline-block; width: auto; max-width: 480px; background-color: #FFFFFF; border: 2px solid #0361A8; border-radius: 5px; box-shadow: 0px 0px 8px #0361A8; margin: 50px auto auto;">
			<div style="background: #0361A8; border-radius: 5px 5px 0px 0px; padding: 15px;"><span style="font-family: verdana,arial; color: #D4D4D4; font-size: 1.00em; font-weight:bold;">Data Streaming</span></div>
				<div style="background: ; padding: 15px">
					<style type="text/css" scoped>
						td { text-align:left; font-family: verdana,arial; color: #064073; font-size: 1.00em; }
						input { border: 1px solid #CCCCCC; border-radius: 5px; color: #666666; display: inline-block; font-size: 1.00em;  padding: 5px; width: 100%; }
						input[type="button"], input[type="reset"], input[type="submit"] { height: auto; width: auto; cursor: pointer; box-shadow: 0px 0px 5px #0361A8; float: center; margin-top: 10px; }
						table.center { margin-left:auto; margin-right:auto; }
						.error { font-family: verdana,arial; color: #D41313; font-size: 1.00em; }
					</style>
					<br></br>

					<a href="dataStreaming.php" class="button button-green" onclick="javascript:void window.open('dataStreaming.php','1403729556836','width=300,height=300,toolbar=0,menubar=0,location=0,status=1,scrollbars=1,resizable=0,left=0,top=0');return false;">Start Data Streaming</a>
					<br></br>
					<br></br>
					<a href="readfile.php" class="button button-darkblue" onclick="javascript:void window.open('readfile.php','1403729556836','width=300,height=300,toolbar=0,menubar=0,location=0,status=1,scrollbars=1,resizable=0,left=0,top=0');return false;">Real Time Data</a>
					&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;
					<a href="zname.txt" download='Received_data' class="button button-gray">Download your Data</a><br></br>
					<input type="button" onClick="location.href='sensorck.php'" value="Back">
				</div>
		</div>
	</div>
</body>

</html>