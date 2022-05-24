package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {

	
	public static Connection getDbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Sankha@12");
			return con;
		} catch (Exception e) {
			System.out.println("Db Connection error "+e);
		}
		return null;
	}
}
