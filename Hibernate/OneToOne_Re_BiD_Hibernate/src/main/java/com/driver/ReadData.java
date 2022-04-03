package com.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Address;
import com.entity.Student;

public class ReadData {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()		// create session factory
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.addAnnotatedClass(Address.class)
						.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

				try {

					// start transaction
					session.beginTransaction();
					
					// get the address object
					int tempAddressId=1;
					Address tempAddress=session.get(Address.class, tempAddressId);

					
					// Print the Address
					System.out.println("Address Details : "+tempAddress);
								
					//print the associated student values
					System.out.println("Associated Student : "+ tempAddress.getStudent());
					

					// commit transaction
					session.getTransaction().commit();

				} finally {
					factory.close();
				}
			}
		}

