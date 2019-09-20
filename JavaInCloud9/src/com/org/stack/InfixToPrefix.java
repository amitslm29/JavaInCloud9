package com.org.stack;

public class InfixToPrefix {
	
	public static void main(String[] args) {
		String infix = "x-(y*a/b-(z+d*e)+c)/f";
		//String infix = "a^b^c^d^e^f";
		String prefix = convertToPrefix(infix);
		System.out.println("Infix : " + infix);
		System.out.println("Prefix : " + prefix);

	}

	//Reverse the infix expression
	//Make every '(' as ')' and ')' as '('
	//Convert expression into postfix form
	//Reverse the expression
	public static String convertToPrefix(String infix) {
		String reverseInfix = reverse(infix);
		String temp = InfixToPostfix.convertToPostfix(reverseInfix);
		String prefix = new StringBuffer(temp).reverse().toString();
		return prefix;
	}
	
	public static String reverse(String str) {
		
		str = new StringBuffer(str).reverse().toString();
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for(int i=0 ; i<length ; i++) {
			if(charArray[i] == '(')
				charArray[i] = ')';
			else if(charArray[i] == ')')
				charArray[i] = '(';
		}
		return String.copyValueOf(charArray);
	}	
	
	
}
