package com.org.common;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(factorialUsingRecursion(num) + "-" + factorialUsingWhile(num));
	}

	public static int factorialUsingRecursion(int number){
		if(number == 0){
			return 1;
		}
		return number*factorialUsingRecursion(number-1);
	}

	public static int factorialUsingWhile(int number){
		int result = 1;
		if(number == 0){
			return 1;
		}
		while(number != 0){
			result = result*number;
			number--;
		}
		return result;
	}

}
