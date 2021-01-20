package com.inclined.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune {

	@Override
	public String getTodayFortune() {
		return "Today's Day is gonna be awesome!";
	}

}
