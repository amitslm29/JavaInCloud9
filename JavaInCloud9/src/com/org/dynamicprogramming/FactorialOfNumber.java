package com.org.dynamicprogramming;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		
		int result = factNumber(5);
		System.out.println("Factorial of given number : " + result);
	}
	
	public static int factNumber(int n) { 
		
		if(n == 0)
			return 1;
		
		int[] fact = new int[n+1];
		
		fact[0] = 1;
		
		for(int i=1 ; i<=n ; i++){
			fact[i] = i * fact[i-1];
		}
		
		return fact[n];
	}

}
