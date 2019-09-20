package com.org.general;

public class OperatorOverloadingDemo {

	public static void main(String[] args) {
		
		/* In the below code snippet, + operator is performing two
		 * different operation. In the first statement, it is adding
		 * two integers and in the second statement, it is appending
		 *  two Strings. So here + is a overloaded operator. */
		System.out.println(10+30); // 40
		System.out.println("Amit" + "Agrawal"); // AmitAgrawal
		System.out.println(10 + "Amit" + "Agrawal" + 20 + 30); // 10AmitAgrawal2030
	}
}
