package com.practice.collection.list;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
	System.out.println(list);
	
	list.add(50);
	System.out.println(list);
	
	list.remove(4);
	System.out.println("After remove 4 index value :"+list);
	
	list.set(1, 90);
	System.out.println("After add 1 index value 90 :"+list);
	
	System.out.println("Value Of 3 index is :"+list.get(3));
	
	System.out.println(list.contains(50));
	
	System.out.println(list.isEmpty());
	
	}

}
