package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class DemoConfig {
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		@SuppressWarnings("deprecation")
		UserDetails user= User.withDefaultPasswordEncoder()
				.username("mahesh")
				.password("Mahesh@123")
				.roles("user")
				.build();
		return new InMemoryUserDetailsManager(user);
		
	}
//	public SecurityFilterChain filterChain(HttpStatus http) {
//		http.authorizeHttpRequests((authz)-> authz
//				.antMatchers("/message")
//				//.anyRequests()
//				.authenticated()
//				)
//		        .httpBasic();
//	return http.build();	
//	}


}
