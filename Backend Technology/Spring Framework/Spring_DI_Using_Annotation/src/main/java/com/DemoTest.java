package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {

		//  Using XML file configuration
		//ApplicationContext ac  = new ClassPathXmlApplicationContext("beans.xml");
		
		//  Without Using XML file configuration | pure annotation
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);	// pure annotation with java classes. 		
		
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		
		emp.setId(100);
		emp.setName("Ramesh");
		emp.setSalary(12000);
		List<Long> listOfNumber = new ArrayList<>();
		listOfNumber.add(9900L);
		listOfNumber.add(9911L);
		emp.setPhNumber(listOfNumber);
		String skill[]={"Java","Python","Angular"};
		emp.setSkillSet(skill);
		Address add = emp.getAdd();
		add.setCity("bangalore");
		add.setState("Karnataka");

		System.out.println(emp);

	}

}
