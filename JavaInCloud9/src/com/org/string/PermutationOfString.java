package com.org.string;

public class PermutationOfString {

	public static void main(String[] args) { 
		String str = "ABC"; 
		int start = 0, end = str.length() -1; 
		findPermutation(str, start, end); 
	} 

	private static void findPermutation(String str, int start, int end) { 
		if (start == end) 
			System.out.println(str); 
		else { 
			for (int i = start; i <= end; i++) { 
				str = swap(str, start, i); 
				findPermutation(str, start+1, end); 
				str = swap(str, start, i); 
			} 
		} 
	} 

	public static String swap(String str, int i, int j) { 
		char temp; 
		char[] charArray = str.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 
}
