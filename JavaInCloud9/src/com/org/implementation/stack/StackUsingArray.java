package com.org.implementation.stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackUsingArray {
	
	int[] arr;
	int capacity;
	int index = 0;
	
	public StackUsingArray (int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	public void push(int element) {
		if(full()) {
			throw new StackOverflowError("Stack in Full.");
		}
		arr[index] = element;
		index++;
	}
	
	public int pop() {
		if(empty()){
			throw new EmptyStackException();
		}
		int data = arr[index-1];
		arr[index-1] = 0;
		index--;
		return data;
	}
	
	public int peek(){
		if(empty()) {
			throw new NoSuchElementException();
		}
		return arr[index-1];
	}
	
	public int size() {
		return index;
	}
	
	public boolean empty() {
		return index == 0;
	}
	
	public boolean full() {
		return index == capacity;
	}

	public void list() {
		for(int i=index-1 ; i>=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
