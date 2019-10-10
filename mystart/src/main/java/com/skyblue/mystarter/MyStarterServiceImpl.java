package com.skyblue.mystarter;

import org.springframework.beans.factory.annotation.Autowired;

public class MyStarterServiceImpl implements MyStarterService{
	@Autowired
	private MyStarterProperties myStarterProperties;
	public String getMessage() {
		return myStarterProperties.getMessage();
	}

	public Integer getCode() {
		return myStarterProperties.getCode();
	}
}
