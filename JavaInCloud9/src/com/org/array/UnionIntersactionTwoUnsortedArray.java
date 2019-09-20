package com.org.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionIntersactionTwoUnsortedArray {

	public static void main(String[] args) {

		int[] arr1 = {5,3,1,2,4,7,6,10};
		int[] arr2 = {9,5,4,8,7,6};
		System.out.print("UNION OF FIRST ARRAY AND SECOND ARRAY : ");
		union(arr1, arr2);
		System.out.println("");
		System.out.print("INTERSACTION OF FIRST ARRAY AND SECOND ARRAY : ");
		intersection(arr1, arr2);
	}

	/* Union of two unsorted arrays*/
	public static void union(int[] arr1, int[] arr2) {
		
		Set<Integer> set = new HashSet<>();

		for(int num : arr1)
			set.add(num);
		for(int num : arr2)
			set.add(num);

		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
	}
	
	/* Intersection of two unsorted arrays*/
	public static void intersection(int[] arr1, int[] arr2) {
		
		Set<Integer> set = new HashSet<>();

		for(int num : arr1)
			set.add(num);
		
		for(int num : arr2){
			if(set.contains(num))
				System.out.print(num + " ");
		}
	}
}
