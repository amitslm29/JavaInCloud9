package com.org.stack;

import java.util.Stack;

public class PrefixToPostfix {

	public static void main(String[] args) {
		String prefix = "*-A/BC-/AKL";
		String postfix = convertPrefixToPostfix(prefix);
		System.out.println("Prefix : " + prefix);
		System.out.println("Postfix : " + postfix);
	}
	
	public static String convertPrefixToPostfix(String prefix) {
		Stack<String> stack = new Stack<>();
		int length = prefix.length();
		
		for(int i=length-1 ; i>=0 ; i--) {
			char ch = prefix.charAt(i);
			if(Character.isLetterOrDigit(ch))
				stack.push("" + ch);
			else {
				String s1 = stack.pop();
				String s2 = stack.pop();
				stack.push(s1 + s2 + ch);
			}
		}
		return stack.pop();
	}
}
