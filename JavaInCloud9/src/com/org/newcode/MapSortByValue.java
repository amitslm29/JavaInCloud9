package com.org.newcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapSortByValue {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 6);
		map.put("B", 2);
		map.put("C", 4);
		map.put("D", 1);
		map.put("E", 7);
		map.put("F", 3);
		map.put("G", 5);
		mapSortValue(map);
	}
	
	public static void mapSortValue(HashMap<String, Integer> map) {
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Map.Entry<String, Integer> entry : list){
			System.out.println("(" + entry.getKey() + " , " + entry.getValue() + ")");
		}
	}

}
