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
<title>VS activation</title>
 <link rel="stylesheet" href="style.css">
<link href="default.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div id="header">
	<div id="logo">
		<h1><a href="#">Big-Sensor-Cloud Infrastructure</a></h1>
		<h2> <font size = "4" face = Lucida><i>Sense the world right away!</i></a> <a href="http://www.freecsstemplates.org/"></a></h2></font>
	</div>
<marquee scrollamount="3"><b><font size = "4" color = "red" face="Lucida"><i>Sensor-cloud: A paradigm shift from traditional Wireless Sensor Networks</i></font></b></marquee>﻿
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
<hr />

<div id="page">
	<div id="bg">
		<div id="content">
			<div class="post" style="padding-top: 57px;">
				<h2 class="title">Welcome to Sensor-cloud Infrastructure Version 1.0!</h2> <br><br> 

				<font color = "black" face = Lucida>				
					<h3 class="date"> 

						<script type="text/javascript">
							tday  =new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
							tmonth=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
			
							function GetClock(){
							d = new Date();
							nday   = d.getDay();
							nmonth = d.getMonth();
							ndate  = d.getDate();
							nyear = d.getYear();
							nhour  = d.getHours();
							nmin   = d.getMinutes();
							nsec   = d.getSeconds();
			
							if(nyear<1000) nyear=nyear+1900;
							
							     if(nhour ==  0) {ap = " AM";nhour = 12;} 
							else if(nhour <= 11) {ap = " AM";} 
							else if(nhour == 12) {ap = " PM";} 
							else if(nhour >= 13) {ap = " PM";nhour -= 12;}
							
							if(nmin <= 9) {nmin = "0" +nmin;}
							if(nsec <= 9) {nsec = "0" +nsec;}
		
		
							document.getElementById('clockbox').innerHTML=""+tday[nday]+", "+tmonth[nmonth]+" "+ndate+", "+nyear+" "+nhour+":"+nmin+":"+nsec+ap+"";
							setTimeout("GetClock()", 1000);
							}
							window.onload=GetClock;
						</script>
						<div id="clockbox"></div>
					</h3>
				</font>
				<div class="entry">
					<p><strong> Sensor-cloud Infrastructure </strong> is a unique sensor data storage, visualization and remote management platform that leverages powerful cloud computing
					technologies to provide excellent data scalability, rapid visualization, and user programmable analysis. </p>
					
					<form method="post" action="queryevaluation.jsp" name="productForm">
				    <select name="type" onchange="document.productForm.submit();">
				        <option value="dropdown">Pls select the sensor type
				        <option value="Light">Light
				        <option value="Temperature">Temperature
				        <option value="Humidity">Humidity
				    </select>
				    
				    <select name="time" onchange="document.productForm.submit();">
				        <option value="dropdown">Pls select the time
				        <option value="1stQuarter">1st Quarter
				        <option value="2ndQuarter">2nd Quarter
				        <option value="3rdQuarter">3rd Quarter
				        <option value="4thQuarter">4th Quarter
				    </select>
				     <!--  <input type="hidden" name="dropdown" id="dropdown">
				    <input type="submit" value="click" name="dropdown" id="dropdown">-->
				    
				    <select name="status" onchange="document.productForm.submit();">
				        <option value="dropdown">Pls select resource status
				        <option value="l50">Battery Life less than 50%
				        <option value="g50">Battery life greater than 50%
				        <option value="outstanding">Unexhausted battery life
				    </select>
				     <!--  <input type="hidden" name="dropdown" id="dropdown">
				    <input type="submit" value="click" name="dropdown" id="dropdown">-->
				    </form>
				    
				    <%@ page import="java.io.*" %>
				    <%
				    	String path2 = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "user" + session.getAttribute("userId").toString() + File.separator + "output1.txt";
				    	File file = new File(path2);
				    	BufferedReader br = new BufferedReader(new FileReader(path2));
				    	String sCurrentLine;
				    	int c=0;
				    	out.println("<br>");
				    	out.println("<br>");
				    	while ((sCurrentLine = br.readLine()) != null) 
						{
				    		if(sCurrentLine.length() == 0) continue;
				    		out.println(sCurrentLine.substring(19, 23) );
				    		//out.println(sCurrentLine);
							out.println("<br>");
						}
				    %>
    
    
				</div>
			</div>
			
		</div>
		<!-- end content n -->
		<div id="sidebar">
			<div id="about-box"><font face = Lucida>
				<h2 style="text-align:center"><font color = blue><i>developed by</font></h2></i>
				<img src="images/logo1.png" width="105" height="100" style="margin-left:70px; margin-top:-20px; " />
				<a href = "http://sit.iitkgp.ernet.in/~smisra/swan/index.html" style="text-decoration: none"><h4 style="text-align:center" ><font size = "4.5" color = red>Smart Wireless Applications & Networking Laboratory</font></h4></a>
				<a href = "http://sit.iitkgp.ernet.in/" style="text-decoration: none"><h4 style="text-align:center"><font size = "3" color = #B40404>School of Information Technology</a></font></h4>
				<a href = "http://www.iitkgp.ac.in/" style="text-decoration: none"><h4 style="text-align:center"><font size = "3" color = #B40404>Indian Institute of Technology Kharagpur</font></h4></a>
				<i><font size = "3" color = #0B0B61>Project Investigator:</font></i>  <a href = "http://www.sit.iitkgp.ernet.in/~smisra/" style="text-decoration: none"><font color = #610B21>Dr. Sudip Misra </font></a>
				<i><font size = "3" color = #0B0B61>Developers:</font></i>
								
				<li> <font color = #610B21> Subarna Chatterjee (Ph.D Scholar)</font></li>
				<li> <font color = #610B21> Arijit Roy (M.S. Scholar) </font></li>
				<li> <font color = #610B21> Manmeet Singh Bhogal (Summer Intern) </font></li>
				<li> <font color = #610B21> Sanku Kumar Roy (Project Staff) </font></li>
				<!-- </font>-->

			</div> 
			<br></br><br></br><br></br><br></br><br></br>
			<ul>
				<li>
					<h2>Categories</h2>
					<ul>
						<li class="first"><a href="login.jsp">Login</a></li>
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
		</div>
		<!-- end sidebar -->
		
		<div style="clear: both;">&nbsp;</div>
	</div> <!-- end bg -->
</div> <!-- end page -->

<hr />
<div id="footer">
	<p>(c) All rights reserved. Design by <a href="http://sit.iitkgp.ernet.in/">SIT</a>, <a href="http://www.iitkgp.ac.in/"> IIT Kharagpur</a></p>
</div>

</body>
</html>