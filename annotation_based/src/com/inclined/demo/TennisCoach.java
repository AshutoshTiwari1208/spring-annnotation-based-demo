package com.inclined.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortune")
	private Fortune fortune;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	@Override
	public String getTraining() {
		return "Getting trained in Tennis";
	}

	@Override
	public String getFortune() {
		return "Email is: "+ this.email + " " + this.fortune.getTodayFortune();
		
	}

}
