package com.org.array.searching;

public class BinarySearchRotated {
	
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,1,2,3};
		int start = 0;
		int end = arr.length-1;
		int key = 8;
		System.out.println(searchInRotatedArray(arr, start, end, key));
	}
	
	public static int searchInRotatedArray(int[] arr, int start, int end, int key) {
		 
		int pivot = findPivot(arr, start, end);
		
		if(arr[pivot] == key){
			return pivot;
		} else{
			if(arr[0] <= key)
				return binarySearch(arr, start, pivot-1, key);
			else
				return binarySearch(arr, pivot+1, end, key);
		}
	
	}
	
	public static int findPivot(int[] arr, int start, int end) {
		int mid = (start+end)/2;
		if(arr[mid] > arr[mid+1]) {
			return mid+1;
		} else {
			if(arr[start] > arr[mid])
				return findPivot(arr, start, mid-1);
			else
				return findPivot(arr, mid+1, end);
		}
	}

	public static int binarySearch(int[] arr, int start, int end, int key) {
		while(start <= end){
			int mid = (start+end)/2;
			if(key == arr[mid])
				return mid;
			if(key < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
