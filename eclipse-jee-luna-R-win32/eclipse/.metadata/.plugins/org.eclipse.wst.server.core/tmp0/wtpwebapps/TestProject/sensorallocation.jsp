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
	<%@ page import="java.sql.*" %>
	<% 
		String sensor_types = "";
		String region_types = "";
		String sensor_ids = "";
		int sensor_array_type[] = new int[100];
		int sensor_array_reg[] = new int[100];
		int vs_id = 0;
		//sensors = sensors + request.getParameter("sensor2") + request.getParameter("sensor3") + request.getParameter("sensor4");
		for (int i=1;i<=4;i++)
		{
			String inter_type = "sensor" + i;
			if(request.getParameter(inter_type)== null) 
				continue;
			sensor_types = sensor_types + request.getParameter(inter_type) + "," ;
			//sensor_array_type[i-1] = Integer.parseInt(request.getParameter(inter_type));
					
		}
		//sensor_types = sensor_types.substring(0, sensor_types.length()-1);
		System.out.println("Sensors: " + sensor_types);
		
		for (int i=1;i<=4;i++)
		{
			String inter_reg = "region" + i;
			if(request.getParameter(inter_reg)== null) 
				continue;
			region_types = region_types + request.getParameter(inter_reg) + "," ;
			//sensor_array_reg[i-1] = Integer.parseInt(request.getParameter(inter_reg));
					
		}
		region_types = region_types.substring(0, region_types.length()-1);
		System.out.println("Regionss: " + region_types);
		
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\user\\Desktop\\sensor-cloud.accdb";
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();

            String sql1 = "SELECT SensorId from SensorMasterTable where TypeId in (" + sensor_types + ") and RegionId in (" + region_types + ");";
            System.out.println(sql1);
            ResultSet rs = st.executeQuery(sql1);
            while(rs.next())
            {    
            	int a = rs.getInt("SensorId");
            	sensor_ids = sensor_ids + a + ",";
            	//System.out.println("extracted sensor ids: " + a);                                  
            } 
            //sensor_ids = sensor_ids.substring(0, sensor_ids.length()-1);
            sensor_ids="11,12";
            System.out.println("extracted sensor id string: " + sensor_ids);    
            sql1 = "INSERT INTO VirtualSensorTable (VirtualSensorId, SensorIds, UserId) VALUES(-1, '" + sensor_ids + "'," + session.getAttribute("userId") + " );";
            System.out.println(sql1);
            st.execute(sql1);
            sql1 = "SELECT ID from VirtualSensorTable WHERE VirtualSensorId = -1;";
            rs = st.executeQuery(sql1);
            if(rs.next())
            {
            	vs_id = rs.getInt("ID");
            	
            }
            
            sql1 = "UPDATE VirtualSensorTable SET VirtualSensorId = ID WHERE VirtualSensorId = -1;";
            System.out.println(sql1);
            st.execute(sql1);
            
            //String selTable1 = "SELECT * from VirtualSensorTable;";
            /*ResultSet rs1 = st.executeQuery(selTable1);
            while(rs1.next())
            {    
            	System.out.println(rs1.getInt(1) + " : " + rs1.getInt(2) + " : " + rs1.getString(3) + ":" + rs1.getInt(4));                                  
            }*/
            
            response.sendRedirect("vs_activation.jsp?vs_id=" + vs_id );
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	%>
</body>
</html>