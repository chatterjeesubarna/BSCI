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
<title>Sensor Templates</title>
<link href="default.css" rel="stylesheet" type="text/css" />
</head>

<body>

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
			<li><a href="contact.jsp" accesskey="4" title="">Contact</a></li>
			<li><a href="logout.jsp" accesskey="4" title="">Logout</a></li>
		</ul>
	</div>
</div>


<div id="page">
	<div id="bg">
		<div id="content">
			<div class="post" style="padding-top: 57px;">
				<h2 class="title">Welcome to Big-Sensor-Cloud Infrastructure Version 1.0!</h2>
				<h3 class="date">Thursday, May 25, 2014</h3>
					<div style="text-align: center;">
						<div style="box-sizing: border-box; display: inline-block; width: auto; max-width: 2480px; background-color: #FFFFFF; border: 2px solid #0361A8; border-radius: 5px; box-shadow: 0px 0px 8px #0361A8; margin: 50px auto auto;">
							<div style="background: #0361A8; border-radius: 5px 5px 0px 0px; padding: 15px;"><span style="font-family: verdana,arial; color: #D4D4D4; font-size: 1.00em; font-weight:bold;">Sensor Templates</span></div>
								<div style="background: ; padding: 15px">
									<style type="text/css" scoped>
										td { text-align:left; font-family: verdana,arial; color: #064073; font-size:1.00em; }
										input { border: 1px solid #CCCCCC; border-radius: 5px; color: #666666; display: inline-block; font-size: 1.00em;  padding: 5px; width: 100%; }
										input[type="button"], input[type="reset"], input[type="submit"] { height: auto; width: auto; cursor: pointer; box-shadow: 0px 0px 5px #0361A8; float: right; margin-top: 10px; }
										table.center { margin-left:auto; margin-right:auto; }
										.error { font-family: verdana,arial; color: #D41313; font-size: 1.00em; }
									</style>
									<style type="text/css">
										.tg  {border-collapse:collapse;border-spacing:0;}
										.tg td{font-family:Arial, sans-serif;font-size:14px;padding:7px 5px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}
										.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;}
										#extra_width {padding-top: 5px; padding-left: 0px; padding-right: 70px;}
									</style>
									
									<form action="sensorallocation.jsp" method="post">
										<table class="tg">
											<!--<p1><font face='verdana, arial, helvetica' size='3' align='center'></p1>-->
											<tr><td colspan="2" bgcolor='#ffffff' ><font face='verdana, arial, helvetica' size='3' align='center' name='sensor'><b><i>
											Please select the type(s) of applications:</b></i>
											</td></tr>
											<tr><td>Environment monitoring</td>
											<td id="extra_width">
											<input type="checkbox" name="sensor1" value="2" />
											</td></tr>
											<tr><td>Surveillance applications</td>
											<td id="extra_width">
											<input type="checkbox" name="sensor2" value="3" />
											</td></tr>
											<tr><td>Healthcare applications</td>
											<td id="extra_width">
											<input type="checkbox" name="sensor3" value="1" />
											</td></tr>
											<tr><td>Application 4</td>
											<td id="extra_width">
											<input type="checkbox" name="sensor4" value="4" />
											</td></tr>
											
											<tr><td colspan="2" bgcolor='#ffffff' ><font face='verdana, arial, helvetica' size='3' align='center' name='region'><b><i><br>
											Please select the region(s):</b></i>
											</td></tr>
											
											<tr><td>SWAN lab</td>
											<td id="extra_width">
											<input type="checkbox" name="region1" value="1" />
											</td></tr>
											<tr><td>Project Lab</td>
											<td id="extra_width">
											<input type="checkbox" name="region2" value="2" />
											</td></tr>
											<tr><td>Research Lab</td>
											<td id="extra_width">
											<input type="checkbox" name="region3" value="3" />
											</td></tr>
											<tr><td>VLSI Lab</td>
											<td id="extra_width">
											<input type="checkbox" name="region4" value="4" />
											</td></tr>
											<tr><td>Office</td>
											<td id="extra_width">
											<input type="checkbox" name="region[]" value="ST" />
											</td></tr>
									
											<tr><td colspan="2" bgcolor='#ffffff' ><font face='verdana, arial, helvetica' size='3' align='center'><b><i><br>
											Select your Service Level Agreement (SLA)</b></i>
											</td></tr>						
						
											<tr><td>Accuracy</td>
											<td id="extra_width">
											<input type="checkbox" name="Agg[]" value="ST" />
											</td></tr>
											<tr><td>Timeliness</td>
											<td id="extra_width">
											<input type="checkbox" name="Agg[]" value="ST" />
											</td></tr>
											<tr><td>Pricing Policy</td>
											<td id="extra_width">
											<input type="checkbox" name="Agg[]" value="ST" />
											</td></tr>
					
										</table>
					
									<input type='submit' value='Submit'>
									<input type='reset' value="Clear Form">
									<input type="button" onClick="location.href='credentials.php'" value="Back">
									<br><br>
									
									</form>
						</div>
				</div>
			</div>
		</div> <!-- end post -->
	</div> <!-- end content -->
</div> <!-- end bg -->
</div> <!-- end page -->
</body>
</html>
