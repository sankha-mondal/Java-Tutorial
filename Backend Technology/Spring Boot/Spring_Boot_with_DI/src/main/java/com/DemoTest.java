package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoTest {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("com");
		ac.refresh();
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		
		emp.setId(101);
		emp.setName("Rajesh");
		emp.setSalary(29000);
		Address add = emp.getAdd();
		add.setCity("bangalore");
		add.setState("Karnataka");
		System.out.println(emp);
		
	}
}
