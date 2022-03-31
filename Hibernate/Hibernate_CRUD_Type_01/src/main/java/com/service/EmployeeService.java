//   Service layer is used only for Business logic:-

package com.service;

import java.util.List; 
import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	
	//	Logic for Insert data:-   				[Press-1]
	public String storeEmployee(Employee emp) {
//		if(emp.getSalary()<12000) 				
//			return "Salary > 12000";
//		else {
			EmployeeDao ed = new EmployeeDao();		// necessary logic
			if(ed.storeEmployee(emp)>0) {
				return "Record inserted successfully";
			} else {
				return "Record didn't store";
			}
//		}	
	}
	
	
	//	Logic for Update data:-					[Press-2]
	public String updateEmployee(Employee emp) {
		EmployeeDao ed = new EmployeeDao();
		if(ed.updateEmployee(emp)>0) {
			return "Record update successfully";
		} else {
			return "Record not update";
		}
	}
	
	
	//	Logic for Delete data:-					[Press-3]
	public String deleteEmployee(int id) {
		EmployeeDao ed = new EmployeeDao();
		if(ed.deleteEmployee(id)>0) 
			return "Record deleted successfully";
		 else 
			return "Record is not present";	
	}
	

	//	Logic for Retrieve one data by Id:-			[Press-4]
	public Employee findEmployeeById(int id) {
		EmployeeDao ed = new EmployeeDao();
		return ed.findEmployeeById(id);
	}
	
	

	//	Logic for Retrieve All data based Upon Quary:-		[Press-5]
	public List<Employee> findAllEmployee() {
		EmployeeDao ed = new EmployeeDao();
		return ed.findAllEmployee();
		//return ed.findAllEmployee().stream().filter(e->e.getSalary()>15000).collect(Collectors.toList());
	}
	

	
	//	Logic for Retrieve All Name:-				[Press-6]
	public List<String> findAllEmployeeName() {
		EmployeeDao ed = new EmployeeDao();
		return ed.findAllEmployeeName();
	}
	

	// Logic for Retrieve partial object | like 1 or 2 properties   [Press-7]
	public List<Object[]> findNameAndSalary() {
		EmployeeDao ed = new EmployeeDao();
		return ed.findNameAndSalary();
	}
	

	
	// Logic for Join 2 tables					[Press-8]
	public List<Object[]> joinTable() {
		EmployeeDao ed = new EmployeeDao();
		return ed.joinTable();
	}
	
}
