package com.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;


public class DeleteData {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()				// create session factory
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.addAnnotatedClass(Address.class)
						.buildSessionFactory();

		Session session = factory.getCurrentSession();				// create session
		

		try {

			int theAddressId = 2;
			
			session.beginTransaction();					// start transaction
			

			Address tempAddress = session.get(Address.class,theAddressId);
			
			if(tempAddress!=null) {
				System.out.println("Deleting : "+ tempAddress);
				
				//Note!! : it will also delete student data 
			    //         as we have provided CascadeType.ALL
				session.delete(tempAddress);
			}
			

			session.getTransaction().commit();				// commit transaction

		} finally {
			factory.close();
		}
	}
}
