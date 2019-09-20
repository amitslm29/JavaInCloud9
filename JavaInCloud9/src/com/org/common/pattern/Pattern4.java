package com.org.common.pattern;

/*
* 1 2 3 4 5 6
* 1 2 3 4 5
* 1 2 3 4
* 1 2 3
* 1 2
* 1
*/
public class Pattern4 {
	
	public static void main(String[] args) {
		int num = 6;
		printPattern4(num);
	}
	
	public static void printPattern4(int num) {
		for(int i=num ; i>0 ; i--) {
			for(int j = 1; j<=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
