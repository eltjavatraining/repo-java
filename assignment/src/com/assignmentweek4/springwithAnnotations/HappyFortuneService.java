package com.assignmentweek4.springwithAnnotations;

import org.springframework.stereotype.Service;

/*
 * This is HappyFortuneService class
 */
@Service
public class HappyFortuneService implements FortuneService {
	/*
	 * This is getFortune method
	 */
	@Override
	public String getFortune() {
		
		return "Today is movie release";
	
	}
}
