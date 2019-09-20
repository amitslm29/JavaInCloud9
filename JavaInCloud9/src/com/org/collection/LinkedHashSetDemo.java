package com.org.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add("A");
		linkedhashset.add("B");
		linkedhashset.add("C");
		linkedhashset.add("D");
		linkedhashset.add(null);
		System.out.println(linkedhashset.add("D")); //false
		System.out.println(linkedhashset.add(null)); //false
		System.out.println(linkedhashset.add("E")); //true
		System.out.println(linkedhashset); // It will print the elements based on insertion order
	}
	
}
