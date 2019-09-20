package com.org.common.pattern;

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
*/
public class Pattern9 {
	
	public static void main(String[] args) {
		int num = 6;
		printPattern9(num);
	}
	
	public static void printPattern9(int num) {
		for(int i=1; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j + " ");
			}
			for(int j=i-1 ; j>0 ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
