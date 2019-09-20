package com.org.common.pattern;

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 */
public class Pattern1 {
	
	public static void main(String[] args) {
		int num = 6;
		printPattern1(num);
	}
	
	public static void printPattern1(int num) {
		
		for(int i=1 ; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
