package com.org.common.pattern;

/*
* 1
* 1 2
* 1 2 3
* 1 2 3 4
* 1 2 3 4 5
* 1 2 3 4 5 6
* 1 2 3 4 5
* 1 2 3 4
* 1 2 3
* 1 2
* 1  
*/
public class Pattern3 {
	
	public static void main(String[] args) {
		int num = 6;
		printPattern3(num);
	}
	
	public static void printPattern3(int num) {
		for(int i=1 ; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i=num-1 ; i>0 ; i--) {
			for(int j=1 ;j <=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
