package com.practice.custom.exception;

public class ProductNotFoundException extends Exception{
	
	String message;
	public ProductNotFoundException(String message) {
		this.message=message;
	}

	public static void main(String[] args) {
		
		try {
			checkProduct(1);
		} catch (ProductNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void checkProduct(int stock) throws ProductNotFoundException{
		
		if(stock <= 0) {
			throw new ProductNotFoundException("product is not available for this stock");
		}
		else {
			System.out.println("product is available for this stock");
		}
		
	}

}
