package com.org.array;

public class FindSecondLargestSmallestElement {

	public static void main(String[] args) {

		int arrayOfInteger[] = {2,4,5,6,3,1,9,7,8,10};
		secondLargest(arrayOfInteger);
		secondSmallest(arrayOfInteger);
	}

	/* FIND THE SECOND LARGEST NUMBER IN AN ARRAY */
	public static void secondLargest(int arr[]) {
		int i, largest, secondLargest, size;
		largest = arr[0];
		secondLargest = arr[0];
		size = arr.length;

		for (i=1 ; i<size ; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest){
				secondLargest = arr[i];
			}
		}

		System.out.println("Second Largest Element in Array : " + secondLargest);
	}

	/* FIND THE SECOND SMALLEST NUMBER IN AN ARRAY */
	public static void secondSmallest(int arr[]) {
		int i, smallest, secondSmallest, size;
		smallest = arr[0];
		secondSmallest = arr[0];
		size = arr.length;

		for (i=1 ; i<size ; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}else if (arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}

		System.out.println("Second Smallest Element in Array : " + secondSmallest);
	}

}
