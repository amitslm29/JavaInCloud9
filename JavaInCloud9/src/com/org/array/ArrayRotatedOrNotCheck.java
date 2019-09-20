package com.org.array;

/*
 * Check whether an array is sorted and rotated
 * {4,5,6,7,1,2,3} - YES
 * {79,85,22,37,55} - YES
 * {4,5,6,1,2,3,7} - NO
 * {4,5,6,7,1,2,3,4} - NO
 * {1,2,3,4,5,6,7} - NO
 * 
 */
public class ArrayRotatedOrNotCheck {
	
	public static void main(String[] args) {
		
		int[] arr = {6,7,1,2,3,4,5};
		System.out.println("Array is Rotated : " + checkRotatedOrNot(arr));
		
	}
	
	public static boolean checkRotatedOrNot(int[] arr) {
		
		int size = arr.length;
		int pivotIndex = 0;
		boolean flag = true;
		
		for(int i = 1 ; i<size ; i++){
			if(arr[i] < arr[i-1]){
				pivotIndex = i;
				break;
			}
		}
		
		for(int i=pivotIndex+1 ; i<size ; i++){
			if(arr[i] < arr[i-1]){
				flag = false;
				break;
			}
		}
		
		if(flag && arr[size-1] < arr[0]){
			return true;
		}
		return false;
	}
	
	
	public static boolean checkRotatedOrNotAnother(int[] arr) {
		
		int size = arr.length;
		
		// Find minimum value in the array
		int minValue = arr[0];
		int minIndex = 0;
		for(int i=1 ; i< size ; i++) {
			if(arr[i] < minValue) {
				minValue = arr[i];
				minIndex = i;
			}
		}
		
		// Check if all elements before minIndex are
		// in increasing order
		boolean flag1 = true;
		for(int i=1 ; i<minIndex ; i++) {
			if(arr[i] < arr[i-1]) {
				flag1 = false;
				break;
			}
		}
		
		// Check if all elements after minIndex are
		// in increasing order
		boolean flag2 = true;
		for(int i = minIndex+1 ; i<size ; i++) {
			 if(arr[i] < arr[i-1]) {
				 flag2 = false;
				 break;
			 }
		}
		
		// Check if last element of the array  
	    // is smaller than the first element
		if(flag1 && flag2 && arr[size-1] < arr[0]) {
			return true;
		}
		return false;
	}

}
