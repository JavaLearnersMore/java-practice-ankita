package com.practice.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> list=new LinkedHashSet<>();
		list.add("Ankita");
		list.add("Rutuja");
		list.add("Akshata");
		list.add("mayuri");
		
		System.out.println(list);
		
		list.add("Sejal");
		list.add("Tejswi");
		System.out.println(list);
		
		list.remove("Sejal");
		System.out.println(list);
		
		System.out.println(list.contains("Akshata"));
		
		System.out.println(list.size());
		
		
	}
	

}
