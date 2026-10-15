package com.practice.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Ankita");
        map.put(2, "Rutuja");
        map.put(3, "Akshata");
        map.put(4, "Mayuri");

        System.out.println("LinkedHashMap: " + map);

        System.out.println("Value of key 2: " + map.get(2));

        System.out.println("Contains key 3: " + map.containsKey(3));
       
        System.out.println("Contains Mayuri: "+ map.containsValue("Mayuri"));

        map.remove(4);
        System.out.println("After remove(): " + map);

        System.out.println("Size: " + map.size());
       
        map.putIfAbsent(5, "Pooja");
        System.out.println("After putIfAbsent(): " + map);

        //replace
        map.replace(1, "Ankita More");
        System.out.println("After replace(): " + map);

	}

}
