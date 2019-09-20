package com.org.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/*
 * Approach 2: By making pop operation costly
 * push - O(1), pop - O(n)
 * https://leetcode.com/articles/implement-stack-using-queues/
 */
public class StackUsingTwoQueues2 {

	Queue<Integer> q1;
	Queue<Integer> q2;

	StackUsingTwoQueues2() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}

	public void push(int element) {
		q1.add(element);
	}

	public int pop() {
		if(q1.isEmpty()) {
			throw new NoSuchElementException();
		}
		while(q1.size() > 1){
			q2.add(q1.remove());
		}
		int data = q1.remove();
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		return data;
	}

	public int peek() {
		if(q1.isEmpty()) {
			throw new NoSuchElementException();
		}
		while(q1.size() > 1){
			q2.add(q1.remove());
		}
		int data = q1.element();
		q2.add(q1.remove());
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		return data;
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
