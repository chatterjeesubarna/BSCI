package TestPackage;

import java.sql.*;
public class Reader implements Runnable{
	
	Thread t;	
	int last_read = 0;
	int userid;
	String folder_name;
	public int sensor_id[] = new int[100];
	int vs_id;
	//boolean of_interest = false;
	
	public Reader(int userid, String folder_name, int vs_id)
	{
		t = new Thread(this);
		this.userid = userid;
		this.vs_id = vs_id;
		this.folder_name = folder_name;
		for(int i =0;i<sensor_id.length; i++)
			sensor_id[i] = 0;
		t.start();
	}
	
	public void run()
	{
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\user\\Desktop\\sensor-cloud.accdb";
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();
            String sql1 = "SELECT * from VirtualSensorTable where VirtualSensorId = " + vs_id + ";";
            System.out.println(sql1);
            ResultSet rs = st.executeQuery(sql1);
            int i=0;
            while(rs.next())
            {    
            	int start=0; int stop = 2;
            	String g = rs.getString(3);
            	while(stop<=g.length())
            	{
            		sensor_id[i++] = Integer.parseInt(g.substring(start, stop));
            		start= stop+1; stop=start+2;
            	}
            }
            System.out.println("Reader is interested in ");
            for (int k = 0; k<sensor_id.length; k++)
            	System.out.println(sensor_id[k] + " and ");
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true)
		{
			last_read = NewQ.read(last_read, userid, folder_name, sensor_id);
		}
		
	}

}
