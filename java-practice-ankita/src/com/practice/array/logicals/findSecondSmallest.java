package com.practice.array.logicals;

public class findSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,34,54,67,23,65,98,2,1};

		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] < smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
			
		}
		System.out.println("smallest is :"+smallest);
		System.out.println("Second Smallest is :"+secondSmallest);
		
		
	}

}
