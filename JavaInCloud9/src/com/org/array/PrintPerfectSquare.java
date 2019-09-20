package com.org.array;

/*
 * Print all perfect squares between two given numbers
 */
public class PrintPerfectSquare {
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 50;
		
		System.out.println("All perfect squares between given two numbers : ");
		printPerfectSquare(n1, n2);
		printPerfectSquareAnotherApproach(n1, n2);
		
	}
	
	public static void printPerfectSquare(int n1, int n2){
		for(int i=n1 ; i<=n2 ; i++){
			if(isPerfectSquare(i)){
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isPerfectSquare(int num) {
		
		if(num == 0 || num == 1)
			return true;
		
		//Finding the square root of given number
		double sq = Math.sqrt(num);
		
		//Math.floor return the closest integer value
		return (sq - Math.floor(sq) == 0);
	}
	
	public static void printPerfectSquareAnotherApproach(int n1, int n2){
		int first = (int) Math.floor(Math.sqrt(n1)) + 1;
		int second = (int) Math.floor(Math.sqrt(n2));
		while(first <= second){
			System.out.print(first*first + " ");
			first++;
		}
	}

}
