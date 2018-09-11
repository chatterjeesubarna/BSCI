<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import = 'demo_TP.*' %>
        <%@page import = 'demo_GSR.*' %>
         <%@page import = 'demo_EXG.*' %>
        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
		String userName = request.getParameter("txtUsername");
		String SensorTypeID = request.getParameter("chkSensorType");
		String SensorID = request.getParameter("txtSensorID");
		String DiagnosisID = request.getParameter("txtDiagnosisID");
		String filename = request.getParameter("txtFilename");
		
		System.out.println("username: "+ userName);
		System.out.println("sensortype: "+ SensorTypeID);
		System.out.println("sensorid: "+ SensorID);
		System.out.println("diagnosisid: "+ DiagnosisID);
		System.out.println("filename: "+ filename);
		
		if(SensorTypeID.compareTo("SHR")==0)
		{
			System.out.println("IN SHR");
		FileMainGSR ob = new FileMainGSR();
		ob.startsensing(userName, SensorTypeID, SensorID, DiagnosisID, filename);
		}
		else if(SensorTypeID.compareTo("SEG")==0)
		{
			System.out.println("IN SEG");
			FileMainEXG ob = new FileMainEXG();
			ob.startsensing(userName, SensorTypeID, SensorID, DiagnosisID, filename);
		}
		else if(SensorTypeID.compareTo("STP")==0)

		{
			FileMainTP ob = new FileMainTP();
				ob.startsensing(userName, SensorTypeID, SensorID, DiagnosisID, filename);
		}

		System.exit(0);
	%>
</body>
</html>