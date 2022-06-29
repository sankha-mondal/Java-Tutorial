package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Employee;


@Repository	  	// it's called as Dao layer specific annotation. | so that no need to create obj in Service layer.
public class EmployeeDao {

	/**  
	//  Using Normal JDBC:-
	@Autowired
	DataSource ds;			// check the database connection in xml file and if get it pull the connection byType | old time we use it
	*/
	
	//	 Retrieve records by Normal JDBC:-
	/**
	public List<Employee> getAllEmployee() {		
		List<Employee> listOfEmp = new ArrayList<>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfEmp;
	}
	*/
	
	//  Insert records by Normal JDBC:-
	/**
	public int storeEmployee(Employee emp) {
		
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
			return pstmt.executeUpdate();
		} catch (Exception e) {
		// TODO: handle exception
			System.out.println(e);
			return 0;
		}
	}
	*/
	
	
//___________________________________________________________________________________________________________________________________	
	
	//  Using JDBC Template API:
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	//	Retrieve records by JDBC Template API:-
	
	public List<Employee> getAllEmployee() {
		try {
			return jdbcTemplate.query("select * from employee", new MyRowMapper());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
	
	//	Insert records by JDBC Template API:-
	// 	DML Operation 
	
		public int storeEmployee(Employee emp) {
			try {
				return jdbcTemplate.update("insert into employee values(?,?,?)", emp.getId(),emp.getName(),emp.getSalary());
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}
	
	
	
	//	Delete records by JDBC Template API:-

	public int deleteEmployee(Employee emp) {
		try {
			return jdbcTemplate.update("delete from employee where id = ?", emp.getId());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	
	
	
	//	Update records by JDBC Template API:-
	
	public int updateEmployee(Employee emp) {
		try {
			return jdbcTemplate.update("update employee set salary = ? where id = ?", emp.getSalary(),emp.getId());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	
	
	//	Retrieve Order BY records by JDBC Template API:-
	
	public List<Employee> getAllEmployeeOrdBy() {
		try {
			return jdbcTemplate.query("select * from employee order by salary desc", new MyRowMapper());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
		
}





// This class is responsible to convert query to Java Object. 
class MyRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		return emp;
	}
	
}
