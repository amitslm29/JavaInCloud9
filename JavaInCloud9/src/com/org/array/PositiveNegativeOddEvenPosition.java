package com.org.array;

import java.util.Arrays;

public class PositiveNegativeOddEvenPosition {
	
	public static void main(String[] args) {
		int arr[] = {-2, 5, 4, -1, -9, 3, 7, -6};
		rearrange(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rearrange(int[] arr) {
		int positive=0, negative=1, temp;
		int size = arr.length;
		
		while(positive < size && negative < size) {
			while(positive < size && arr[positive] >= 0) {
				positive += 2;
			}
			while(negative < size && arr[negative] < 0) {
				negative += 2;
			}
			if(positive < size && negative < size) {
				temp = arr[positive];
				arr[positive] = arr[negative];
				arr[negative] = temp;
			} else {
				break;
			}
		}
	}
}
