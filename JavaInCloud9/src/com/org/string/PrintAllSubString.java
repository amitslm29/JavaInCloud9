package com.org.string;

public class PrintAllSubString {
	
	public static void main(String[] args) {
		String str = "Amit";
		print(str);
	}
	
	public static void print(String str) {
		int length = str.length();
		String sub;
		for(int i=0 ; i<length ; i++) {
			for(int j=1; j<=length-i ; j++) {
				sub = str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	}
}
