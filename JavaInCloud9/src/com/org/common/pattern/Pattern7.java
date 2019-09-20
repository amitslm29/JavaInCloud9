package com.org.common.pattern;

/*
* 6 5 4 3 2 1
* 5 4 3 2 1
* 4 3 2 1
* 3 2 1
* 2 1
* 1
*/
public class Pattern7 {

	public static void main(String[] args) {
		int num=6;
		printPattern7(num);
	}
	
	public static void printPattern7(int num) {
		for(int i=num ; i>0 ;i--) {
			for(int j=i ; j>0 ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
