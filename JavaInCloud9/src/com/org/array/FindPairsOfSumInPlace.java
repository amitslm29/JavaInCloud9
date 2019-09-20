package com.org.array;

import java.util.Arrays;

public class FindPairsOfSumInPlace {
	
	public static void main(String[] args) {
		int[] arr = {1,4,3,6,10,7,9,8,5,11};
		int n = 16;
		findPairs(arr, n);
	}
	
	public static void findPairs(int[] arr, int sum) {
		
		//Sort the array in ascending order
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length - 1;
		int count = 0;
		
		while(start < end){
			if(arr[start] + arr[end] == sum){
				System.out.println("Pair with given sum " + sum +
						" is (" + arr[start] + "," + arr[end] + ")");
				count++;
			}
			
			//Increment lower index if total is less than the desired sum
			//Decrement higher index if total is more than the desired sum
			if(arr[start] + arr[end] < sum)
				start++;
			else
				end--;
		}
		System.out.println("Number of pairs for the given sum : " + count);
	}

}
