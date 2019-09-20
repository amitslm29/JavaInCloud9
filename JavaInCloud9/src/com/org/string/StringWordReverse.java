package com.org.string;

import java.util.StringTokenizer;

/*
 * Reverse the complete string
 * split the string based on space
 * Reverse each word
 */
public class StringWordReverse {
	
	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		String reverseWordString = wordReverseUsingSplit(str);
		//String reverseWordString = wordReverseUsingTokenizer(str);
		System.out.println("Word Reverse of given String : " + reverseWordString);
	}
	
	public static String wordReverseUsingSplit(String str) {
		
		if(str == null || str.isEmpty())
			return str;
		
		String SPACE = " ";
		StringBuffer sb = new StringBuffer();
		String reverseString = reverse(str);
		String[] strArray = reverseString.split(" ");
		for(String s : strArray) {
			sb.append(reverse(s) + SPACE);
		}
		return sb.toString().trim();
	}

	public static String wordReverseUsingTokenizer(String str) {
		
		if(str == null || str.isEmpty())
			return str;
		
		String SPACE = " ";
		StringBuffer sb = new StringBuffer();
		StringTokenizer tokenizer = new StringTokenizer(reverse(str), SPACE);
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			sb.append(reverse(token) + SPACE);
		}
		return sb.toString().trim();
	}
	
	// Method to reverse a string
	public static String reverse(String str) {
		int size = str.length();
		char[] charArray = new char[size];
		for(int i=0 ; i<size ; i++) {
			charArray[size-i-1] = str.charAt(i);
		}
		return String.copyValueOf(charArray);
	}
}
