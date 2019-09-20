package com.org.stack;

import java.util.Stack;

public class EvaluateInfixExpression {

	public static void main(String[] args) {
		String expression = "10*2+(5-4)";
		int result = evaluate(expression);
		System.out.println("Value of Expression : " + result);
	}

	public static int evaluate(String expression) {

		int length = expression.length();

		//Stack for numbers
		Stack<Integer> stackNo = new Stack<>();

		//Stack for operators
		Stack<Character> stackOp = new Stack<>();

		for(int i=0 ; i<length ; i++) {
			char ch = expression.charAt(i);

			//If scanned character is whitespace, skip it
			if(ch == ' ')
				continue;

			else if(Character.isDigit(ch)) {
				StringBuffer sb = new StringBuffer();

				//if more than 1 digit in continuous
				while(i < length && Character.isDigit(expression.charAt(i)))
					sb.append(expression.charAt(i++));

				stackNo.push(Integer.parseInt(sb.toString()));
				i--;
			}
			
			else if(ch == '(')
				stackOp.push(ch);
			
			else if(ch == ')') {
				while(!stackOp.empty() && stackOp.peek() != '(')
					stackNo.push(calculation(stackOp.pop(), stackNo.pop(), stackNo.pop()));
				stackOp.pop();
			}
			
			else {
				while(!stackOp.empty() && operatorPrecedence(ch) 
						<= operatorPrecedence(stackOp.peek()))
					stackNo.push(calculation(stackOp.pop(), stackNo.pop(), stackNo.pop()));
				stackOp.push(ch);
			}

		}
		
		while (!stackOp.empty())
			stackNo.push(calculation(stackOp.pop(), stackNo.pop(), stackNo.pop()));
		
		return stackNo.peek();
	}

	//Method to get the result by applying an operator on
	//operand a and operand b
	public static int calculation(char operator, int b, int a) {
		switch(operator){
		case '+':
			return a+b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new
				UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}

	//Method to return precedence of a given operator
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