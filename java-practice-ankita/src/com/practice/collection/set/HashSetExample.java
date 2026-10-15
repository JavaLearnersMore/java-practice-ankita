package com.practice.collection.set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> list=new HashSet<>();
		list.add("Ankita");
		list.add("Rutuja");
		list.add("Akshata");
		list.add("mayuri");
		
		System.out.println(list);
		
		list.add("Sejal");
		list.add("Riddhi");
		System.out.println(list);
		
		list.remove("Riddhi");
        System.out.println("After remove(): " + list);
        
        System.out.println(list.contains("Rutuja"));
        
        System.out.println(list.size());
        
        System.out.println(list.isEmpty());

	}

}
