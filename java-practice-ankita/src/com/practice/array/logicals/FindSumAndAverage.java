package com.practice.array.logicals;

public class FindSumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,4,5,7,4,8};
		
		int sum=0;
		int average=0;
		
		for(int i=0; i<arr.length;i++) {
			
			sum=sum+arr[i];
			average= (int) sum / arr.length;
			
		}
		System.out.println("sum is :"+sum);
		System.out.println("average is :"+average);

	}

}
