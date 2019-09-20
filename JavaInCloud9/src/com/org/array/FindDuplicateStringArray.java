package com.org.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateStringArray {
	
	public static void main(String[] args) {
		String[] arr = {"Amit", "Haroon", "Amit", "Rohit", "Adarsh", "Rohit"};
		System.out.print("Duplicate Strings are : ");
		findDuplicates(arr);
		System.out.println();
		System.out.print("Duplicate Strings are : ");
		findDuplicateUsingHashSet(arr);
	}
	
	public static void findDuplicates(String[] arr) {
		int size = arr.length;
		for(int i=0; i<size ; i++) {
			for(int j=i+1 ; j<size ; j++) {
				if(arr[i].equals(arr[j]) && i != j) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	
	public static void findDuplicateUsingHashSet(String[] arr) {
		Set<String> set = new HashSet<>();
		for(String str : arr) {
			if(!set.add(str)) {
				System.out.print(str + " ");
			}
		}
	}
}
