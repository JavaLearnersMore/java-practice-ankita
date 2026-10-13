package com.practice.array.logicals;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,6,5,3};
		
		Set<Integer> seen=new LinkedHashSet<>();
		
		for(int num : arr) {
			
          seen.add(num);
			
		}
		System.out.println("remove duplicates :"+seen);

	}

}
