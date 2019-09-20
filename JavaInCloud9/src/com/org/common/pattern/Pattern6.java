package com.org.common.pattern;

/*
* 6
* 6 5
* 6 5 4
* 6 5 4 3
* 6 5 4 3 2
* 6 5 4 3 2 1
*/
public class Pattern6 {

	public static void main(String[] args) {
		int num = 6;
		printPattern6(num);
	}
	
	public static void printPattern6(int num) {
		for(int i=num ; i>0 ; i--) {
			for(int j=num ; j>=i ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
