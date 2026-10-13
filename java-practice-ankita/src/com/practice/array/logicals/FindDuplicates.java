package com.practice.array.logicals;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] duplicate= {23,54,65,76,23,54,78};
		
		for(int i=0; i<duplicate.length; i++) {
			
			for(int j=i+1; j<duplicate.length; j++) {
				
				if(duplicate[i] == duplicate[j]) {
					System.out.println("duplicates are:"+duplicate[i]);
				}
			}
		}
	}

}
