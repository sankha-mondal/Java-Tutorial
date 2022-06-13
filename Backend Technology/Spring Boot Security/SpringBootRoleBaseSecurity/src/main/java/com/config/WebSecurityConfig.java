package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
		String user1Password = passwordEncoder().encode("123");
		String user2Password = passwordEncoder().encode("456");
		String adminPassword = passwordEncoder().encode("admin");
		System.out.println("user1 password "+user1Password);
		System.out.println("user1 password "+user2Password);
		System.out.println("user1 password "+adminPassword);
		auth.inMemoryAuthentication().withUser("Raj").password(user1Password).roles("USER");
		auth.inMemoryAuthentication().withUser("Ajay").password(user2Password).roles("USER");
		auth.inMemoryAuthentication().withUser("Admin").password(adminPassword).roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		http.csrf().disable();
		http.formLogin();
		http.authorizeRequests().antMatchers("/auth/admin/**").hasRole("ADMIN").
		antMatchers("/auth/user/**").hasAnyRole("USER","ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
		
		//  http://localhost:8080/auth/user/say
		//  http://localhost:8080/auth/admin/say
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}
}
