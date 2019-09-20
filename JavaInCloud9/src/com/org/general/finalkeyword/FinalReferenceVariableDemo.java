package com.org.general.finalkeyword;

public class FinalReferenceVariableDemo {
	
	public static void main(String[] args) {
		
		// A final reference variable
		final StringBuffer sb = new StringBuffer("Amit ");
		
		// Internal state of final reference variable
		// can be changed. So no issues with below code
		sb.append("Kumar");
		System.out.println(sb);
		
		// Cannot re-bound to reference another object,
		// so compile time error
		//sb = new StringBuffer("Amit Agrawal");
		
	}

}
