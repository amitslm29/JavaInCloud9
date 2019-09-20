package com.org.string;

/*
 * Replace vowel with v and consonent with c
 */
public class ReplcaeWithVowelConsonent {
	
	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		String modifiedStr = vowelConsonent(str);
		System.out.println("Modified String : " + modifiedStr);
	}

	public static String vowelConsonent(String str) {
		
		int size = str.length();
		char[] charArray = new char[size];
		for(int i=0 ; i<size ; i++) {
			if(checkVowel(str.charAt(i))){
				charArray[i] = 'v';
			}else if(' ' == str.charAt(i)) {
				charArray[i] = ' ';
			}else{
				charArray[i] = 'c';
			}
		}
		return String.copyValueOf(charArray);
	}
	
	public static boolean checkVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
}
