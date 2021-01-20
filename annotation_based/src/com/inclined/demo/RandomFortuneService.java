package com.inclined.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("randomFortune")
public class RandomFortuneService implements Fortune {
	
	private String[] arr = {
			"Random1: Beware of Wolf in Sheep's clothes",
			"Random2: All that glitter's is not gold",
			"Random3: Ever Morning is a new ray of sunshine"
	};
	
	Random myRandom = new Random();

	@Override
	public String getTodayFortune() {
		int index = myRandom.nextInt(arr.length);
		return arr[index];
	}

}
