package com.org.stack;

import java.util.Stack;

public class BalancedParantheses {

	public static void main(String[] args) {
		String inputParantheses = "{()}[{}]";
		//String inputParantheses = "{([";
		//String inputParantheses = "{([])}}]";
		System.out.println("Is above pattern is balanced : " + isBalanced(inputParantheses));
	}
	
	public static boolean isBalanced(String paran) {
		
		Stack<Character> stack = new Stack<>();
		int length = paran.length();
		for(int i=0 ; i<length ; i++) {
			char ch = paran.charAt(i);
			if(ch == '(' || ch == '{' ||ch == '[')
				stack.push(ch);
			else {
				if(stack.empty())
					return false;
				else if(!isMatchingPair(stack.pop(), ch))
					return false;
			}
		}
		if(stack.empty())
			return true;
		else
			return false;
	}
	
	public static boolean isMatchingPair(char c1, char c2) {
		if(c1 == '(' && c2 == ')')
			return true;
		else if(c1 == '{' && c2 == '}')
			return true;
		else if(c1 == '[' && c2 == ']')
			return true;
		return false;
	}
}
