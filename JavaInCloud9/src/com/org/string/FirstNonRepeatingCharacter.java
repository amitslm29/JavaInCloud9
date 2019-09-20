package com.org.string;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Reference -
 * https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html
 */
public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		firstNonRepeatingCharacter(str);
	}
	
	public static void firstNonRepeatingCharacter(String str) {
		
		//Here we have used LinkedHashMap, as it maintains insertion order
		//and it will be little fast to find the first non repeating element
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] charArr = str.toCharArray();
		
		for(char c : charArr) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				System.out.println("First Non Repeating Character is " + entry.getKey()); 
				break;
			}
		}
	}
}
