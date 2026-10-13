package com.practice.exception.handling;

import java.io.IOException;

public class ThrowsAndThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		try {
			checkAge(15);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void checkAge(int age) throws IOException {
		
		if(age < 18) {
			throw new IOException("Not Eligible To vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}

}
