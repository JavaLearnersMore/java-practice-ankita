package com.practice.collection.list;

import java.util.LinkedList;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Stack<Integer> list=new Stack<>();
		
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
	System.out.println(list);
	
	list.push(60);
	System.out.println(list);
	
	//remove and return that element
	System.out.println(list.pop());
	
	//peek last elements
	System.out.println(list.peek());
	
	System.out.println(list.size());
	
	list.add(1, 60);
	System.out.println(list);
	
	
	}

}
