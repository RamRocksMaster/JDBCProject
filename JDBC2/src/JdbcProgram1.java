import java.sql.*;
import java.sql.DriverManager;

import java.sql.Connection;

import java.sql.Statement;

import java.sql.SQLException;



public class JdbcProgram1 {

	public static void main(String[] args) throws SQLException ,ClassNotFoundException {
		// Driver d=new oracle.jdbc.driver.OracleDriver();
	//	DriverManager.registerDriver(d);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
         
		Statement st=con.createStatement();
		
	/* st.executeUpdate("create table student(s_no number(3),s_name varchar(20))");
		st.executeUpdate("insert into student values(101,'Ram')");
		st.executeUpdate("insert into student values(103,'Venky')");
		st.executeUpdate("insert into student values(102,'Surya')");
		
		st.executeUpdate("update student set s_name='Rasool' where s_no=103"); */
		//  System.out.println("table is created ");
		st.executeUpdate("delete from student where s_no=101");
		// System.out.println("Record inserted");
		 System.out.println("Record deleted");
		
		con.close();
		
	}

}
