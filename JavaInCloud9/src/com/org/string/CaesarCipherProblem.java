package com.org.string;

/*
 * Caesar Cipher encryption is done by replacing each
 * character with the character at give position to 
 * the left. In this program, we will print the plain 
 * text from the given encrypted text.
 */
public class CaesarCipherProblem {

	public static void main(String[] args) {
		
		String str = "ATTACKATONCE";
		int shift = 4;
		String result = decrypt(str, shift);
		System.out.println("Output - " + result);
	}
	
	public static String decrypt(String str, int shift) {
		
		int size = str.length();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0 ; i<size ; i++){
			char ch = str.charAt(i);
			char output = ' ';
			if(Character.isUpperCase(ch)){
				output = (char)(((int) ch + shift - 65) % 26 + 65); 
			}
			else if(Character.isLowerCase(ch)){
				output = (char)(((int) ch + shift - 97) % 26 + 97);
			}
			sb.append(output);
		}
		return sb.toString();
	}
}
