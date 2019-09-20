package com.org.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/*
 * Approach 1: By making push operation costly
 * push - O(n), pop - O(1)
 * https://leetcode.com/articles/implement-stack-using-queues/
 */
public class StackUsingTwoQueues1 {
	
	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public StackUsingTwoQueues1() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	public void push(int element) {
		
		if(q1.isEmpty()) {
			q1.add(element);
		} else {
			q2.add(element);
			while(!q1.isEmpty()){
				q2.add(q1.remove());
			}
			Queue<Integer> temp = q1;
			q1 = q2;
			q2 = temp;
		}
	}
	
	public int pop() {
		if(q1.isEmpty())
			throw new NoSuchElementException();
		return q1.remove();
	}
	
	public int peek() {
		if(q1.isEmpty())
			throw new NoSuchElementException();
		return q1.element();
	}
	
	public int size() {
		return q1.size();
	}
	
	public boolean empty() {
		return q1.isEmpty();
	}
	
	public void list() {
		if(q1.isEmpty())
			return;
		Iterator<Integer> iterator = q1.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
	}
}
