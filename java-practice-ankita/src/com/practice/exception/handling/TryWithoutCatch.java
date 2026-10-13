package com.practice.exception.handling;

public class TryWithoutCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num= 5 /0;
			System.out.println(num);
		}finally {
			System.out.println("always executed");
		}

	}

}
