package com.org.implementation.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueUsingLinkedListInbuiltMethod {

	private LinkedList<Integer> queue = new LinkedList<Integer>();

	public void add(int element) {
		queue.addLast(element);
	}

	public int remove() {
		return queue.removeFirst();
	}

	public int element() {
		return queue.getFirst();
	}
	
	public int size() {
		return queue.size();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void list() {
		if(isEmpty())
			return;
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
}