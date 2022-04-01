//   This class is used for User's operations only:-

package com.main;

import java.util.Scanner;
import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		
		//  Insert data Statically 
		/**
		Employee emp = new Employee(114,"Mariam",65000);
		EmployeeService es = new EmployeeService();
		String res = es.storeEmployee(emp);
		System.out.println(res);
		*/
		
		//  Insert data Dynamically
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		
		int id; String name; float salary; 	//  Employee attributes as Column names
		int choice; String con, res;
		
		do {
			System.out.println("Press 1.Add Employee:\nPress 2.Update Employee:\nPress 3.Delete Employee:");
			System.out.println("Press 4.Retrieve Employee data By Id:\nPress 5.Retrieve All Employee:");
			System.out.println("Press 6.Retrieve All Employee Name:\nPress 7.Retrieve partial object");
			System.out.println("Press 8. For Join 2 tables:");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			
		case 1:
			System.out.println("Enter Id to insery: ");
			id = sc.nextInt();
			System.out.println("Enter Name to insery: ");
			name = sc.next();
			System.out.println("Enter Salary to insery: ");				//  Press 1. Add Employee data:
			salary = sc.nextFloat();
			Employee emp1 = new Employee(id, name, salary);
			res = es.storeEmployee(emp1);
			System.out.println(res);
			break;
				
					
		case 2: 
			System.out.println("Enter Id for update: ");
			id = sc.nextInt();
			System.out.println("Enter Name to update: ");
			name = sc.next();					
			Employee emp2 = new Employee();						//  Press 2. Update Employee data:
			emp2.setId(id);
			emp2.setName(name);
			res = es.updateEmployee(emp2);
			System.out.println(res);
			break;

				
		case 3: 
			System.out.println("Enter Id to delete data: ");
			id = sc.nextInt();
			res = es.deleteEmployee(id);						//  Press 3. Delete Employee data:
			System.out.println(id);
			System.out.println(res);
			break;

				
		case 4: 
			System.out.println("Enter Id to Retrieve one Employee data: ");
			id = sc.nextInt();
			Employee ee = es.findEmployeeById(id);
			if(ee == null) 								//  Press 4. Retrieve one Employee By Id:
				System.out.println("Record is not present");
			 else 
				System.out.println(ee);		 // toString()
			break;
				
				
		case 5:										//  Press 5. Retrieve Employee based Upon Query:
			System.out.println("All Employee Records based Upon Query:");					
			es.findAllEmployee().forEach(e->System.out.println(e));
			break;
				
				
		case 6:										//  Press 6. Retrieve Employee Name:
			System.out.println("All Employee Name");					
			es.findAllEmployeeName().forEach(e->System.out.println(e));
			break;
			
				
		case 7:										//  Press 7. Retrieve partial object:
			System.out.println("All Employee Name and Salary");					
			es.findNameAndSalary().forEach(e->System.out.println("Name: "+e[0]+" Salary: "+e[1]));
			break;
			
				
		case 8:										//  Press 8. For Join 2 tables:
			System.out.println("Join Table");					
			es.joinTable().forEach(e1->System.out.println("TName "+e1[0]+"Tech |"+e1[1]+"SName "+e1[2]));
			break;
			
 				
		default:									//   Default Condition
			System.out.println("Wrong choice");
			break;
			}
			System.out.println("Do you want to continue? Enter y/n: ");
			con = sc.next();
		} while(con.equals("y"));
		
		
		
	}
}
