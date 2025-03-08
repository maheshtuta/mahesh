package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition
@Configuration

public class SwaggerConfig {
	@Bean
	public OpenAPI ChangeDef() {
		return new OpenAPI().info(new Info()
				.title("Students API")
				.version("3.0,0")
				.description("Student Appilication")
				);
	}

}
