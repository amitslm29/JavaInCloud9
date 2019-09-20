package com.org.stack;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		String reverse = reverseString(str);
		System.out.println("Reverse String is : " + reverse);
	}
	
	public static String reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			stack.push(ch);
		}
		
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		return sb.toString();
	}

}
