package com.org.newcode;

import java.math.BigInteger;

public class FactorialOfLargeNumber {
	
	public static void main(String[] args) {
		
		String result = factLargeNumber(30);
		System.out.println("Factorial of given input is : " + result);
	}
	
	public static String factLargeNumber(int n) {
		BigInteger fact = new BigInteger("1");
		for(int i=1 ; i<=n ; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact.toString();
	}

}
