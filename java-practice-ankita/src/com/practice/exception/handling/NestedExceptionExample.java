package com.practice.exception.handling;

public class NestedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("outer try block");
			
			   try {
				   int a = 10 /0;
				   System.out.println(a);
			   }
			   catch(ArithmeticException e) {
				   e.printStackTrace();
			   }
			   
		int[] arr= {1,2,3,4};
		System.out.println(arr[4]);
			   
		}catch(ArrayIndexOutOfBoundsException e) {
	       e.printStackTrace();
	       System.out.println("end try block");
		}

	}

}
