package com.org.common.pattern;

/*
* 6 5 4 3 2 1
* 6 5 4 3 2
* 6 5 4 3
* 6 5 4
* 6 5
* 6
*/
public class Pattern5 {
	
	public static void main(String[] args) {
		int num = 6;
		printPattern5(num);
	}
	
	public static void printPattern5(int num) {
		for(int i=1 ; i<=num ; i++) {
			for(int j=num ; j>=i ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
