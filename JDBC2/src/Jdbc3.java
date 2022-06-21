import java.sql.*;
public class Jdbc3 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		Statement st=con.createStatement();
		
	/*	st.executeUpdate("create table Employee1(e_no number(3),e_name varchar(20),e_salary number(10),e_gender varchar(20),e_location varchar(20))");
		
		System.out.println("table created");
		
		st.executeUpdate("insert into Employee1 values(101,'Akhila',50000,'female','Hyderabad')");
		st.executeUpdate("insert into Employee1 values(102,'Ram Murthi',100000,'male','Hyderabad')");
		st.executeUpdate("insert into Employee1 values(103,'Rasool',60000,'male','Hyderabad')");
		st.executeUpdate("insert into Employee1 values(104,'Madhavi',50000,'female','Hyderabad')");
		st.executeUpdate("insert into Employee1 values(105,'Durga Rao',40000,'male','Hyderabad')");
		
		System.out.println("Record inserted");        */
		
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next()) {
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		
		}   
		
		
		
		con.close();

	}

}
