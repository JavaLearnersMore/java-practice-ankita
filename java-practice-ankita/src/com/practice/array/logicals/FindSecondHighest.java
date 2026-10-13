package com.practice.array.logicals;

public class FindSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {23,54,67,89,12,32,87,98};
		
		int highest=0;
		int secondHighest=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > highest) {
				secondHighest=highest;
				highest=arr[i];
			}
		}
		System.out.println("secondHighest numbers is :"+secondHighest);
		System.out.println("highest number is :"+highest);
	}

}
