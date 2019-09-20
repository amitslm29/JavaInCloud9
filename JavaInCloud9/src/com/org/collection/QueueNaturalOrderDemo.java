package com.org.collection;

import java.util.PriorityQueue;

public class QueueNaturalOrderDemo {
	
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.offer("Amit"); //queue.add("Amit");
		queue.offer("Rohit");
		queue.offer("Ravi");
		queue.offer("Haroon");
		queue.offer("Bhupathi");
		
		System.out.println("Elements in Queue : " + queue);
		System.out.println("Head (ELEMENT) : "+ queue.element());  
		System.out.println("Head (PEEK) : "+ queue.peek());  

		queue.remove();  
		queue.poll();
		
		System.out.println("Elements in Queue After Removal : " + queue); 
	}
	
}
