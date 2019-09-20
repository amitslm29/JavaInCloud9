package com.org.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/*
 * Stack that supports push, pop, top, and retrieving the 
 * minimum element in constant time, O(1)
 */
public class MinStack {
	
	Stack<Integer> mainStack;
	Stack<Integer> minStack;
	
	public MinStack() {
		mainStack = new Stack<>();
		minStack = new Stack<>();
	}
	
	public void push(int element) {
		if(mainStack.isEmpty()) {
			mainStack.push(element);
			minStack.push(element);
		}
		else {
			if(element < minStack.peek()) {
				mainStack.push(element);
				minStack.push(element);
			} else {
				mainStack.push(element);
			}
		}
	}
	
	public int pop() {
		if(mainStack.isEmpty())
			throw new EmptyStackException();
		if(mainStack.peek() == minStack.peek()){
			minStack.pop();
		}
		return mainStack.pop();
	}
	
	public int peek(){
		if(mainStack.isEmpty())
			throw new EmptyStackException();
		return mainStack.peek();
	}
	
	public int getMin() {
		return minStack.peek();
	}

	public void list() {
		if(mainStack.isEmpty())
			return;
		Iterator<Integer> iterator = mainStack.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(15);
		stack.push(12);
		stack.push(17);
		stack.push(13);
		System.out.println("Minimum Element : " + stack.getMin());
		stack.push(11);
		stack.push(19);
		System.out.println("Minimum Element : " + stack.getMin());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Minimum Element : " + stack.getMin());
		stack.list();
	}
}
