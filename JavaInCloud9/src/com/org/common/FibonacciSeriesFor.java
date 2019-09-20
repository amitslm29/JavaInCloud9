package com.org.common;

/*
 * Fibonacci Series
 * 0 1 1 2 3 5 8 13 21 34
 */
public class FibonacciSeriesFor {
	
	public static void main(String[] args) {
		printFibonacciSeries(10);
	}
	
	public static void printFibonacciSeries(int count) {
		int num1=0, num2=1, num3;
		System.out.print(num1 + " " + num2);
		for(int i=3 ; i<=count ; i++) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}	
	}
}
