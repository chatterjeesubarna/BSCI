<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ page import="java.sql.*" %>
	<%@ page import="java.io.*, TestPackage.NewReaderWriter" %>
	
	<%
		String extracted_password = null;
		String username = request.getParameter("userid");
		String password = request.getParameter("password");
		System.out.println("user: "+ username + " pass: " + password);
		session.getAttribute("userid");
		NewReaderWriter nrw = null;
		int id = 0;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\user\\Desktop\\sensor-cloud.accdb";
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();

            String sql1 = "SELECT Password from UserMasterTable where UserName = '" + username + "';";
            System.out.println(sql1);
            ResultSet rs = st.executeQuery(sql1);
            if(rs.next())
            {    
            	extracted_password = rs.getString(1);
            	System.out.println("extracted password: " + extracted_password);                                  
            }
            
            if(password.equals(extracted_password))
            {
            	sql1 = "UPDATE UserMasterTable set LoginStatus = 1 where UserName = '" + username + "';";
            	st.execute(sql1);
            	sql1 = "SELECT * from UserMasterTable where UserName = '" + username + "';";
                rs = st.executeQuery(sql1);
                if(rs.next())
                {    
                	id = rs.getInt(1);
                	session.setAttribute("userId",id);
                	System.out.println(rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6));                                  
                }
                sql1 = "SELECT COUNT(*) as V from UserMasterTable where LoginStatus = 1;";
                System.out.println(sql1);
                rs = st.executeQuery(sql1);
                if(rs.next())
                {    
                	int c = rs.getInt("V");
                	System.out.println("Users logged in: " + c);   
                	if (c==1)
                	{
                		nrw = new NewReaderWriter();
                		//this.nrw = nrw;
                	}
                }
                //NewReaderWriter.ReaderListener(id);
                response.sendRedirect("credentials.jsp?name=" + username);
            }
            else
            {
            	String site = new String("relogin.jsp");
            	response.setStatus(response.SC_MOVED_TEMPORARILY);
            	response.setHeader("Location", site);
            }
            
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	%>
</body>
</html>