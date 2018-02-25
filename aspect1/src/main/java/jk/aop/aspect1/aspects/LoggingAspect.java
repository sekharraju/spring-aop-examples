package jk.aop.aspect1.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	protected Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before(value="execution(* *(..))")
	public void performLogging(JoinPoint joinPoint) {
		String methodeName = joinPoint.getSignature().getName();
		logger.info("Logging Executed for: "+methodeName);
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
