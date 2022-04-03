package com.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Template;

import com.entity.Address;
import com.entity.Student;


public class InsertData {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()			// create session factory
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.addAnnotatedClass(Address.class)
						.buildSessionFactory();

		Session session = factory.getCurrentSession();		 	// create session
		
		Transaction tran = session.getTransaction();  			// Create Transaction object

		try {

			Student stuObj = new Student();						// create Student object
			stuObj.setFirstName("Ajoy");
			stuObj.setLastName("Gupta");
			stuObj.setEmail("ajoygupta@hotmail.com");
			
			
			Address addObj = new Address();						// create Address object
			addObj.setState("Haryana");
			addObj.setCity("Gurugram");

			
			stuObj.setStudentAddress(addObj);					// associate the objects
			
			
			tran.begin();		// start transaction
			
				session.save(stuObj);	// save the Student object
				session.save(addObj);	// save the Address object
			
			tran.commit();		// commit transaction
			
			System.out.println("Insert Successfully...");

		} finally {
			factory.close();
		}
	}
}
