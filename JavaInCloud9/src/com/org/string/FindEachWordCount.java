package com.org.string;

import java.util.HashMap;
import java.util.Map;

public class FindEachWordCount {
	
	public static void main(String[] args) {
		String str = "Amit Haroon Rohit Bhupati Adarsh Amit Adarsh Rohit Amit "
				+ "Bhupati Haroon Haroon Amit Bhupati Adarsh Rohit Ramesh";
		wordCount(str);
	}
	
	public static void wordCount(String str) {
		
		String SPACE = " ";
		String[] strArray = str.split(SPACE);
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : strArray) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else{
				map.put(s, 1);
			}
		}
		
		for(String s : map.keySet()){
			System.out.println(s + " " + map.get(s));
		}
	}

}
