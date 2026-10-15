package com.practice.map;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ankita");
        map.put(2, "Rutuja");
        map.put(3, "Akshata");
        map.put(4, "Mayuri");

        System.out.println("HashMap: " + map);

        // 2. get() - Gets value using key
        System.out.println("Value of key 1: " + map.get(1));

        // 3. containsKey() - Checks whether key exists
        System.out.println("Contains key 2: " + map.containsKey(2));

        // 4. containsValue() - Checks whether value exists
        System.out.println("Contains Ankita: "+ map.containsValue("Ankita"));

        map.remove(3);
        System.out.println("After remove(): " + map);

        
        System.out.println("Size: " + map.size());

        // 7. isEmpty() - Checks whether map is empty
        System.out.println("Is empty: " + map.isEmpty());

	}

}
