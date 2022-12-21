package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
		"random fortuen first",
		"random fortune second",
		"random fortune third"
	};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = random.nextInt(data.length);
		return data[index];
	}

}
