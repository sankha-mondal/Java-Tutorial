package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("Press 1.Retrieve all object:\nPress 2.Retrieve all objectwith condition:\n");
		System.out.println("Press 3.Retrieve only one property i.e name:\nPress 4.Retrieve two property name,salary:\n");
		System.out.println("Press 5.Aggregate function using Criteria:\n");
		
		// Retrieve all object [Press 1]
		/**
		Criteria cr	= session.createCriteria(Employee.class);
		List<Employee> listOfEmp = cr.list();
		System.out.println("Number of Employee "+listOfEmp.size());
		listOfEmp.forEach(e->System.out.println(e));
		*/
		
		// Retrieve all object with condition 	[Press 2]
		/**
		Criteria cr	= session.createCriteria(Employee.class);
		
		//Criterion cc = Restrictions.gt("salary", 15000f);
		//Criterion cc = Restrictions.between("id", 102, 104);
		//Criterion cc = Restrictions.and(Restrictions.like("name", "Ritu"),Restrictions.eq("id", 102));
		Criterion cc = Restrictions.or(Restrictions.like("name", "Ritu"),Restrictions.eq("id", 104));
		cr.add(cc);
		List<Employee> listOfEmp = cr.list();
		System.out.println("Number of Employee "+listOfEmp.size());
		listOfEmp.forEach(e->System.out.println(e));
		*/
		
		// Retrieve only one property i.e name 		[Press 3]
		/**
		Criteria cr	= session.createCriteria(Employee.class);
		cr.setProjection(Projections.property("name"));
		List<String> listOfEmp = cr.list();
		System.out.println("Number of Employee "+listOfEmp.size());
		listOfEmp.forEach(e->System.out.println(e));
		*/
		
		// Retrieve two property name,salary 		[Press 4]
		/**
		Criteria cr	= session.createCriteria(Employee.class);
		Projection p1 = Projections.property("name");
		Projection p2 = Projections.property("salary");
		ProjectionList pp = Projections.projectionList();
		pp.add(p1); 
		pp.add(p2);
		cr.setProjection(pp);
		List<Object[]> listOfEmp = cr.list();
		System.out.println("Number of Employee "+listOfEmp.size());
		listOfEmp.forEach(e->System.out.println("Name "+e[0]+"| Salary "+e[1]));
		*/

		// Aggregate function using Criteria		[Press 5]
		/**
		Criteria cr	= session.createCriteria(Employee.class);
		//cr.setProjection(Projections.max("salary"));
		//cr.setProjection(Projections.min("salary"));
		cr.setProjection(Projections.sum("salary"));
		
		List<Float> ll =cr.list();
		System.out.println("salary "+ll.get(0));
		*/
	}

}