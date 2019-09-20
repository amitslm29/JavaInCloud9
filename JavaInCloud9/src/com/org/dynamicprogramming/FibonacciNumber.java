package com.org.dynamicprogramming;

public class FibonacciNumber {
	
	public static void main(String[] args) {
		
		int result = fiboNumber(3);
		System.out.println("Result : " + result);
	}
	
	public static int fiboNumber(int n){
		if(n <= 1)
			return n;
		
		int[] fibo = new int[n+1];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2 ; i<=n ; i++){
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		return fibo[n];
	}

}
