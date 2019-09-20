package com.org.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("Amit", 100);
		map.put("Rohit", 200);
		map.put("Ravi", 300);
		map.put("Haroon", 400);
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + " ");
			map.put("Bhupati", 500); // No Exception
			map.remove("Amit"); // No Exception
			iter.remove(); // No Exception
		}
	}

}
