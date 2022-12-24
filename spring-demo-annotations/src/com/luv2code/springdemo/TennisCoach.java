package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> Inside default constructor Tennis Coach");
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> Inside default setFortuneService setter Tennis Coach");
		this.fortuneService = fortuneService;
	}
	*/
	
	// Init Method
	@PostConstruct
	public void myInitMethod() {
		System.out.println("TenisCoach Class init method");
	}
	
	// Destroy Method
	@PreDestroy
	public void myDestroyMethod() {
		System.out.println("TenisCoach Class destroy method");
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
