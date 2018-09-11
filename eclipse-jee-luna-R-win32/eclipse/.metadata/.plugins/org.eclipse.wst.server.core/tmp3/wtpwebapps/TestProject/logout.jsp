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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%
	try {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\user\\Desktop\\sensor-cloud.accdb";
        Connection conn = DriverManager.getConnection(url);
        Statement st = conn.createStatement();
        int id = Integer.parseInt(session.getAttribute("userId").toString());
        //String n = request.getParameter("name");
        String sql1 = "UPDATE UserMasterTable set LoginStatus = 0 where ID = " + id + ";";
        System.out.println(sql1);
        st.execute(sql1);
        
        
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		response.sendRedirect("NewFile.jsp");
	%>
</body>
</html>