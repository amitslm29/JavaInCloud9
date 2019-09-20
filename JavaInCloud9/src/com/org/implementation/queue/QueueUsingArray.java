package com.org.implementation.queue;

import java.util.NoSuchElementException;

public class QueueUsingArray {

	int[] arr;
	int front, rear, capacity, index;

	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = rear = index= 0;
	}

	public void add(int element) {
		if(isFull()){
			throw new IllegalStateException();
		}
		arr[rear] = element;
		rear = (rear+1) % capacity;
		index++;

	}

	public int remove() {
		if(isEmpty())
			throw new NoSuchElementException();
		int data = arr[front];
		arr[front] = 0;
		front = (front+1) % capacity;
		index--;
		return data;
	}

	public int element() {
		if(isEmpty())
			throw new NoSuchElementException();
		return arr[front];
	}
	
	public int size() {
		return index;
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public boolean isFull() {
		return index == capacity;
	}
	
	public void list() {
		for(int i=front ; i<rear ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
