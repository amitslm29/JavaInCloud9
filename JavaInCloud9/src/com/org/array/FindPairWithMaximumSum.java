package com.org.array;

/*
 * Find a pair in an integer array whose sum is the maximum sum.
 * Approach-1 : Find the maximum and secondMaximum
 * Approach-2 : Use some sorting algorithm and break, once first
 * two maximum number will found.
 */
public class FindPairWithMaximumSum {

	public static void main(String[] args) {
		int[] arr = {1,4,5,3,6,10,7,9,8,5,11};
		findPair(arr);
	}
	
	public static void findPair(int[] arr){
		
		int size = arr.length;
		int maximum = 0;
		int secondMaximum = 0;
		
		for(int i=0 ; i<size ; i++){
			if(arr[i] > maximum){
				secondMaximum = maximum;
				maximum = arr[i];
			}
			else if(arr[i] > secondMaximum){
				secondMaximum = arr[i];
			}
		}
		System.out.println("Pairs with maximum sum : (" + 
				maximum + " , " + secondMaximum + ")");
	}
}
