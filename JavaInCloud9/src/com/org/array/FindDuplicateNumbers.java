package com.org.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		int[] arr = {4,2,5,4,2,3,1,3};
		System.out.print("Duplicate Numbers are : ");
		findDuplicates(arr);
		System.out.println();
		System.out.print("Duplicate Numbers are : ");
		findDuplicatesUsingHashset(arr);
		System.out.println();
		System.out.print("Duplicate Numbers are : ");
		findDuplicatesByMarking(arr);
	}
	
	public static void findDuplicates(int[] arr) {
		int size = arr.length;
		for(int i=0 ; i<size ; i++) {
			for(int j=i+1 ; j<size ; j++) {
				if(arr[i] == arr[j] && i!=j) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	
	
	/*
	 * Time Complexity: O(n)
	 * Auxiliary Space: O(n)
	 */
	public static void findDuplicatesUsingHashset(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(!set.add(num)) {
				System.out.print(num + " ");
			}
		}
	}

	/*
	 * Time Complexity: O(n)
	 * Auxiliary Space: O(1)
	 * Here limitation is, we are changing the value in the array and
	 * if value of any index is more than the length of array, this approach
	 * won't work.
	 */
	public static void findDuplicatesByMarking(int[] arr) {
		int size = arr.length;
		for (int i=0; i<size ; i++) {
			if(arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.print(Math.abs(arr[i]) + " ");
			}
		}
	}
}
