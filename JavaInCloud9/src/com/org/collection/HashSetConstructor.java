package com.org.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetConstructor {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashset01 = new HashSet<>();
		
		HashSet<Integer> hashset02 = new HashSet<>(100);
		
		HashSet<Integer> hashset03 = new HashSet<>(100, 0.8F);
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		HashSet<Integer> hashset04 = new HashSet<>(arraylist);
	}
	
	

}
