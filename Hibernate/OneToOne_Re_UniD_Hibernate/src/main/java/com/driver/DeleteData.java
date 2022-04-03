package com.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;


public class DeleteData {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()		// create session factory
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.addAnnotatedClass(Address.class)
						.buildSessionFactory();

		Session session = factory.getCurrentSession();		// create session

		try {

			int theStudentId = 1;					//  User requirement 
			
			session.beginTransaction();				//  Start transaction

			Student tempStudent = session.get(Student.class,theStudentId);
			
			if(tempStudent!=null) {
				System.out.println("Deleting : "+ tempStudent);
				
				//Note!! : it will also delete TeacherDetails data 
			    //         as we have provided CascadeType.ALL
				session.delete(tempStudent);
			}
			
			session.getTransaction().commit();			// Commit transaction
			
			System.out.println("Delete successfully...");

		} finally {
			factory.close();
		}
	}
}
