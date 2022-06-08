package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com")
@EnableAspectJAutoProxy(exposeProxy = true)		// it is use to enable aspect 
public class SpringBootWithAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithAopApplication.class, args);
		System.out.println("Server up!");
	}

}



