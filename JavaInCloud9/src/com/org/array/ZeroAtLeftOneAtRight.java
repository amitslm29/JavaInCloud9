package com.org.array;

import java.util.Arrays;

/*
 * An integer array is a combination of both 0 and 1.
 * Move all 0s to left and all 1s to right.
 */
public class ZeroAtLeftOneAtRight {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,0,0,1,1,0,1,1,0,0,1,0,1,0};
		int[] modifiedArray = zeroOneLeftRight(arr);
		System.out.println(Arrays.toString(modifiedArray));
	}
	
	public static int[] zeroOneLeftRight(int[] arr){
		
		int start = 0;
		int end = arr.length - 1;
		int temp;
		
		while(start < end){
			while(arr[start] == 0)
				start++;
			while(arr[end] == 1)
				end--;
			if(start < end){
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		
		return arr;
	}

	
}
