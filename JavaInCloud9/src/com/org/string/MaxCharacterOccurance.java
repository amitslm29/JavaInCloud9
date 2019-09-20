package com.org.string;

import java.util.HashMap;
import java.util.Map;

public class MaxCharacterOccurance {
	
	public static void main(String[] args) {
		String str = "Amit Kumar Agrawal";
		maxCharOccurance(str);
	}
	
	public static void maxCharOccurance(String str) {
		
		int mapValue, maxValue=0;
		char maxKey = 0;
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character ch : charArray) {
			if(map.containsKey(ch)) {
				mapValue = map.get(ch) + 1;
			} else {
				mapValue = 1;
			}
			map.put(ch, mapValue);
			
			if(maxValue < mapValue){
				maxValue = mapValue;
				maxKey = ch;
			}
		}
		
		/*for(Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
			if(maxValue == mapEntry.getValue()) {
				maxKey = mapEntry.getKey();
				break;
			}
		}*/
		
		System.out.println(maxKey + " has maximum number of occurances of " + maxValue);
	}

}
