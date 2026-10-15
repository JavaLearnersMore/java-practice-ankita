package com.practice.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements
        deque.add("Ankita");
        deque.add("Rutuja");

        // Add at the beginning
        deque.addFirst("Akshata");

        // Add at the end
        deque.addLast("Mayuri");

        System.out.println("Deque: " + deque);

        // Get the first element
        System.out.println("First: " + deque.getFirst());

        // Get the last element
        System.out.println("Last: " + deque.getLast());

        // Remove the first element
        deque.removeFirst();

        System.out.println("After removal: " + deque);

    }
}