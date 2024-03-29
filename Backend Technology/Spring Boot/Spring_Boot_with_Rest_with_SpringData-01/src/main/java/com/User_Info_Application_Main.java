package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com")			// Use to enable @Restcontroller, @Service and @Repository 
@EntityScan(basePackages = "com.bean")						// Use to enable entity class 
@EnableJpaRepositories(basePackages = "com.repository")		// Jpa Repository 
public class User_Info_Application_Main {

	public static void main(String[] args) {
		SpringApplication.run(User_Info_Application_Main.class, args);
		System.out.println("Server up with port number 8181!");
	}
}

	/**
	 *   Dependencies: jpa, JDBC, web, devtools, mysql
	 *   Run as: Java Application
	 */




