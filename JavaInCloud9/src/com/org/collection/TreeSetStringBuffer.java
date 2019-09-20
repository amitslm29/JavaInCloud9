package com.org.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringBuffer {

	public static void main(String[] args) {
		TreeSet<StringBuffer> treeset = new TreeSet<>(new MyComparatorStringBuffer());
		treeset.add(new StringBuffer("Amit"));
		treeset.add(new StringBuffer("Kumar"));
		treeset.add(new StringBuffer("Agrawal"));
		treeset.add(new StringBuffer("Sears"));
		System.out.println(treeset);
	}
	
}

class MyComparatorStringBuffer implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer s1, StringBuffer s2) {
		return s1.toString().compareTo(s2.toString()); //Normal Order
		//return s2.toString().compareTo(s1.toString()); //Reverse Order
	}
	
}
