package com.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;


public class DeleteData {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			int theCourseId=2;
			
			// start transaction
			session.beginTransaction();

			Course tempCourse = session.get(Course.class,theCourseId);
			
			if(tempCourse!=null) {
				System.out.println("Deleting : "+ tempCourse);
				
				//Note!! : it will not delete Student data 
			    //         as we have not provided CascadeType.ALL
				session.delete(tempCourse);
			}
			
			

			// commit transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
}

