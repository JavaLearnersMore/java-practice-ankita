package com.practice.collection.list;

import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Vector<Integer> list=new Vector<>();
		
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
	System.out.println(list);
	
	list.addElement(60);
	System.out.println(list);
	
	list.addElement(80);
	System.out.println(list);
	
	list.remove(1);
	System.out.println("After remove 1 index value :"+list);
	
	System.out.println(list.contains(50));
	
	System.out.println(list.capacity());
	
	
		
	}

}
