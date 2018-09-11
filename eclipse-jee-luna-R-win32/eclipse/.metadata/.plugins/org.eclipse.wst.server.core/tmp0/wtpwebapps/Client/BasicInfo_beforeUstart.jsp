<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
 
</head>
<body>
<center>
<form name="registration" action="BasicInfo_beforeUstart_backend.jsp" method="post">
<input type="hidden" name="pagename" value="register"/>
<table cellpadding="20" cellspacing="20" >

<tr>
	<td align = 'left'><font size = "5" color = "blue" face="Lucida">Login Username</font></td>
	<td><input type="text" name="txtUsername" /></td>
</tr>

<tr>
	<td align = 'left'><font size = "5" color = "blue" face="Lucida">SensorTypeID</font></td>
	<td><input type="checkbox" name="chkSensorType" id="STP" value="STP"><label for="STP">STP</label><input type="checkbox" name="chkSensorType" id="SHR" value="SHR"><label for="SHR">SHR</label><input type="checkbox" name="chkSensorType" id="SEG" value="SEG"><label for="SEG">SEG</label></td>
</tr>
<tr>
	<td align = 'left'><font size = "5" color = "blue" face="Lucida">SensorID</font></td>
	<td><input type="text" name="txtSensorID"></td>
</tr>
<tr>
	<td align = 'left'><font size = "5" color = "blue" face="Lucida">DiagnosisID</font></td>
	<td><input type="text" name="txtDiagnosisID"></td>
</tr>
<tr>
	<td align = 'left'><font size = "5" color = "blue" face="Lucida">Filename</font></td>
	<td><input type="text" name="txtFilename"></td>
</tr>

<tr>
	<td align = 'left'><font size = "5" color = "blue" face="Lucida"><button type="submit">Submit</button></font></td>
</tr>
</table>
</form>
</center>
</body>
</html>