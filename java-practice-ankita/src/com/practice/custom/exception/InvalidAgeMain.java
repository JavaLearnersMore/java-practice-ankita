package com.practice.custom.exception;

public class InvalidAgeMain {
	
	public void chekAge(int age) throws InvalidAgeException {
		
		if(age < 18) {
			throw new InvalidAgeException("age is invalid to vote");
		}
		else {
			System.out.println("age is valid now you can vote");
		}
	}

	public static void main(String[] args) {

		InvalidAgeMain i= new InvalidAgeMain();
		try {
			i.chekAge(15);
		} catch (InvalidAgeException e) {
			
			e.printStackTrace();
		}
	}

}
