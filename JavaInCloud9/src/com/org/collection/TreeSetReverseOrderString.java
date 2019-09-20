package com.org.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetReverseOrderString {
	
	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>(new MyComparatorString());
		treeset.add("Amit");
		treeset.add("Kumar");
		treeset.add("Agrawal");
		treeset.add("Sears");
		System.out.println(treeset);
	}

}

class MyComparatorString implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
	
}