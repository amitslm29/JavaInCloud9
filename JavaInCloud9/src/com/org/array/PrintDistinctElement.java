package com.org.array;

import java.util.HashSet;
import java.util.Set;

public class PrintDistinctElement {
	
	public static void main(String[] args) {
		int arr[] = {1,3,4,2,6,4,3,5,8,6,7,9,5,7};
		System.out.print("DISTINCT ELEMENTS OF ARRAY : ");
		printDistinctElement(arr);
	}

	/* Print all distinct elements of a given integer array
	 * We can solve this using HashSet */
	public static void printDistinctElement(int arr[]) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr){
			if(set.add(num)){
				System.out.print(num + " ");
			}
		}
	}
	
}
