package jk.aop.aspect1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
	
	private Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

	public void doBusiness() {
		logger.info("Hello World");
		logger.info("Completed Business execution");
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	
}
