package com.org.array;

import java.util.HashMap;

/*
 * The majority element is the element that
 * appears more than n/2 times in the given array.
 */
public class MajorityElement {

	public static void main(String[] args) {

		int[] arr = {2,3,5,1,1,4};
		int result = findMajority(arr);
		if(result == -1)
			System.out.println("No Majority Element");
		else
			System.out.println("Majority element is - " + result);
	}
	
	public static int findMajority(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		
		for(int num : arr) {
			if(!map.containsKey(num))
				map.put(num, 1);
			else{
				count = map.get(num)+1;
				if(count > arr.length/2)
					return num;
				else
					map.put(num, count);
			}
				
		}
		return -1;
	}
}
