package com.org.implementation.stack;

import java.util.NoSuchElementException;

public class StackUsingLinkedList<E> {

	static class Node<E> {
		E data;
		Node<E> next;
		public Node(E data){
			this.data = data;
			next = null;
		}
	}

	Node<E> top;
	int size;

	public StackUsingLinkedList(){
		top = null;
		size = 0;
	}
	
	public void push(E data) {
		Node<E> node = new Node<E>(data);
		node.next = top;
		top = node;
		size++;
	}

	public E pop(){
		if(top == null)
			throw new NoSuchElementException();
		E removedData = top.data;
		if(top.next == null)
			top = null;
		else
			top = top.next;
		size--;
		return removedData;
	}

	public E peek(){
		if(empty())
			throw new NoSuchElementException();
		return top.data;
	}
	
	public int size() {
		return size;
	}

	public boolean empty() {
		return top == null;
	}

	public void list() {
		if(size == 0)
			return;
		Node<E> temp = top;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
