package com.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;


public class InsertData {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()			// create session factory
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Address.class)
					.buildSessionFactory();

		Session session = factory.getCurrentSession();			// create session

		try {

			Student stuObj = new Student();				// create Student object
			stuObj.setFirstName("Harish");
			stuObj.setLastName("Sen");
			stuObj.setEmail("sen.harish@hotmail.com");
			
			Address addObj = new Address();				// create Address object
			addObj.setState("Haryana");
			addObj.setCity("Gurugram");
			
			stuObj.setStudentAddress(addObj);			// associate the objects
		

			session.beginTransaction();		// start transaction

				session.save(stuObj);	// save the Student
				session.save(addObj);	// save the Student
			
			session.getTransaction().commit();	// commit transaction
			
			System.out.println("Insert successfully...");
			

		} finally {
			factory.close();
		}
	}
}

