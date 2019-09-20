package com.org.string;

public class NumberOfSubString {

	public static void main(String[] args) {
		String str = "Amit";
		System.out.println(noOfSubstring(str));
	}
	
	public static int noOfSubstring(String str) {
		int n = str.length();
		return n*(n+1)/2;
	}
}
