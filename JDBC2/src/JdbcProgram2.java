import java.sql.*;
public class JdbcProgram2 {

	public static void main(String[] args) /*throws SQLException,ClassNotFoundException */{
	try {
		// 1) register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2) Create connection
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	    // 3) create statements
	 Statement st=con.createStatement();
	   // 4)Execute queries
	 ResultSet rs=st.executeQuery("select * from student");
	// rs.next();
       while(rs.next()) {	 
	// System.out.println("table is visible");
	 System.out.println(rs.getInt("s_no")+" "+rs.getString("s_name"));
	 
       }
	 con.close();
	}
        catch(Exception e) {
        //	e.printStackTrace();
        }
	}

}
