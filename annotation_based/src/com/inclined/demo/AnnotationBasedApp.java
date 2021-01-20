package com.inclined.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getFortune());
		
		context.close();
		
	}

}
