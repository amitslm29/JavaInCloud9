package com.org.collection;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		hashset.add(null);
		System.out.println(hashset.add("D")); //false
		System.out.println(hashset.add(null)); //false
		System.out.println(hashset.add("E")); //true
		System.out.println(hashset); // It will print the elements in random order
	}

}
