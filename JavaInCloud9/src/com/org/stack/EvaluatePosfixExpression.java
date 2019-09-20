package com.org.stack;

import java.util.Stack;

/*
 * If the scan character is a number, push it to the stack
 * If it is a operator
 * - pop 2 numbers from the stack : a,b
 * - Calculate b <operator> a
 * - Push the result to the stack
 */
public class EvaluatePosfixExpression {

	public static void main(String[] args) {
		//String expression = "3574-2^*+";
		String expression = "23*54*+9-";
		int result = evaluate(expression);
		System.out.println("Value of Expression : " + result);
	}

	public static int evaluate(String expression){
		int size = expression.length();
		Stack<Integer> stack = new Stack<>();

		for(int i=0 ; i<size ; i++){
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
			return b+a;
		case '-':
			return b-a;
		case '*':
			return b*a;
		case '/':
			if (a == 0)
				throw new
				UnsupportedOperationException("Cannot divide by zero");
			return b/a;
		}
		return 0;
	}

}
