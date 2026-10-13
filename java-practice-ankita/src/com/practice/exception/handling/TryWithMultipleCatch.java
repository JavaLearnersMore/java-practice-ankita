package com.practice.exception.handling;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10/0;
		System.out.println(num);
		
		try {
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
