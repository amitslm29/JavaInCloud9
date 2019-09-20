package com.org.array.searching;

/*
 * Binary Search works only with the sorted array.
 * Time complexity : O(logn)
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int searchKey = 5;
		int index = binarySearch(arr, searchKey);
		if(index == -1)
			System.out.println("No such key in the given array !!!");
		else
			System.out.println("Key "+searchKey+" found at index: " + index);
	}
	
	public static int binarySearch(int[] arr, int searchKey) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end){
			int mid = (start+end)/2;
			if(searchKey == arr[mid])
				return mid;
			if(searchKey < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
