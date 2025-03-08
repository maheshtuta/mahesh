package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.demo", "com.example.ApplicationForUseApplication"})
public class ApplicationForUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationForUseApplication.class, args);
	}

}
