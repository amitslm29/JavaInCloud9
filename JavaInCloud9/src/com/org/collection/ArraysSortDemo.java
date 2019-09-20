package com.org.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
	
	public static void main(String[] args) {
		sortNaturalOrder();
		System.out.println("");
		sortCustomizedOrder();
	}
	
	public static void sortNaturalOrder() {
		String[] arr = {"Amit", "Rohit", "Ravi", "Haroon"};
		Arrays.sort(arr);
		for (String str : arr) {
			System.out.print(str + "-");
		}
	}
	
	public static void sortCustomizedOrder() {
		String[] arr = {"Amit", "Rohit", "Ravi", "Haroon"};
		Arrays.sort(arr, new ArrayComparator());
		for (String str : arr) {
			System.out.print(str + "-");
		}
	}
	
}

class ArrayComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
	
}


