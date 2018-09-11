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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Query Evaluation</title>
</head>
<body>

	<%@ page import="java.sql.*" %>
	<%@ page import="java.io.*, TestPackage.ReaderExample1, TestPackage.ReaderExample2, TestPackage.ReaderExample3" %>
	
	<%
		System.out.println("Iside queryevaluation.jsp");
	    int types = 3;
		String type = request.getParameter("type");
		String time = request.getParameter("time");
		String status = request.getParameter("status");
		System.out.println("type: " + type + " time: " + time + " status: " + status);
		String arg[] = new String[types];
		
		for(int i =0;i<types;i++)
		{
			arg[i] = null;
		}
		
		arg[1] = session.getAttribute("userId").toString();
		
		if(!type.contains("dropdown"))
		{
			arg[0] = type.substring(0, 1);
			System.out.println("arg[0]: " + arg[0]);
			ReaderExample1.main(arg);
		}
		else if(!time.contains("dropdown"))
		{
			if(time.equals("1stQuarter"))
			{
				arg[0] = "0";
				arg[2] = "6";
			}
			else if(time.equals("2ndQuarter"))
			{
				arg[0] = "7";
				arg[2] = "12";
			}
			else if(time.equals("3rdQuarter"))
			{
				arg[0] = "13";
				arg[2] = "18";
			}
			else if(time.equals("4thQuarter"))
			{
				arg[0] = "19";
				arg[2] = "24";
			}
			ReaderExample2.main(arg);
		}
		else if(!status.contains("dropdown"))
		{
			//arg[2] = type.substring(0, 1);
			arg[0] = status.substring(0, 1);
			ReaderExample3.main(arg);
		}
		
		
		response.sendRedirect("query1.jsp");
	%>
</body>
</html>