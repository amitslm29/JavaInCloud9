package com.org.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Amit", 100);
		map.put("Rohit", 200);
		map.put("Ravi", 300);
		map.put("Haroon", 400);
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + " ");
			map.put("Bhupati", 500); // ConcurrentModificationException
			map.remove("Amit"); // ConcurrentModificationException
			iter.remove(); // No Exception
		}
	}

}
