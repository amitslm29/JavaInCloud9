package com.org.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeNumbersToFormLargestNumber {

	public static void main(String[] args) {
		int[] arr = {54, 546, 548, 60};
		String largestNo = printLargestNumber(arr);
		System.out.println("Largest Number : " + largestNo);
	}

	public static String printLargestNumber(int[] arr) {

		int size = arr.length;
		String[] strArr = new String[size];
		for(int i=0 ; i<size ; i++) {
			strArr[i] = String.valueOf(arr[i]);
		}
		
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				//return (Y+X).compareTo(X+Y);
				return (Y).compareTo(X);
			}
		});
		
		
		StringBuilder sb = new StringBuilder();
		for(String str : strArr) {
			sb.append(str);
		}
		return sb.toString();
	}

}

