package com.org.string;

/*
 * http://www.techiedelight.com/10-ways-reverse-a-string-java/#1
 */
public class StringReverse {

	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		
		String rev1 = reverseUsingCharArray(str);
		String rev2 = reverseUsingCharArray(str);
		String rev3 = reverseUsingStringBufferOrBuilder(str);
		
		System.out.println("Reverse String : " + rev3);
	}

	public static String reverseUsingCharArray(String str) {
		//Return if String is null or empty
		if(str == null || str.isEmpty())
			return str;
		int size = str.length();
		char[] charArray = new char[size];
		for(int i=0 ; i<size ; i++) {
			charArray[size-i-1] = str.charAt(i);
		}
		//Convert character array into String and return it
		return String.copyValueOf(charArray);
	}

	public static String reverseUsingCharArraySwap(String str) {
		if(str == null || str.isEmpty())
			return str;
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = charArray.length-1;
		char temp;
		while(start < end) {
			temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++; end--;
		}
		return String.copyValueOf(charArray);
	}	
	
	
	public static String reverseUsingStringBufferOrBuilder(String str) {
		if(str == null || str.isEmpty())
			return str;
		StringBuffer sb = new StringBuffer(str).reverse();
		return sb.toString();
	}
	
	
	public static String reverseUsingRecursion(String str) {
		return str;
	}
}
