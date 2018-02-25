package jk.aop.aspect1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jk.aop.aspect1.configuration.SystemConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SystemConfiguration.class)
public class HelloWorldServiceTest {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@Test
	public void doBusiness() {
		helloWorldService.doBusiness();
	}

}
