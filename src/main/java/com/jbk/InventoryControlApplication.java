package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryControlApplication.class, args);
		System.out.println("spring is running...");
	}

}
