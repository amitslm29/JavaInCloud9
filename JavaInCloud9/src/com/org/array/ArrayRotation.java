package com.org.array;

/* 
 * Write a program to rotate arr[] of size n by d elements.
 * To rotate by one, store arr[0] in a temporary variable temp, 
 * Move arr[1] to arr[0], arr[2] to arr[1]... and finally temp to arr[n-1].
 */
public class ArrayRotation {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("ARRAY BEFORE ROTATION : ");
		printArray(arr);
		
		rotateLeft(arr, 3);
		System.out.print("\nARRAY AFTER ROTATION TO LEFT : ");
		printArray(arr);
		
		rotateRight(arr, 3);
		System.out.print("\nARRAY AFTER ROTATION TO RIGHT : ");
		printArray(arr);
	}
	
	/* Rotate array by one position to Left */
	public static void rotateLeftByOne (int arr[]) {
		int i, temp, size;
		temp = arr[0];
		size = arr.length;
		for (i=0; i<size-1 ; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	/* Rotate array by one position to Right */
	public static void rotateRightByOne(int arr[]) {
		int i, temp, size;
		size = arr.length;
		temp = arr[size-1];
		
		for(i=size-1 ; i>0 ; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	/* Rotate array by d position*/
	public static void rotateLeft (int arr[], int d) {
		for(int i=0 ; i<d ; i++) {
			rotateLeftByOne(arr);
		}
	}
	
	/* Rotate array by d position*/
	public static void rotateRight (int arr[], int d) {
		for(int i=0 ; i<d ; i++) {
			rotateRightByOne(arr);
		}
	}
	
	/* Print elements of Array*/
	public static void printArray (int arr[]) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
