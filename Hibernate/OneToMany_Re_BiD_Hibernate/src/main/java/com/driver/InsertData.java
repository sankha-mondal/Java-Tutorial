package com.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.entity.Course;
import com.entity.Student;


public class InsertData {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			
			// start transaction
			session.beginTransaction();

			// create the objects
			Student tempStudent = new Student("Hari", "Dey", "dey.hari@gmail.com");
			
			Course course1 = new Course("Python");
			Course course2 = new Course("Java");
			
			tempStudent.add(course1);
			tempStudent.add(course2);
		

			// save the student
			session.save(tempStudent);
			
			//save the course
			session.save(course1);
			session.save(course2);
			

			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Inserted Successfully");

		} finally {
			factory.close();
		}
	}
}
