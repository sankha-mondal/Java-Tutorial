package jdbc.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;

public class JDBC_Operations {
    public static void main( String[] args ) throws Exception{
    	
    	//load the driver class
    	Class.forName("com.mysql.cj.jdbc.Driver");		// step-1
        System.out.println("Driver loaded Successfully");
        
        //  Connection con=DriverManager.getConnection("url","username","password");
        
        String url = "jdbc:mysql://localhost/newdb";
        String username = "root";
        String password = "Sankha@12";
        
        Connection con = DriverManager.getConnection(url, username, password);	// step-2
        System.out.println("Connected Successfully");
        Scanner sc = new Scanner(System.in);
        
//_____________________________________________________________________________________________________________________________________
        
        //  	 Create Table:-
        
        
        Statement stmt = con.createStatement();	// step-3 
        
        String sql = "CREATE TABLE REGISTRATION " +
                		"(id INTEGER not NULL, " +
                		" first VARCHAR(255), " + 	// step-4
                		" last VARCHAR(255), " + 
                		" age INTEGER, " + 
                		" PRIMARY KEY ( id ))";
        
        stmt.executeUpdate(sql);
        System.out.println("Created table in given database...");
        
        con.close();  	// step-5
           
        
//_____________________________________________________________________________________________________________________________________
        
        //	Insert Query:- 
        
        
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        sc.nextLine();	//  hold the enter key
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();
        
        String q = "insert into employee values(?,?,?)";	// Insert into employee Table  
        PreparedStatement pstmt = con.prepareStatement(q);
        
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setFloat(3, salary);
        
        int res = pstmt.executeUpdate();
        
        if(res>0) 
        	System.out.println("Record inserted successfully");
        
        pstmt.close();
		con.close(); 
	
        
        
 //_____________________________________________________________________________________________________________________________________       
        
        //   	 Update Query:-
        
        
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();
        
        String q = "update employee set salary=? where id=?";
        PreparedStatement pstmt = con.prepareStatement(q);
        
        pstmt.setFloat(1, salary);
        pstmt.setInt(2, id);
        
        int res = pstmt.executeUpdate();
        
        if(res>0) 
        	System.out.println("Record inserted successfully");
        else
        	System.out.println("Record didn't update");
        
        pstmt.close();
        con.close(); 
        
        
//_____________________________________________________________________________________________________________________________________
       
        //	  Retrieve records:-
        
        
        String q = "select * from employee";
        PreparedStatement pstmt = con.prepareStatement(q);
        
        ResultSet rs = pstmt.executeQuery();	     //  Select clause
        
        while(rs.next()) {
        	System.out.println("Id: "+rs.getInt(1)+" | Name: "+rs.getString(2)+" | Salary: "+rs.getFloat(3));
        }
        pstmt.close();
        con.close();
        rs.close(); 
        
  
//_____________________________________________________________________________________________________________________________________
        
        //   	  Delete Query:-
       
	    
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        
        String q = "delete FROM employee WHERE id = ?";		// delete FROM employee table  
        PreparedStatement pstmt = con.prepareStatement(q);
        
        pstmt.setInt(1, id);
        
        int res = pstmt.executeUpdate();
        
        if(res>0) 
        	System.out.println("Record deleted successfully");
        else
        	System.out.println("Record doesn't deleted"); 
        	
        pstmt.close();
        con.close();       
        
        
//_____________________________________________________________________________________________________________________________________
        
        
        //	  Condition Quary:-
        
        
        System.out.println("Enter lRange: ");
        int id1 = sc.nextInt();
        System.out.println("Enter hRange: ");
        int id2 = sc.nextInt();
        
        String q = "SELECT * from employee WHERE id>? and id<?";
        PreparedStatement pstmt = con.prepareStatement(q);
        
        pstmt.setInt(1, id1);
        pstmt.setInt(2, id2);
        
        ResultSet rs = pstmt.executeQuery();	    	//  Select clause
        
        while(rs.next()) {
        	System.out.println("Id is: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Salary: "+rs.getFloat(3));
        }
        pstmt.close();
        con.close();
        rs.close(); 
        
        
//_____________________________________________________________________________________________________________________________________
        
        //	    Like Quary:-
       
	    
        System.out.println("Enter LIKE: ");		//  M%, %a, %am%
        String like_Op = sc.next();
        	
        String q = "SELECT * from employee WHERE name LIKE ?";
        PreparedStatement pstmt = con.prepareStatement(q);
        
        pstmt.setString(1, like_Op);
        
        ResultSet rs = pstmt.executeQuery();	       //  Select clause (DQL)
        
        while(rs.next()) {
        	System.out.println("Id is: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Salary: "+rs.getFloat(3));
        }
        pstmt.close();
        con.close();
        rs.close();
        
      
//_____________________________________________________________________________________________________________________________________       
        
        //	   Sort Quary:-
        
        
        String q = "select * from employee order by id desc";
        PreparedStatement pstmt = con.prepareStatement(q);
        
        ResultSet rs = pstmt.executeQuery();	//  Select clause (DQL)
        
        while(rs.next()) {
        	System.out.println("Id: "+ rs.getInt(1) + " | Name: " + rs.getString(2) + " | Salary: " + rs.getFloat(3));
        }
        pstmt.close();
        con.close();
        rs.close(); 
        
        
    }
}


