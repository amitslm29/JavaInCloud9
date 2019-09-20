package com.org.common;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		isPalindrome(121);
	}

	public static void isPalindrome(int number) {
		 
		int temp = number;
		int reminder, reverse=0;
		while(temp != 0){
			reminder = temp%10;
			reverse = reverse*10 + reminder;
			temp = temp/10;
		}
		
		if(number == reverse) {
			System.out.println(number + " is a palindrome number.");
		} else {
			System.out.println(number + " is not a palindrome number.");
		}
	}
}
