<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<title>Login Box HTML Code - www.PSDGraphics.com</title>
	
	<link href="default.css" rel="stylesheet" type="text/css" />
	<link href="login-box.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div id="header">
	<div id="logo">
		<h1><a href="#">Sensor-cloud Infrastructure</a></h1>
		<h2>By <a href="http://www.nodethirtythree.com/">SIT, IIT, Kharagpur</a> <a href="http://www.freecsstemplates.org/"></a></h2>
	</div>
	<marquee><b><font size = "4" color = "red" face="Lucida"><i>Sensor-cloud: A paradigm shift from traditional WSNs</i></font></b></marquee>
	<div id="menu">
		<ul>
			<li class="active"><a href="NewFile.jsp" accesskey="1" title="">Home</a></li>
			<li><a href="#" accesskey="2" title="">Archives</a></li>
			<li><a href="#" accesskey="3" title="">About</a></li>
			<li><a href="contact.jsp" accesskey="4" title="">Contact</a></li>
		</ul>
	</div>
</div>

<div id="page">
	<div id="bg">
		<div id="content">
			<div class="post" style="padding-top: 57px;">
				<h2 class="title">Welcome to Sensor-cloud Infrastructure Version 1.0!</h2>
				<h3 class="date">Thursday, May 25, 2014</h3>
				<div class="entry">
					
				<p><strong> Sensor-cloud Infrastructure </strong> is a unique sensor data storage, visualization and remote management platform that leverages powerful cloud computing
					technologies to provide excellent data scalability, rapid visualization, and user programmable analysis. </p>
				
				<script type="text/javascript">
				alert("INCORRECT CREDENTIALS !! PLEASE TRY AGAIN. ");
				</script>
				
				<div style="padding: 00px 0 0 70px;">
					<div id="login-box">	
						<H2>Login</H2>
						Please login to avail of Sensors-as-a-Service
						<br> </br>
						<br> </br>

						<form action='loginchk.jsp' method=post>
							<table border='0' cellspacing='0' cellpadding='0' align=center>
								  <tr id='cat'>
								  <tr> 
								  		<td > 
								  			<font face='verdana, arial, helvetica' size='2' align='center'>  &nbsp;Login ID  &nbsp; &nbsp; </font>
								  		</td> 
										<td  align='center'>
											<font face='verdana, arial, helvetica' size='2' > <input type ='text' class='bginput' name='userid' ></font>
										</td>
								  </tr>
								  <tr> 
										<td >
												<font face='verdana, arial, helvetica' size='2' align='center'>  &nbsp;Password  </font>
										</td> 
										<td align='center'>
												<font face='verdana, arial, helvetica' size='2' ><input type ='password' class='bginput' name='password' ></font>
										</td>
								 </tr>

								 <tr> 
								 		<td colspan='2' align='center'>
								 				<font face='verdana, arial, helvetica' size='2' align='center'>  
									 				<input type="image" src="images/login.png" alt="Submit details" value='Submit'/> 
									 				<input type="image" src="images/submit.png" alt="Submit details" value='Submit'/>
													<span class="login-box-options">
								 </tr>
								 
								 <tr> 
								 		<td >
								 				<font face='verdana, arial, helvetica' size='2' align='center'> &nbsp;<a href='http://10.14.18.159/login/signup.php'>New Member Sign UP</a></font></td> <td  align='center'><font face='verdana, arial, helvetica' size='2' ><a href=http://10.14.18.159/login/forgot-password.php>	Forgot Password?</a> </font>
								 		</td>
								 </tr>
								
								 <tr> 
								 		<td colspan='2' align='center'>
								 				<font face='verdana, arial, helvetica' size='2' align='center'>&nbsp;</font>
								 		</td> 
								 </tr> 


							</table>
						</center>
					</form>
				</div> <!--  login-box -->
			</div>
		</div> <!-- entry -->
	</div> <!-- post -->
			
</div> 	<!-- end contentn -->

		<div id="sidebar">
			<div id="about-box">
				<h2>About this Site</h2>
				<p>This site is under development.</p>
			</div>
			<ul>
				
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

</div>
</div>

</body>

</html>
