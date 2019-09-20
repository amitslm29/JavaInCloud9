package com.org.string;

public class RemoveVowels {
	
	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		String modifiedStr = removeVowels(str);
		System.out.println("After Removing Vowels : " + modifiedStr);
	}
	
	public static String removeVowels(String str) {
		int length = str.length();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0 ; i<length ; i++) {
			if(checkVowel(str.charAt(i)))
				sb.append("");
			else
				sb.append(str.charAt(i));
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
