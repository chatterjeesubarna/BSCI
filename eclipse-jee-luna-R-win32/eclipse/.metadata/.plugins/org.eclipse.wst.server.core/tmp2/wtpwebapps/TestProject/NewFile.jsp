<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Big-Sensor-Cloud Infrastructure home_page</title>
<meta name="keywords" content="Sensor-cloud Infrastructure" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div id="header">
	<div id="logo">
		<h1><a href="#">Big-Sensor-Cloud Infrastructure</a></h1>
		<h2> <font size = "4" face = Lucida><i>Sense the world right away!</i></a> <a href="http://www.freecsstemplates.org/"></a></h2></font>
	</div>
<marquee scrollamount="3"><b><font size = "4" color = "red" face="Lucida"><i>Big-Sensor-Cloud: A paradigm shift from traditional Wireless Sensor Networks</i></font></b></marquee>﻿
	<div id="menu">
		
		<ul>
			<li class="active"><a href="#" accesskey="1" title="">Home</a></li>
			<li><a href="#" accesskey="2" title="">Archives</a></li>
			<li><a href="#" accesskey="3" title="">About</a></li>
			<li><a href="contact.jsp" accesskey="4" title="">Contact</a></li>
		</ul>
	</div>
</div>
<hr />

<div id="page">
	<div id="bg">
		<div id="content">
			<div class="post" style="padding-top: 57px;">
				<h2 class="title">Welcome to Big-Sensor-Cloud Infrastructure Version 1.0!</h2>

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
					<p><strong> Big-Sensor-Cloud Infrastructure </strong> is a unique sensor data storage, visualization and remote management platform that leverages powerful cloud computing
					technologies to provide excellent data scalability, rapid visualization, and user programmable analysis. </p>
					
					<p> The idea of sensor-cloud thrives on the principle of virtualization of physical sensor nodes. The sensor-cloud architecture
					is positioned as an intermediate stratum of processing between the physical sensor nodes and the end-user-organization. The
					user-organizations possess their own applications, and request the sensor-cloud for retrieval of sensed data. These requests are interpreted within the sensor-cloud environment and the
					physical sensor nodes are dynamically consorted to form virtual sensor groups, as per requirements. Data from the wireless physical sensor nodes reach the sensor-cloud through
					standard wireless multi-hop communication. On behalf of each virtual group, the aggregated data is transmitted to the enduser organization. The data obtained is then delivered to the
					application, followed by subsequent processing and analysis on part of the end-users. </p>

					<p> The current state-of-the-art generally does not allow the users to access WSN-based applications without owning the sensor nodes, and deploying the same. Our work significantly
					contributes towards dissemination of the access of such applications to multiple persons/organizations. For this purpose, the work focuses on a theoretical
					modeling of virtualization of physical sensor nodes.In contrast to traditional WSN-based technology, sensorcloud remarkably improves on the pricing scheme.
					Sensor-cloud enables a user-organization to scale (up/down) its demands, and pay only for the service it seeks/receives. The user-organization is relieved from the
					deployment, and maintenance overheads associated with a typical WSN. This work illustrates the flow of revenue for each of the actors associated with the sensor-cloud
					architecture.</p> 

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
				<!-- <li> <font color = #610B21> Manmeet Singh Bhogal (Summer Intern) </font></li> -->
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
