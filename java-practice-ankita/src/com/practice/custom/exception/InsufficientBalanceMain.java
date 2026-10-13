package com.practice.custom.exception;

public class InsufficientBalanceMain {

	public static void main(String[] args) {
		
		InsufficientBalanceMain insufficientBalance=new InsufficientBalanceMain();
		
		try {
			insufficientBalance.checkBalance(5000, 6000);
		} catch (InsufficientBalanceException e) {
			
			e.printStackTrace();
		}

	}

	public void checkBalance(int balance,int withdraw) throws InsufficientBalanceException {
		
		if(withdraw > balance) {
			throw new InsufficientBalanceException("Withdraw amount is greater than actual balance");
		}
		else {
			System.out.println(balance + " now you can withdraw amount");
		}
	}
}
