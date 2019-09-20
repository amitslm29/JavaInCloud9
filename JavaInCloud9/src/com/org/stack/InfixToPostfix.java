package com.org.stack;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		String infix = "x-(y*a/b-(z+d*e)+c)/f";
		//String infix = "a^b^c^d^e^f";
		String postfix = convertToPostfix(infix);
		System.out.println("Infix : " + infix);
		System.out.println("Postfix : " + postfix);
	}

	public static String convertToPostfix(String infix) {

		Stack<Character> stack = new Stack<>();
		StringBuffer bPostfix = new StringBuffer();
		int length = infix.length();

		for(int i=0; i<length ; i++) {
			char ch = infix.charAt(i);

			//If scanned character is operand, add it to the output
			if(Character.isLetterOrDigit(ch))
				bPostfix.append(ch);
			
			//If scanned character is '(', push it to the stack
			else if(ch == '(')
				stack.push(ch);
			
			//If scanned character is ')', pop and add it to the output
			//until ')' is encountered.
			else if(ch == ')') {
				while(!stack.empty() && stack.peek() != '(') {
					bPostfix.append(stack.pop());
				}
				if(stack.empty())
					return "Invalid Expression";
				else
					stack.pop();
			}
			
			//If scanned character is '^'
			//'^' has highest precedence and it is right associative
			else if (ch == '^') {
				stack.push(ch);
			}
			
			//If scanned character is operator except '^'
			else {
				while(!stack.empty() && operatorPrecedence(ch) 
						<= operatorPrecedence(stack.peek())){
					bPostfix.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		//pop all the remaining operators from the stack
		while(!stack.empty()) {
			if(stack.peek() == '('){
				return "Invalid Expression";
			}
			bPostfix.append(stack.pop());
		}

		return bPostfix.toString();
	}

	//Function to return precedence of a given operator
	//Higher returned value means higher precedence
	public static int operatorPrecedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		}
		return -1;
	}

}
