package com.org.stack;

import java.util.Stack;

/*
 * Scan each character in the string from the end
 * If the scan character is a number, push it to the stack
 * If it is a operator
 * - pop 2 numbers from the stack : a,b
 * - Calculate a <operator> b
 * - Push the result to the stack
 */
public class EvaluatePrefixExpression {

	public static void main(String[] args) {
		String expression = "-+*23*549";
		int result = evaluate(expression);
		System.out.println("Value of Expression : " + result);
	}

	public static int evaluate(String expression){
		int size = expression.length();
		Stack<Integer> stack = new Stack<>();

		for(int i=size-1; i>=0 ; i--){
			char ch = expression.charAt(i);
			if(Character.isDigit(ch))
				stack.push(Character.getNumericValue(ch));
			else
				stack.push(calculation(stack.pop(), ch, stack.pop()));
		}
		return stack.pop();
	}

	//Method to get the result by applying an operator on
	//operand a and operand b
	public static int calculation(int a, char operator, int b) {
		switch(operator){
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if (b == 0)
				throw new
				UnsupportedOperationException("Cannot divide by zero");
			return a/b;
		}
		return 0;
	}
}
