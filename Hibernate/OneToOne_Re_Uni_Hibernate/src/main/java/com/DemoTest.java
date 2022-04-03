package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();		// Create SessionFactory object
		Session sesson = sf.openSession();			// Create Session object
		Transaction tran = sesson.getTransaction();  		// Create Transaction object
		
		Person p = new Person();				//  Create Person object
		p.setPid(1);
		p.setPname("Ravi");
		
		Passport pp = new Passport();				//  Create Passport object
		pp.setPpid(1122);
		pp.setDescription("Indian Passport");
		
		p.setPassport(pp);		// this Passport is belonging to this Person
		
		tran.begin();			// Start Transaction object
			sesson.save(p);				//  Save Person Object p
			sesson.save(pp);			//  Save Passport Object pp
		tran.commit();			// Commit Transaction object
		
		System.out.println("Record saved succesfully");
		
	}

}
