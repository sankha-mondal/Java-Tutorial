package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
		System.out.println("Running on Port No: 8080 ...");
	}
	
	/*
	 * Dependencies: spring-boot-starter-jdbc, spring-boot-starter-web,
	 *               spring-boot-devtools, mysql-connector-j
	 */

}
