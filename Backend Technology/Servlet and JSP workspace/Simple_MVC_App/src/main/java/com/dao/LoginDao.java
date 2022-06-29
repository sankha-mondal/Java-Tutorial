package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Login;
import com.resource.DbResource;

public class LoginDao {

	
	public boolean checkLoginDetails(Login ll) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from login where email = ? and password = ?");
			pstmt.setString(1, ll.getEmail());
			pstmt.setString(2, ll.getPassword());
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public int createLoginDetails(Login ll) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
			pstmt.setString(1, ll.getEmail());
			pstmt.setString(2, ll.getPassword());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int deleteLoginDetails(Login ll) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from login where email = ?");
			pstmt.setString(1, ll.getEmail());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int updateLoginDetails(Login ll) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("update login set password = ? where email = ?");
			pstmt.setString(1, ll.getPassword());
			pstmt.setString(2, ll.getEmail());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
}

