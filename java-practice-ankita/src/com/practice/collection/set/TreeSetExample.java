package com.practice.collection.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> list=new TreeSet<>();
		list.add("Ankita");
		list.add("Rutuja");
		list.add("Akshata");
		list.add("mayuri");
		
		System.out.println(list);
		
		//list.add(null); throw NullPointerException
		list.add("Sneha");
		list.add("Atharv");
		System.out.println(list);
		
		
		list.remove("mayuri");
		System.out.println(list);
		
		System.out.println(list.last());
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains("Rudra"));

	}

}
