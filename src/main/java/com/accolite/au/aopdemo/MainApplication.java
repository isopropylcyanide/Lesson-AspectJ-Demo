package com.accolite.au.aopdemo;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accolite.au.aopdemo.task.RandomListCreator;

public class MainApplication {

	private static final Logger log = Logger.getLogger(AopdemoApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopdemoApplication.class);
		RandomListCreator randomListCreator = context.getBean("randomListCreator", RandomListCreator.class);
		log.info(randomListCreator.getRandomList(10, 12, 100));
		context.close();
	}
}
