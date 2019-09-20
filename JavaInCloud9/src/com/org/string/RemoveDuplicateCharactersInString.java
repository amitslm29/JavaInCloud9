package com.org.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
	
	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		String modifiedStr = removeDuplicates(str);
		System.out.println("String After Removing Duplicates : " + modifiedStr);
	}
	
	public static String removeDuplicates(String str) {
		char[] charArray = str.toCharArray();
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		
		for(char ch : charArray) {
			if(set.add(ch)){
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
