package com.org.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapIdentityDemo {
	
	public static void main(String[] args) {
		normalHashMapMethod(); 
		identityHashMapMethod(); 
	}
	
	public static void normalHashMapMethod() {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(i1, "Amit");
		hashmap.put(i2, "Rohit");
		System.out.println(hashmap); // Output - {10=Rohit}
	}
	
	public static void identityHashMapMethod() {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		IdentityHashMap<Integer, String> identityhashmap = new IdentityHashMap<>();
		identityhashmap.put(i1, "Amit");
		identityhashmap.put(i2, "Rohit");
		System.out.println(identityhashmap); // Output - {10=Rohit, 10=Amit}
	}

}
