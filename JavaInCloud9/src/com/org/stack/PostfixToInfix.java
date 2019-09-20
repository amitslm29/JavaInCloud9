package com.org.stack;

import java.util.Stack;

public class PostfixToInfix {
	
	public static void main(String[] args) {
		String postfix = "xya*b/zde*+-c+f/-";
		String infix = convertToInfix(postfix);
		System.out.println("Postfix : " + postfix);
		System.out.println("Infix : " + infix);
	}
	
	public static String convertToInfix(String postfix) {
		
		Stack<String> stack = new Stack<>();
		int length = postfix.length();
		
		for(int i=0 ; i<length ; i++) {
			char ch = postfix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push("" + ch);
			}
			else {
				String s1 = stack.pop();
				String s2 = stack.pop();
				//stack.push("(" + s2 + ch + s1 + ")");
				stack.push(s2 + ch + s1);
			}
		}
		return stack.pop();
	}
}
