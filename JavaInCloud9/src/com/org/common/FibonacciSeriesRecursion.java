package com.org.common;

public class FibonacciSeriesRecursion {
	
	public static void main(String[] args) {
		
		int count = 10;
		for(int i=1 ; i<=count ; i++){
			System.out.print(printFibonacciSeries(i) + " ");
		}
	}
	
	public static int printFibonacciSeries(int number) {
		if(number == 1)
			return 0;
		if(number ==2)
			return 1;
		return printFibonacciSeries(number-1) + printFibonacciSeries(number-2);
	}

}
