package com.practice.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(10);
        deque.offerLast(20);
        deque.offerFirst(5);
        deque.offerLast(30);

        System.out.println("Deque: " + deque);

        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        deque.pollFirst();
        deque.pollLast();

        System.out.println("After removal: " + deque);
		
	}

}
