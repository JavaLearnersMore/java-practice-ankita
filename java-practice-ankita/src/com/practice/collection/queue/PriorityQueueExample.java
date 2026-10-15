package com.practice.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(5);

        System.out.println(queue);
        
        queue.add(4);
        System.out.println(queue);

        System.out.println("Head: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("After poll: " + queue);
		
	}

}
