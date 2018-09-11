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
<title>Insert title here</title>
</head>
<body>
	
	<%@ page import="javax.swing.*, java.sql.*, java.util.*, javax.comm.*, java.io.*, TestPackage.GUI2, TestPackage.Reader, TestPackage.NewReaderWriter, TestPackage.NewQ" %>
	<%
	try {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\user\\Desktop\\sensor-cloud.accdb";
        Connection conn = DriverManager.getConnection(url);
        Statement st = conn.createStatement();

        String vs_id = session.getAttribute("vs_id").toString();
        String str = request.getParameter("startvs");
        if(request.getParameter("startvs")!=null)
        {
		       String sql1="UPDATE VirtualSensorTable SET ActivationStatus = 1 WHERE VirtualSensorId = " + vs_id + ";";
		       System.out.println(sql1);
		       st.execute(sql1);		 
		       //request.getRequestDispatcher("vs_activation.jsp");
		       response.sendRedirect("vs_activation.jsp?vs_id="+vs_id);
        }
        else if (request.getParameter("stopvs")!=null)
        {
        	   String sql1="UPDATE VirtualSensorTable SET ActivationStatus = 0 WHERE VirtualSensorId = " + vs_id + ";";
		       System.out.println(sql1);
		       st.execute(sql1);
		       response.sendRedirect("vs_activation.jsp?vs_id="+vs_id);
        }
        else if (request.getParameter("streaming")!=null)
        {
        	   NewReaderWriter.ReaderListener(Integer.parseInt(session.getAttribute("userId").toString()), Integer.parseInt(vs_id));
        	   Thread.sleep(500);
		       String file_details = "user" + session.getAttribute("userId").toString() + File.separator + session.getAttribute("userId").toString() + ".txt";
		       GUI2 gui = new GUI2(file_details);
		       response.sendRedirect("vs_activation.jsp?vs_id="+vs_id);
        }
        else if (request.getParameter("querying")!=null)
        {
        	   response.sendRedirect("query.jsp");
        }
        //response.sendRedirect("vs_activation.jsp?vs_id="+vs_id);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	%>
</body>
</html>