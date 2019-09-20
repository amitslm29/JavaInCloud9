package com.org.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/*
 * Approach 3: Using one Queue
 * push - O(n), pop - O(1)
 * https://leetcode.com/articles/implement-stack-using-queues/
 */
public class StackUsingOneQueue {

	Queue<Integer> queue;
	StackUsingOneQueue(){
		queue = new LinkedList<>();
	}
	
	public void push(int element) {
		queue.add(element);
		int size = queue.size();
		while(size > 1) {
			queue.add(queue.remove());
			size--;
		}
	}
	
	public int pop() {
		if(queue.isEmpty())
			throw new NoSuchElementException();
		return queue.remove();
	}
	
	public int peek() {
		if(queue.isEmpty())
			throw new NoSuchElementException();
		return queue.element();
	}
	
	public int size() {
		return queue.size();
	}

	public boolean empty() {
		return queue.isEmpty();
	}

	public void list() {
		if(queue.isEmpty())
			return;
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
	}
}
