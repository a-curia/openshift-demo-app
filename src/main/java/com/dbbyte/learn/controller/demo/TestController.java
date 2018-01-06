package com.dbbyte.learn.controller.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/test")
	public String testEndpoint() {
		logger.info("logging... testEndpoint() -> {}", "OK");
		return "Hello from test endpoint!";
	}

}
