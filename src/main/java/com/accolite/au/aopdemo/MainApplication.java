package com.accolite.au.aopdemo;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	private static final Logger log = Logger.getLogger(AopdemoApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopdemoApplication.class);
		context.close();
	}
}
