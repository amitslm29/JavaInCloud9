package com.org.array;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		int arr[] = {1,3,4,2,6,4,3,5,8,6,7,9,5,7};
		System.out.println("FIRST REPEATING ELEMENT IS : " + firstRepeatingElement(arr));
	}

	/* FInd the first repeating element in an integer array
	 * We can solve this using Hashing.
	 * Here idea is to traverse the array from right to left and put
	 * each elements into a hashset. When the repeat number will come,
	 * we can update that index. */
	public static int firstRepeatingElement(int arr[]) {
		int i, repeatingElement, size;
		repeatingElement = 0;
		size = arr.length;
		Set<Integer> setArray = new HashSet<>();

		for (i = size-1 ; i >= 0 ; i--) {
			if (setArray.contains(arr[i])) {
				repeatingElement = arr[i];
			}else{
				setArray.add(arr[i]);
			}
		}
		return repeatingElement;
	}
}
