package com.org.array.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,2,3,1,4,7,6,8};
		System.out.println("Original Array : " + Arrays.toString(arr));
		bubbleSort(arr);
		//bubbleSortAnotherApproach(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
	
	/* In BubbleSort, after each iteration, the bigger element
	 * gets shifted to the right most index. So, after each iteration, 
	 * we can skip one one index from the end.
	 * Time Complexity : O(n^2)
	 * */
	public static int[] bubbleSort(int[] arr) {
		int size = arr.length;
		int temp;
		for(int i=0; i<size ; i++) {
			for(int j=1; j<size-i ; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	/*
	 * The above function always runs O(n^2) time even if the array is sorted. 
	 * It can be optimized by stopping the algorithm if inner loop didn’t cause 
	 * any swap.
	 */
	public static int[] bubbleSortAnotherApproach (int arr[]) {
		int size = arr.length;
		int temp;
		boolean swapped;
		for (int i=0 ; i<size ; i++) {
			swapped = false;
			for (int j=1 ; j<size-i ; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapped=true;
				}
			}
			
			/* If no two elements were swapped 
			 * by inner loop, then stop. */
			if (swapped == false) {
				break;
			}
		}
		return arr;
	}
}
