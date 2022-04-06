package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		
		//1st way 
		Project p = new Project();
		p.setPid(1122);
		p.setProjectName("Java Project");
		
		Employees emp1 = new Employees();
		emp1.setId(1);
		emp1.setName("Ravi");
		emp1.setEpid(1122);
		
		Employees emp2 = new Employees();
		emp2.setId(2);
		emp2.setName("Raju");
		emp2.setEpid(1122);
		
		List<Employees> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		p.setListOfEmp(listOfEmp);
		
		tran.begin();
				session.save(p);
				session.save(emp1);
				session.save(emp2);
		tran.commit();
		System.out.println("Record inserted...");
	}
	

}
