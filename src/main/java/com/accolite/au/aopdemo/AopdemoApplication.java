package com.accolite.au.aopdemo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accolite.au.aopdemo.task.RandomListCreator;

@SpringBootApplication
public class AopdemoApplication {

	private static final Logger log = Logger.getLogger(AopdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
		RandomListCreator randomListCreator = new RandomListCreator();
		log.info(randomListCreator.getRandomList(10, 12, 100));
	}
}
