package com.org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		sortNaturalOrder();
		sortCustomizedOrder();
	}
	
	public static void sortNaturalOrder() {
		List<String> list = new ArrayList<>();
		list.add("Amit");
		list.add("Rohit");
		list.add("Ravi");
		list.add("Haroon");
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void sortCustomizedOrder() {
		List<String> list = new ArrayList<>();
		list.add("Amit");
		list.add("Rohit");
		list.add("Ravi");
		list.add("Haroon");
		Collections.sort(list, new CollectionComparator());
		System.out.println(list);
	}
	
}

class CollectionComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
	
}
