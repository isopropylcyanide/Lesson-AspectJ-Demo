package com.accolite.au.aopdemo.aspect;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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

	@Around("execution(public * getRandomList(..))")
	public void aroundLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		log.info("***Measuring method invocation time.***");
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		proceedingJoinPoint.proceed();
		stopWatch.stop();
		log.info("***Method execution completed. Elapsed time: " + stopWatch.getTime() + " ms.***");
	}
}
