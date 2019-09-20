package com.org.array;

/*
 * Given a sorted array and a number x, find the pair in 
 * array whose sum is closest to x.
 * https://www.geeksforgeeks.org/given-sorted-array-number-x-find-pair-array-whose-sum-closest-x/
 */
public class FindPairsClosestToNumber {
	
	public static void main(String[] args) {
		int[] arr = {10, 22, 28, 29, 30, 40};
		int num = 54;
		findPairsCloset(arr, num);
	}
	
	public static void findPairsCloset(int[] arr, int number){
		
		int start = 0;
		int end = arr.length - 1;
		
		int result1 = 0;
		int result2 = 0;
		int diff = Integer.MAX_VALUE;
		
		while(start < end){
			if(Math.abs(arr[start] + arr[end] - number) < diff){
				result1 = arr[start];
				result2 = arr[end];
				diff = Math.abs(result1 + result2 - number);
			}
			
			if(arr[start] + arr[end] < number)
				start++;
			else
				end--;
		}
		System.out.println("The closest pair is " + result1
				+ " and " + result2);
	}

}
