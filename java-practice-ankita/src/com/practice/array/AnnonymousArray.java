package com.practice.array;

public class AnnonymousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(new int[]{20,30,40,50,10});

	}

	private static void sum(int[] x) {
		
		int total=0;
		
		for(int x1:x) {
			
			total=total+x1;
		}
		
		System.out.println("sum is :"+total);
	}

}
