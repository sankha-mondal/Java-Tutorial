package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();		
		//emp.displayInfo();				Don't do this 

		Resource res = new ClassPathResource("beans.xml");  // load xml file
		BeanFactory bean = new XmlBeanFactory(res);		//  get the bean reference
		
			
		//	Constructor based DI
//		Employee emp1 = (Employee)bean.getBean("obj1");
//		emp1.displayInfo();
//		
//		Employee emp2 = (Employee)bean.getBean("obj1");
//		emp2.displayInfo();
//		
//		Employee emp3 = (Employee)bean.getBean("obj2");
//		emp3.displayInfo();
//		
//		Employee emp4 = (Employee)bean.getBean("obj2");
//		emp4.displayInfo();
		
		Employee emp5 = (Employee)bean.getBean("obj1");
		System.out.println(emp5);
		
		Employee emp6 = (Employee)bean.getBean("obj3");
		System.out.println(emp6);
		
		//	Used for Setter based DI
		Employee emp7 = (Employee)bean.getBean("obj4");
		System.out.println(emp7);
		
		//  Working with Complex datatype
		Address add1 = (Address)bean.getBean("obj_add1");
		System.out.println(add1);
		
		Employee emp8 = (Employee)bean.getBean("obj5");
		System.out.println(emp8);
		
		
		//  Working with Complex datatype - AutoWire
		Employee emp9 = (Employee)bean.getBean("obj6");
		System.out.println(emp9);

		
	}

}
