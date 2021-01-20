package com.inclined.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private Fortune fortune;
	
	@Autowired
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getTraining() {
		return "Getting trained in Tennis";
	}

	@Override
	public String getFortune() {
		return this.fortune.getTodayFortune();
	}

}
