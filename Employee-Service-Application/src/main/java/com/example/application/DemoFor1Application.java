package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoFor1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoFor1Application.class, args);
	}

}
