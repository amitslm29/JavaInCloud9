package com.org.array;

import java.util.Arrays;

/*
 * Make 2 parts of the array as A[n-d] and B[d]
 * Reverse A and B : ArBr
 * Reverse whole ArBr
 */
public class ArrayRotationReverseAlgo {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 3; //Rotate by 3 position
		System.out.println("Before Rotation :" + Arrays.toString(arr));
		rotateLeft(arr, d);
		System.out.println("After Rotation To Left :" + Arrays.toString(arr));
		rotateRight(arr, d);
		System.out.println("After Rotation To Right :" + Arrays.toString(arr));
	}

	public static void rotateLeft(int arr[], int d) {
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}

	public static void rotateRight(int arr[], int d) {
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
	}

	public static void reverse(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++; end--;
		}
	}
}
