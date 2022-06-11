package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com")			// Enable @Restcontroller, @Service and @Repository 
@EntityScan(basePackages = "com.bean")						// Enable entity class 
@EnableJpaRepositories(basePackages = "com.repository")		// Jpa Repository 
public class SpringBootWithRestWithSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRestWithSpringDataApplication.class, args);
		System.out.println("Server up with port number 8080!");
	}
}

//  Run on localhost:8761  {swagger}


