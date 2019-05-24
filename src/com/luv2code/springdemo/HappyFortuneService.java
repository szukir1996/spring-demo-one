package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] happyFortunes = {
			"First fortune", "Second fortune", "Third fortune", "gfdgfd", "555555", "3333333"
	};
	
	@Override
	public String getFortune() {
		int number = new Random().nextInt(happyFortunes.length);
		return happyFortunes[number];
	}

}
