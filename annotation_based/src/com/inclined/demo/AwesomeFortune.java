package com.inclined.demo;

import org.springframework.stereotype.Component;

@Component
public class AwesomeFortune implements Fortune {

	@Override
	public String getTodayFortune() {
		return "This is an Awesome Fortune";
	}

}
