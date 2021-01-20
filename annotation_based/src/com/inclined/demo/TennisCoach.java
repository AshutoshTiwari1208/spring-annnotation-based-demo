package com.inclined.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
//	@Autowired
//	@Qualifier("randomFortune")
	private Fortune fortune;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	public TennisCoach(Fortune happyFortune) {
		// TODO Auto-generated constructor stub
		this.fortune = happyFortune;
	}

	@Override
	public String getTraining() {
		return "Getting trained in Tennis";
	}

	@Override
	public String getFortune() {
		return "Email is: "+ this.email + " " + this.fortune.getTodayFortune();	
	}
	
	@PreDestroy
	public void onEnd() {
		System.out.println("Due to context.close() ----cleaning up now !");
	}
	
	@PostConstruct
	public void onStart() {
		System.out.println("Hey ! Tennis is initialized completely");
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}
	
	

}
