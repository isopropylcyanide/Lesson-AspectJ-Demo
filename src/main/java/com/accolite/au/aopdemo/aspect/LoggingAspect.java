package com.accolite.au.aopdemo.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger log = Logger.getLogger(LoggingAspect.class);

	@Before("execution(public * getRandomList(..))")
	public void beforeLoggingAdvice() {
		log.info("Logging before the method gets called");
	}
}
