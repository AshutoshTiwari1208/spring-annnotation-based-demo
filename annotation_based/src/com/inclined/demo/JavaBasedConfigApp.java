package com.inclined.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaBasedConfigApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getTraining());
		System.out.println(coach.getFortune());
		
	}

}
