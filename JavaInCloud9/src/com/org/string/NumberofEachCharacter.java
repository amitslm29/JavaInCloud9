package com.org.string;

public class NumberofEachCharacter {
	
	public static void main(String[] args) {
		String str = "AABBBCCCCD";
		String modifiedString = modifiedString(str);
		System.out.println(modifiedString);
	}
	
	public static String modifiedString(String str) {
		
		int length = str.length();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0 ; i< length ; i++){
			int count = 1;
			char ch = str.charAt(i);
			while(i < length-1 && str.charAt(i) == str.charAt(i+1)){
				count++; i++;
			}
			sb.append(ch).append(count);
		}
		return sb.toString();
	}

}
