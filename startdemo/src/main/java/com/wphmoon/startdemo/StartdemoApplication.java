package com.wphmoon.startdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StartdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StartdemoApplication.class, args);
		((TestService)context.getBean("testService")).message();
	}

}
