package com.org.common.pattern;

/*
* 1 
* 2 3 
* 4 5 6 
* 7 8 9 10 
* 11 12 13 14 15 
*/
public class Pattern10 {
	
	public static void main(String[] args) {
		int num = 6;
		printPattern10(num);
	}
	
	public static void printPattern10(int num) {
		int num1 = 1;
		for(int i=1 ; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(num1 + " ");
				num1++;
			}
			System.out.println();
		}
	}
}
