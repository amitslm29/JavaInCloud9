package com.org.implementation.queue;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList<E> {

	static class Node<E> {
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	Node<E> rear, front;
	int size;

	public QueueUsingLinkedList() {
		rear = front = null;
		size = 0;
	}

	public void add(E element) {
		Node<E> node = new Node<E>(element);
		if(rear == null)
			rear = front = node;
		else {
			rear.next = node;
			rear = node;
		}
		size++;
	}

	public E remove() {
		if(front == null || rear == null)
			throw new NoSuchElementException();
		E removedData = front.data;
		if(rear == front){
			rear = front = null;
		} else {
			front = front.next;
		}
		size--;
		return removedData;
	}

	public E element() {
		if(front == null || rear == null)
			throw new NoSuchElementException();
		return front.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void list() {
		if(front == null)
			return;
		Node<E> temp = front;
		while(temp != rear.next){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
