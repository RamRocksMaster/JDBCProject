import java.sql.*;

import java.util.Scanner;

public class JdbcProgram4 {

public static void main(String[] args) {
	
	try {
	
Class.forName("oracle.jdbc.driver.OracleDriver");
		
Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	
    String query="insert into Laptop values(?,?,?)";
	PreparedStatement st=con.prepareStatement(query);
	
	Scanner sc= new Scanner(System.in);
	
	while(true) {
		System.out.println("ENTER THE ID OF LAPTOP : ");
		int L_id=sc.nextInt();
		
		System.out.println("ENTER THE LAPTOP NAME : ");
	    String L_name=sc.next();
	    
	    System.out.println("ENTER THE COST OF LAPTOP : ");
	      int L_cost=sc.nextInt();
	      
	    st.setInt(1, L_id); 
	    st.setString(2, L_name);
	    st.setInt(3, L_cost);
	    
	    st.executeUpdate();
	    
	    System.out.println("Recors inserted successfully");
	    System.out.println("DO YOU WANT TO INSERT MORE RECORDS? [YES/NO]");
	    String option=sc.next();
	    
	    if(option.equalsIgnoreCase("NO")) {
	    	break;
	    }
	    
	    
	}
	
	
	
	} catch(Exception e) {
		
		e.printStackTrace();
	}

	}

}
