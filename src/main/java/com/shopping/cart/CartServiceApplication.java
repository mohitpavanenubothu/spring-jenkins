package com.shopping.cart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class CartServiceApplication {

	@PostConstruct
	public void intt(){
		log.info("Application Started:::::");
	}

	public static void main(String[] args) {
		log.info("Application Executed:::::");
		SpringApplication.run(CartServiceApplication.class, args);
		log.info("Spring Boot Jenkins test 2");
		log.info("Spring Boot Jenkins test 3");
	}

}
