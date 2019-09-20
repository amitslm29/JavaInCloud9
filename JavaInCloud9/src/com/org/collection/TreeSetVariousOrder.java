package com.org.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetVariousOrder {
	
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<>(new MyComparatorForTreeSet());
		treeset.add(2);
		treeset.add(3);
		treeset.add(1);
		treeset.add(5);
		treeset.add(6);
		treeset.add(4);
		treeset.add(4);
		System.out.println(treeset);
	}

}

class MyComparatorForTreeSet implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// return o1.compareTo(o2); [1,2,3,4,5,6] - Ascending Order
		// return -o1.compareTo(o2); [6,5,4,3,2,1] - Descending Order
		// return o2.compareTo(o1); [6,5,4,3,2,1] - Descending Order 
		// return -o2.compareTo(o1); [1,2,3,4,5,6] - Ascending Order
		// return +1; [2,3,1,5,6,4,4] - Insertion Order, including duplicates
		// return -1; [4,4,6,5,1,3,2] - Reverse of Insertion Order, including duplicates
		return 0; 
		/* [2] - Only first element will be inserted and all other elements will 
		be considered as duplicates */
	}
	
}
