package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication			// Use to enable @Restcontroller, @Service and @Repository 
@EnableEurekaClient
@EntityScan(basePackages = "com.bean")	// Use to enable entity class
@EnableJpaRepositories(basePackages = "com.repository")		// Jpa Repository
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		System.out.println("User service running on port number 8585");
	}

}
