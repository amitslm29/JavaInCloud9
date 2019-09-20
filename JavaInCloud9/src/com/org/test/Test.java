package com.org.test;

import java.util.LinkedHashMap;

public class Test {
	
	public static void main(String[] args) {
		
		//LinkedHashMap for Least Recently Accessed (LRU Cache)
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(16, 0.75F, true);
		
		//LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		map.put('F', 6);
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('D', 4);
		map.put('E', 5);
		
		System.out.println(map.get('C'));
		System.out.println(map.get('D'));
		
		System.out.println(map);
		
	}

}



