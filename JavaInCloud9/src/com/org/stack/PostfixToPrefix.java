package com.org.stack;

import java.util.Stack;

public class PostfixToPrefix {
	
	public static void main(String[] args) {
		String postfix = "ABC/-AK/L-*";
		String prefix = convertPostfixToPrefix(postfix);
		System.out.println("Postfix : " + postfix);
		System.out.println("Prefix : " + prefix);
	}
	
	public static String convertPostfixToPrefix(String postfix) {
		
		Stack<String> stack = new Stack<>();
		int length = postfix.length();
		
		for(int i = 0; i<length ; i++) {
			char ch = postfix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push(""+ ch);
			}
			else {
				String s1 = stack.pop();
				String s2 = stack.pop();
				stack.push(ch + s2 + s1);
			}
		}
		
		return stack.pop();
	}

}
