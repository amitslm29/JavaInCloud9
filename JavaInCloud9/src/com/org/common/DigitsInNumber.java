package com.org.common;

public class DigitsInNumber {
	
	public static void main(String[] args) {
		numberOfDigits(4523);
	}
	
	public static void numberOfDigits(int num) {
		int count = 0;
		while(num != 0) {
			count++;
			num = num/10;
		}
		System.out.println("Number of digits in the given number : " + count);
	}
}
