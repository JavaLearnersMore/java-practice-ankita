package com.practice.array.logicals;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] minmax= {10,20,3,40,50,39,90,2};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<minmax.length;i++) {
			
			if(minmax[i] > max) {
				max=minmax[i];
			}
			else if(minmax[i] < min) {
				min=minmax[i];
			}
			
		}
		System.out.println("max is :"+max);
		System.out.println("min is :"+min);

	}

}
