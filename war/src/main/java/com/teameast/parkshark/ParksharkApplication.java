package com.teameast.parkshark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class ParksharkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParksharkApplication.class, args);
	}

}
