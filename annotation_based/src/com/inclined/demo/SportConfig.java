package com.inclined.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SportConfig {
	
	@Bean
	public Fortune happyFortune() {
		return new HappyFortune();
	}
	
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(happyFortune());
	}
	

}
