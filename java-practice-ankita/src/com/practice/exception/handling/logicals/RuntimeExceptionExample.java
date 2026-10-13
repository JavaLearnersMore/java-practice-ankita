package com.practice.exception.handling.logicals;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArithmeticException
		
		try {
     		int a= 20 / 0;	
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Can't divide by zero");
		}
		
		
		//arrayIndexOutOfBoundsException
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("invalid index");
		}
		
		
		//NullPointerException
		try {
			String a= null;
			System.out.println(a.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("string is null");
		}
		
		
		//NumberFormatException
		try {
			String name="ankita";
			int num=Integer.parseInt(name);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		//StringIndexoutofBoundException
		try {
			String obj="ankita";
			System.out.println(obj.charAt(6));
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//

	}

}
