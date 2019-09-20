package com.org.common;

public class ReverseNumber {
	
	public static void main(String[] args) {
		reverseNumber(123);
	}
	
	public static void reverseNumber(int number) {
		
		int temp = number;
		int reminder, reverse=0;
		
		while(temp != 0) {
			reminder = temp%10;
			reverse = reverse * 10 + reminder;
			temp = temp/10;
		}
		
		System.out.println("Reverse of " + number + " is : " + reverse);
	}

}
 