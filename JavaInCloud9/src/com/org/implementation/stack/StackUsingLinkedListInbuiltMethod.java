package com.org.implementation.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class StackUsingLinkedListInbuiltMethod<E> {
	
	private LinkedList<E> list = new LinkedList<>();
	
	public void push(E element) {
		list.addFirst(element);
	}

	public E pop() {
		return list.removeFirst();
	}

	public E peek() {
		return list.getFirst();
	}

	public int size() {
		return list.size();
	}
	
	public boolean empty() {
		return list.isEmpty();
	}

	public void list() {
		Iterator<E> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
	}
}
