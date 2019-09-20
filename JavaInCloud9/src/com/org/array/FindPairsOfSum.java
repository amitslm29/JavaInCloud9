package com.org.array;

import java.util.HashSet;
import java.util.Set;

public class FindPairsOfSum {

	public static void main(String[] args) {
		int[] arr = {1,4,5,3,6,10,7,9,8,5,11};
		int n = 16;
		findPairs(arr, n);
	}

	public static void findPairs(int[] arr, int sum) {
		int count = 0;

		Set<Integer> set = new HashSet<>();

		for(int num : arr){
			int temp = sum - num;
			if(set.contains(temp)){
				System.out.println("Pair with given sum " + sum +
						" is (" + temp + "," + num + ")");
				count++;
			}
			set.add(num);
		}
		System.out.println("Number of pairs for the given sum : " + count);
	}
}
