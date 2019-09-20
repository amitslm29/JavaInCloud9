package com.org.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Amit", 100);
		map.put("Ravi", 200);
		map.put("Rohit", 300);
		System.out.println(map.put("Haroon", 400)); // null
		System.out.println(map);
		System.out.println(map.put("Amit", 500)); // 100
		Set<String> set = map.keySet();
		System.out.println(set);
		Collection<Integer> collection = map.values();
		System.out.println(collection);
		Set<Entry<String, Integer>> eSet = map.entrySet();
		System.out.println(eSet);
		
		Iterator<Entry<String, Integer>> iterator = eSet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> mEntry= iterator.next();
			System.out.println(mEntry.getKey() + " " + mEntry.getValue());
			if(mEntry.getKey().equals("Haroon")) {
				mEntry.setValue(600);
			}
		}
		System.out.println(map);
	}

}
