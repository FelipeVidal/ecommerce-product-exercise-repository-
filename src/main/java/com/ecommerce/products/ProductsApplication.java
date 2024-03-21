package com.ecommerce.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.ecommerce.controller","com.ecommerce.repository","com.ecommerce.service"})
@EntityScan(basePackages = {"com.ecommerce.model"})
@EnableJpaRepositories(basePackages = {"com.ecommerce.repository"})
@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

}