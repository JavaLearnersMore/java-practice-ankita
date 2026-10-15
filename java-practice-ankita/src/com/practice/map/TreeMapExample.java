package com.practice.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> map = new TreeMap<>();

        // 1. put() - Adds key-value pairs
        map.put(4, "Mayuri");
        map.put(2, "Rutuja");
        map.put(1, "Ankita");
        map.put(3, "Akshata");

        System.out.println("TreeMap: " + map);
        
        map.put(5, null);
       // map.put(null, "Amruta"); throw NullPointerException
        System.out.println(map);

        System.out.println("Value of key 2: " + map.get(2));

        System.out.println("First key: " + map.firstKey());

        System.out.println("Last key: " + map.lastKey());
		
	}

}
