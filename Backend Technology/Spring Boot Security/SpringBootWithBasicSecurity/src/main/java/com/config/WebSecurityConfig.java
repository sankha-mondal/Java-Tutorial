package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	// NooPasswordEncoder 
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		List<UserDetails> listOfUser = new ArrayList<UserDetails>();
		listOfUser.add(User.withDefaultPasswordEncoder().username("Raj").password("123").roles("USER_ROLE").build());
		listOfUser.add(User.withDefaultPasswordEncoder().username("Ravi").password("456").roles("USER_ROLE").build());
		
		return new InMemoryUserDetailsManager(listOfUser);
	}
	
}

