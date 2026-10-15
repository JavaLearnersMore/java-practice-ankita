package com.practice.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        LinkedList<Integer> list=new LinkedList<>();
		
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
	System.out.println(list);
	
	list.addFirst(100);
	list.addLast(100);
	System.out.println(list);
	
	list.removeFirst();
	System.out.println(list);
	
    System.out.println(list.get(6));
    
    System.out.println(list.getFirst());
    
    System.out.println(list.peekLast());
    
    System.out.println(list.size());
    
		
	}

}
