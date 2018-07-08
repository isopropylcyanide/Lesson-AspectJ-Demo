package com.accolite.au.aopdemo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopdemoApplication {

	private static final Logger log = Logger.getLogger(AopdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}
}
