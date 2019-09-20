package com.org.array.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {5,2,3,1,4,7,6,8};
		System.out.println("Original Array : " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
	
	public static int[] selectionSort(int[] arr) {
		int size = arr.length;
		int minValue, minIndex, temp;
		for(int i=0 ; i<size ; i++) {
			minValue = arr[i];
			minIndex = i;
			
			for(int j = i+1 ; j<size ; j++) {
				if(arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			
			if(minValue < arr[i]) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}
}
