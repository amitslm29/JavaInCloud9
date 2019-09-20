package com.org.collection;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		for (int i=1 ; i<=10 ; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		System.out.println(stack.search(1));
		System.out.println(stack.search(11));
		
		while (!stack.empty()) {
			System.out.print(stack.pop());
			System.out.print(" ,");
		}
	}
}
