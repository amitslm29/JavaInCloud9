package com.org.array;

public class RemoveDuplicateSortedArray {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int size = arr.length;
		size  = removeDuplicatesSortedArray(arr);
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int removeDuplicatesSortedArray(int[] arr) {
		int size = arr.length;
		int j = 0;
		
		if(size==0 || size==1) {
			return size;
		}
		
		for(int i=0 ; i<size-1 ; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j++] = arr[size-1];
		return j;
	}
}
