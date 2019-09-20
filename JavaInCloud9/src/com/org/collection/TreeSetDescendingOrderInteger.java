package com.org.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDescendingOrderInteger {
	
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<>(new MyComparatorInteger());
		treeset.add(2);
		treeset.add(3);
		treeset.add(1);
		treeset.add(5);
		treeset.add(6);
		treeset.add(4);
		System.out.println(treeset);
	}
	
}

class MyComparatorInteger implements Comparator<Integer> {

	/*@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2)
			return +1;
		else if (o1 > o2)
			return -1;
		else
			return 0;
	}*/
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}
