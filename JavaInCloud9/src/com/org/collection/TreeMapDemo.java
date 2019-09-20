package com.org.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		System.out.print("Values in natural order : ");
		treeMapNaturalOrder();
		System.out.print("Values in reverse order : ");
		treeMapReverseOrder();
	}

	public static void treeMapNaturalOrder() {
		TreeMap<String, Integer> treemap = new TreeMap<>();
		treemap.put("BBB", 100);
		treemap.put("DDD", 200);
		treemap.put("CCC", 300);
		treemap.put("AAA", 400);
		System.out.println(treemap);
	}
	
	public static void treeMapReverseOrder() {
		TreeMap<String, Integer> treemap = new TreeMap<>(new MyComparatorTreeMap());
		treemap.put("BBB", 100);
		treemap.put("DDD", 200);
		treemap.put("CCC", 300);
		treemap.put("AAA", 400);
		System.out.println(treemap);
	}
	
}

class MyComparatorTreeMap implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
	
}
