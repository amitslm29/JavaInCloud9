package com.org.common;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int start = 0;
		int end = arr.length - 1;
		System.out.println("Original Array : " + Arrays.toString(arr));
		reverse(arr, start, end);
		reverseUsingRecursion(arr, start, end);
		System.out.println("Reversed Array : " + Arrays.toString(arr));
	}
	
	public static int[] reverse(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++; end--;
		}
		return arr;
	}
	
	public static void reverseUsingRecursion(int[] arr, int start, int end) {
		int temp;
		if(start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseUsingRecursion(arr, start+1, end-1);
	}
}