package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	
	@Pointcut("execution(public String com.service.EmployeeService.sayHello(java.lang.String))")   // Use * for any
	public void myPointCut() {
		
	}
	
	@Before("myPointCut()")
	public void beforeAdvice1() {
		System.out.println("This code will execute before business method 1");
	}
	
	@Before("myPointCut()")
	public void beforeAdvice2() {
		System.out.println("This code will execute before business method 2");
	}
	
	@Before("myPointCut()")
	public void beforeAdvice3() {
		System.out.println("This code will execute before business method 3");
	}
	
	@After("myPointCut()")
	public void afterAdvice1() {
		System.out.println("This code will execute after business method 1");
	}
	
	@After("myPointCut()")
	public void afterAdvice2() {
		System.out.println("This code will execute after business method 2");
	}
	
	@After("myPointCut()")
	public void afterAdvice3() {
		System.out.println("This code will execute after business method 3");
	}
	
	@Around("myPointCut()")
	public void aroundMethod(ProceedingJoinPoint pp) {
		try {
			System.out.println("This code execute before with Around annotation");
						pp.proceed();
			System.out.println("This code execute after with Around annotation");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

	/**  O/p:
	    	This code execute before with Around annotation
		This code will execute before business method 1
		This code will execute before business method 2
		This code will execute before business method 3
		This code will execute after business method 3
		This code will execute after business method 2
		This code will execute after business method 1
		This code execute after with Around annotation
	 */


