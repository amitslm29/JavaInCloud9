package com.org.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet treeset = new TreeSet();
		treeset.add("A");
		treeset.add("B");
		treeset.add("C");
		treeset.add(1); // ClassCastException
		treeset.add(null); // Throws NullPointerException
        System.out.println(treeset); 
	}
	
	/*public static void main(String[] args) {
		TreeSet<StringBuffer> treeset = new TreeSet<>();
		treeset.add(new StringBuffer("C")); //ClassCastException
		treeset.add(new StringBuffer("B"));
		treeset.add(new StringBuffer("A"));
		treeset.add(new StringBuffer("D"));
		System.out.println(treeset);
	}*/
	
	/*public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("B");
		treeset.add("Z"); // "Z".compareTo("B"); +ve
		treeset.add("A"); // "A".compareTo("B"); -ve
        System.out.println(treeset); // [A,B,Z]
	}*/
}
