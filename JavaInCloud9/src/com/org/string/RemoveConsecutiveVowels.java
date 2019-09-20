package com.org.string;

public class RemoveConsecutiveVowels {
	
	public static void main(String[] args) {
		String str = "Aamiit Kuumaar AAgraawaal";
		String modifiedStr = removeConsecutiveVowels(str);
		System.out.println("After removing consecutive vowels : " + modifiedStr);
	}
	
	public static String removeConsecutiveVowels(String str) {
		int length = str.length();
		StringBuffer sb = new StringBuffer();
		sb.append(str.charAt(0));
		for(int i=1; i<length ; i++){
			if(!checkVowel(str.charAt(i-1)) || !checkVowel(str.charAt(i))){
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static boolean checkVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
}
