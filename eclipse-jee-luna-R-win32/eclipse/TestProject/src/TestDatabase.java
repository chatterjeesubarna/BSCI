import java.sql.*;

public class TestDatabase {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "C:\\Users\\user\\desktop\\sensor-cloud.accdb";
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();

            String selTable = "SELECT * from user";
            ResultSet rs = st.executeQuery(selTable);
            
            while(rs.next())
            {    
            	System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3));                                  
            }
            
           // selTable = "insert into user(Name, Num) values ('Boo', 222);";
            selTable = "UPDATE user set Num = Num + 1;";
            System.out.println(selTable);
            st.execute(selTable);
            String selTable1 = "SELECT * from user";
            ResultSet rs1 = st.executeQuery(selTable1);
            while(rs1.next())
            {    
            	System.out.println(rs1.getString(1) + " : " + rs1.getString(2) + " : " + rs1.getString(3));                                  
            }
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
