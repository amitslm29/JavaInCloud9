package com.org.array.sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {5,2,3,1,4,7,6,8};
		System.out.println("Original Array : " + Arrays.toString(arr));
		int start = 0;
		int end = arr.length - 1;
		quickSort(arr, start, end);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
	
	public static int[] quickSort(int[] arr, int start, int end) {
		int i = start;
		int j = end;
		int temp;
		int pivot = arr[(start+end)/2];
		while(i <= j) {
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(start < j)
			quickSort(arr, start, j);
		if(i < end)
			quickSort(arr, i, end);
		
		return arr;
	}
}
