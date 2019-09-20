package com.org.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * An anagram of a string is another string that contains same characters, 
 * only the order of characters can be different. For example, “abcd” and 
 * “dabc” are anagram of each other.
 * 
 */
public class IsTwoStringsAnagram {

	public static void main(String[] args) {
		
		String str1 = "abcde";
		String str2 = "dbeca";
		boolean result = checkAnagramUsingMap(str1, str2);
		System.out.println("Both strings are Anagram : " + result);

	}

	/*
	 * Sort both the strings
	 * Compare the sorted string
	 * Time Complexity: nlogn + nlogn + n/2 = nlogn
	 */
	public static boolean checkAnagramUsingSort(String str1, String str2){

		int n1 = str1.length();
		int n2 = str2.length();

		if(n1 != n2)
			return false;

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

	/*
	 * Time complexity: o(n)
	 * Space complexity: o(n)
	 */
	public static boolean checkAnagramUsingMap(String str1, String str2){

		if(str1.length() != str2.length())
			return false;

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		Map<Character, Integer> map = new HashMap<>();
		for(char ch : str2.toCharArray()){
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch) + 1);
		}

		for(char ch : str1.toCharArray()){
			if(!map.containsKey(ch))
				return false;

			int value = map.get(ch);
			if(value == 0)
				return false;
			else
				map.put(ch, value-1);
		}
		return true;
	}
}
