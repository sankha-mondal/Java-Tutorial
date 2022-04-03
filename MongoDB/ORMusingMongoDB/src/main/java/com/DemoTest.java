
package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {
	
	public static void main(String[] args) {
		/**
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.builtSessionFactory;
		Session session = sf.openSession();
		Transaction tran = session.getTransaction;
		tran.begin();
				session.save(emp);
		tran.commit();
		*/
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test"); 	//   means 13 14 | here "test" is persistence-unit name
	EntityManager manager = emf.createEntityManager();				//   means 15 16
	EntityTransaction tran = manager.getTransaction();				//   means 17
	
	//  Insert Operation:- 
	Employee emp = new Employee();
	emp.seteId(100);
	emp.seteName("Arun");
	emp.setSalary(25000);
			
	tran.begin();			//  means 18
			manager.persist(emp);	//   save method
	tran.commit();			//  means 20
	
	System.out.println("Record inserted Successfully");
	
	
	}	
}
