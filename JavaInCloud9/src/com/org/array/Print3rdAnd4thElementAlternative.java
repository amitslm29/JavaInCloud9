package com.org.array;

/*
Write a program to prints alternatively the 3rd and 4th character in the array.
Example:
With an input of
A[] = {'a','b','c','d','e','f','g','h','i','j','k','1','2','3','4','5','6','7',
'8','a','b','c','d','e','f','g','h','i','j','k', '1','2','3','4','5','6','7'};
Output: cgj36bel15
Here the third character in the array is 'c'. The fourth character after c is g. 
The third character after g is j and so on.
 */
public class Print3rdAnd4thElementAlternative {
	
	public static void main(String[] args) {
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','1','2','3','4','5','6','7','8','a','b','c','d','e','f','g','h','i','j','k', '1','2','3','4','5','6','7'};
		String result = printAlternative(arr, arr.length);
		System.out.println("Output is - " + result);
	}
	
	public static String printAlternative(char[] arr, int length){
		boolean isThirdElement = true;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0 ; i<length ; i++) {
			if(isThirdElement && i+2 < length){
				i = i+2;
				sb.append(arr[i]);
				isThirdElement = false;
			}
			else if(!isThirdElement && i+3 < length){
				i = i+3;
				sb.append(arr[i]);
				isThirdElement = true;
			}
		}
		return sb.toString();
	}
}
