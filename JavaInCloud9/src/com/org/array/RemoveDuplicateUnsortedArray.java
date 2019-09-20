package com.org.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUnsortedArray {
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,4,3,6,9,3,6,8,3,5,8,7,7,8};
		removeDuplicatesUnsortedArray(arr);
	}

	public static void removeDuplicatesUnsortedArray(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr){
			if(set.add(num)){
				System.out.print(num + " ");
			}
		}
	}
}
