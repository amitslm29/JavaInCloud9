package com.org.common.pattern;

/*
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 6 6 6 6 6 6
 */
public class Pattern2 {

	public static void main(String[] args) {
		int num = 6;
		printPattern2(num);
	}
	
	public static void printPattern2(int num) {
		
		for(int i=1 ; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
