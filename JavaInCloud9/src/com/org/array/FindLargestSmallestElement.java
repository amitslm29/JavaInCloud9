package com.org.array;

public class FindLargestSmallestElement {
	
	public static void main(String[] args) {
		
		int arrayOfInteger[] = {2,4,5,6,3,1,9,7,8,10};
		findLargestSmallest(arrayOfInteger);
		
	}

	/* FIND THE LARGEST AND SMALLEST NUMBER IN AN ARRAY */
	public static void findLargestSmallest(int arr[]) {
		
		int i, min, max, size;
		min = arr[0];
		max = arr[0];
		size = arr.length;
		for( i=1 ; i < size ; i++) {
			 if (arr[i] > max) {
				 max = arr[i];
			 }
			 if (arr[i] < min){
				 min = arr[i];
			 }
		}
		
		System.out.println("Largest Number Element in Array : " + max);
		System.out.println("Smallest Number Element in Array : " + min);
	}
		
}
