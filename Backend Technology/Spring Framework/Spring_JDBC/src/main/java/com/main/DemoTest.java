package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");	//  To access beans.xml
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");  //  "employeeService" use camel naming rule.| to connect EmployeeService class

		
		//	Retrieve records:-
		/**
		List<Employee> listOfEmployee = es.getAllEmployee();
		listOfEmployee.forEach(emp->System.out.println(emp));
		*/
		
		
		//  Insert records:-
		/**
		Employee emp = (Employee)ac.getBean("employee");  //  "employee" use camel naming rule.| To connect with Employee class
		emp.setId(109);
		emp.setName("Deep");
		emp.setSalary(29000);
		String result  = es.storeEmployee(emp);
		System.out.println(result);
		*/
		
		
		//  Delete records:-
		
		Employee emp = (Employee)ac.getBean("employee");
		emp.setId(109);
		String result  = es.deleteEmployee(emp);	//  Delete based on ID like id=107.
		System.out.println(result);
		
		
		
		//  Update records:-
		/**
		Employee emp = (Employee)ac.getBean("employee");
		emp.setId(109);
		emp.setSalary(355000);
		String result  = es.updateEmployee(emp);
		System.out.println(result);
		*/
		
		
		
		//	Order BY records:-
		/**
		List<Employee> listOfEmployee = es.getAllEmployeeOrdBy();
		listOfEmployee.forEach(emp->System.out.println(emp));
		*/
		
		
		
	}

}
