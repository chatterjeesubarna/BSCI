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


<!-- Manmeet's code begin	s -->

	<div style="text-align: center;">
		<div style="box-sizing: border-box; display: inline-block; width: auto; max-width: 480px; background-color: #FFFFFF; border: 2px solid #0361A8; border-radius: 5px; box-shadow: 0px 0px 8px #0361A8; margin: 50px auto auto;">
			<div style="background: #0361A8; border-radius: 5px 5px 0px 0px; padding: 15px;"><span style="font-family: verdana,arial; color: #D4D4D4; font-size: 1.00em; font-weight:bold;">Manage your virtual resources!</span></div>
				
				<div style="background: ; padding: 15px">
					<style type="text/css" scoped>
						td { text-align:left; font-family: verdana,arial; color: #064073; font-size: 1.00em; }
						input { border: 1px solid #CCCCCC; border-radius: 5px; color: #666666; display: inline-block; font-size: 1.00em;  padding: 5px; width: 100%; }
						input[type="button"], input[type="reset"], input[type="submit"] { height: auto; width: auto; cursor: pointer; box-shadow: 0px 0px 5px #0361A8; float: center; margin-top: 10px; }
						table.center { margin-left:auto; margin-right:auto; }
						.error { font-family: verdana,arial; color: #D41313; font-size: 1.00em; }
					</style>

					
					<script>
						function PopupCenter(title,w,h) {
						var left = (screen.width/2)-(w/2);
						var top = (screen.height/2)-(h/2);
						//var targetWin = window.open (pageURL, title, 'toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no, width='+w+', height='+h+', top='+top+', left='+left);
						alert("Virtual sensor activated !!");
						} 
					</script>
					
					<script>
						function PopupCenter1(title,w,h) {
						var left = (screen.width/2)-(w/2);
						var top = (screen.height/2)-(h/2);
						//var targetWin = window.open (pageURL, title, 'toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no, width='+w+', height='+h+', top='+top+', left='+left);
						alert("Virtual sensor deactivated !!");
						} 
					</script>

					<%@ page import ="java.io.*" %>
					<% 
						String vs_id = request.getParameter("vs_id"); System.out.println("Id: "+ vs_id); session.setAttribute("vs_id", vs_id);
						String file_details = "C:" + File.separator + "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator + "eclipse-jee-luna-R-win32" + File.separator + "eclipse" + File.separator + "user" + session.getAttribute("userId").toString() + File.separator + session.getAttribute("userId").toString() + ".txt";
						System.out.println("file_details: "+ file_details);
					%>
					<form method = "post" action="startVS.jsp">
						 <input type="submit" class="button button-green" value="ACTIVATE your Virtual Sensor" name="startvs" onclick="PopupCenter('Activation Report',200,200);"></input><br><br> 
						 <input type="submit" class="button button-red" value="DEACTIVATE your Virtual Sensor" name="stopvs" onclick="PopupCenter1('Activation Report',200,200);"></input><br><br>
						 <input type="submit" class="button button-orange" value="CLICK to start data streaming" name="streaming"></input><br><br>
						 <a href="1.txt " class="button button-darkblue">ARCHIVE your data</a><br></br>
						 <input type="submit" class="button button-purple" onClick="location.href='query.jsp'" value="ENJOY customized querying" name="querying"></input><br><br>
						 <input type="button" class="button button-pink" onClick="location.href='template.jsp'" value="Back"></input>						 
					</form>
					</h1>						
				</div>
				
					

<!-- Manmeet's code ends -->

</body>
</html>