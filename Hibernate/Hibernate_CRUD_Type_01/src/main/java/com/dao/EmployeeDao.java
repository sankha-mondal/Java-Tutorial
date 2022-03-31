//   Dao layer is used only for Database logic:-

package com.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;


public class EmployeeDao { 
	
		//	Insert data Operation:-       					[Press 1]
		public int storeEmployee(Employee emp) {
				try {
				// create session factory
				Configuration con = new Configuration();		//  Create configuration con
				con.configure("hibernate.cfg.xml");			//  driver loaded successfully
				SessionFactory sf = con.buildSessionFactory();		// like a Connection con 

				//create session
				Session session = sf.openSession();			//   Statement and PreparedStatement both combination
				//start a transaction
				Transaction tran = session.getTransaction();
				
				tran.begin();						// start a transaction
					session.save(emp);				// save the Employee object
				tran.commit();						// commit transaction
				return 1;
				}
				catch (Exception e) {
					System.err.println(e);
				}
				return 0;
		}
		

		//	Update data Operation:-     					[Press 2]
		public int updateEmployee(Employee emp) {
				// create session factory
				Configuration con = new Configuration();		// Create configuration con
				con.configure("hibernate.cfg.xml");			// driver loaded successfully
				SessionFactory sf = con.buildSessionFactory();		// like a Connection con 

				//create session
				Session session = sf.openSession();			//   Statement and PreparedStatement both combination
				//start a transaction	
				Transaction tran = session.getTransaction();
				
				Employee e = session.get(Employee.class, emp.getId());	
				/* getId() is used because here id is PK, 
				so it is a possibility id is present or Not	*/
				if(e == null) {
					return 0;
				} else {
					tran.begin();
						e.setName(emp.getName());
						session.update(e);
					tran.commit();
					return 1;
				}
		}	
		
		
		//	Delete data Operation:-    					 [Press 3]	
		public int deleteEmployee(int id) {
			
				// create session factory		
				Configuration con = new Configuration();		//  Create configuration con
				con.configure("hibernate.cfg.xml");			//  driver loaded successfully
				SessionFactory sf = con.buildSessionFactory();		// 	like a Connection con 
				
				//create session
				Session session = sf.openSession();			//  Statement and PreparedStatement both combination
				//start a transaction		
				Transaction tran = session.getTransaction();
					
				Employee e = session.get(Employee.class, id);	
				/* id is used because here we delete data 
					based upon the id*/
				if(e == null) {
					return 0;
				} else {
					tran.begin();
						session.delete(e);
					tran.commit();
					return 1;
				}
			}
		


		//	Retrieve one data Operation:-    				[Press 4]
		public Employee findEmployeeById(int id) {
			
				// create session factory			
				Configuration con = new Configuration();			
				con.configure("hibernate.cfg.xml");					
				SessionFactory sf = con.buildSessionFactory();		
				
				//create session
				Session session = sf.openSession();					
						
				Employee e = session.get(Employee.class, id);	
				/* id is used because here we Retrieve one 
					based upon the id*/
				if(e == null) {
					return null;
				} else {
					return e;
				}
			}



		//	Retrieve all data Operation based Upon Query:-   		[Press 5]
		public List<Employee> findAllEmployee() {
				
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");			
				SessionFactory sf = con.buildSessionFactory();	
					
				Session session = sf.openSession();
				
				//Query qry = session.createQuery("select emp from Employee emp");	
				//Query qry = session.createQuery("from Employee");					// HQl Query
				Query qry = session.createQuery("from Employee emp order by emp.id desc");
				List<Employee> listOfEmp = qry.list();
				return listOfEmp;
			}



		// Retrieve only one property Name for all id:-   			[Press 6]
		public List<String> findAllEmployeeName() {
				
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");			
				SessionFactory sf = con.buildSessionFactory();	

				Session session = sf.openSession();	
				
				// to retrieve name only
				Query qry = session.createQuery("select emp.name from Employee emp");   	// HQl Query
				List<String> listOfEmp = qry.list();
				return listOfEmp;
			}	
		


		// 	Retrieve partial object | like 1 or 2 properties for all id:-   [Press 7]
		public List<Object[]> findNameAndSalary() {
				// create session factory
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");			
				SessionFactory sf = con.buildSessionFactory();	

				Session session = sf.openSession();	
				
				// to retrieve name & Salary only
				Query qry = session.createQuery("select emp.name,emp.salary from Employee emp");  // HQl Query
				List<Object[]> listOfEmp = qry.list();
				return listOfEmp;
			}
		

		
		//  Join two table:-    						[Press 8]
		public List<Object[]> joinTable() {

			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");			
			SessionFactory sf = con.buildSessionFactory();

			Session session = sf.openSession();
			
			//Query qry = session.createQuery("select emp from Employee emp");
			//Query qry = session.createQuery("from Employee");					// HQl Query
			Query qry = session.createSQLQuery("select t.tname,t.tech,s.sname from trainer t inner join student s on t.tid=s.tsid");
			List<Object[]> listOfEmp = qry.list();
			return listOfEmp;
		}	
								
		
}


