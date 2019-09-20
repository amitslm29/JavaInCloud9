package com.org.string;

public class SwapFirstLastCharacter {
	
	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		String result = swapCharacter(str);
		System.out.println("String after swapping characters : " + result);
	}
	
	public static String swapCharacter(String str) {
		char[] charArray = str.toCharArray();
		int size = charArray.length;
		for(int i=0 ; i<size ; i++) {
			
			//k stores the index of first character and
			//i-1 is going to store the index of last character
			//We assume there is only one space between two words
			int k=i;
			while(i < size && charArray[i] != ' ')
				i++;
			
			//swap the first and last character of the word
			char temp = charArray[k];
			charArray[k] = charArray[i-1];
			charArray[i-1] = temp;	
		}
		return String.copyValueOf(charArray);
	}
}
