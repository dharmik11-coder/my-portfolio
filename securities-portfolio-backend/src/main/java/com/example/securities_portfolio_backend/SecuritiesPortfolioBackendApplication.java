package com.example.securities_portfolio_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SecuritiesPortfolioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritiesPortfolioBackendApplication.class, args);
	}

	// CORS configuration
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**")  // Allow all endpoints
						.allowedOrigins("http://localhost:4200") // Allow your frontend origin
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Allowed methods
			}
		};
	}
}
