package com.org.collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Requirement - 
 * 1. Sort based on increasing length
 * 2. If two objects are of equal length, sort them alphabetically
 */
public class TreeSetIncreasingLengthOrder {
	
	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>(new MyComparatorIncreasingLength());
		treeset.add("A");
		treeset.add("XX");
		treeset.add("BBBB");
		treeset.add("AA");
		treeset.add("B");
		treeset.add("AAA");
		System.out.println(treeset);
	}

}

class MyComparatorIncreasingLength implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int size1 = s1.length();
		int size2 = s2.length();
		if (size1 < size2)
			return -1;
		else if (size1 > size2)
			return 1;
		else
			return s1.compareTo(s2);
	}
	
}
