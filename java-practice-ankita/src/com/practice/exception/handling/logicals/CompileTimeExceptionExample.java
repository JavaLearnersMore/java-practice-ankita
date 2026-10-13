package com.practice.exception.handling.logicals;

import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CompileTimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IoException
		try {
			FileReader file=new FileReader("abc.txt");
			System.out.println("file opend successfully");
		}catch(IOException e) {
			System.out.println("can not open file :"+e.getMessage());
		}

		
		//ClassNotFoundException
		try {
			Class.forName("myClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("class is not available ");
		}
		
		//InterruptedException
		try {
			Thread.sleep(2000);
			System.out.println("after sleep");
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Thread Interrupted");
		}
		
		//SqlException
		try {
			DriverManager.getConnection("JDBC:employeedb","user","password");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
