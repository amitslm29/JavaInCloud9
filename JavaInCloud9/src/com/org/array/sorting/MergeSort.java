package com.org.array.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int []{5,4,7,3,9,6,10,1,2,8};
		int left = 0;
		int right = arr.length - 1;
		System.out.println("ARRAY BEFORE SORTING : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		mergeSort(arr, left, right);
		System.out.println("\nARRAY AFTER SORTING : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}

	/*
	 * Merge two sub-arrays of arr[]
	 * First sub-array is arr[left....middle]
	 * Second sub-array is arr[middle+1....right]
	 */
	public static void merge (int arr[], int left, int middle, int right) {

		/* Find the size of two temporary arrays */
		int leftArraySize = middle - left +1;
		int rightArraySize = right - middle;

		/* Create two temporary arrays */
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];

		/* Copy data to two temporary arrays */
		for (int i=0 ; i<leftArraySize ; i++) {
			leftArray[i] = arr[left + i];
		}
		for (int i=0 ; i<rightArraySize ; i++) {
			rightArray[i] = arr[middle+1+i];
		}

		/* === Merge two temporary arrays === */

		/* Initial index of left, right and merged array */
		int i = 0; int j = 0; int k = left;

		while (i < leftArraySize && j < rightArraySize) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy the remaining elements of left array and right array if any */
		while (i < leftArraySize) {
			arr[k] = leftArray[i];
			i++; k++;
		}
		while (j < rightArraySize) {
			arr[k] = rightArray[j];
			j++; k++;
		}
	}

	/* Method that sorts arr[left....right] using merge() */
	public static void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			int middle = (left + right)/2;

			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);

			/* Merge the sorted halves */
			merge(arr, left, middle, right);
		}
	}
}
