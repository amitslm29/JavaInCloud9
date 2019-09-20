package com.org.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorIteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=1 ; i<=10 ; i++) {
			arr.add(i);
		}
		System.out.println(arr);
		
		Iterator<Integer> iter = arr.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			if(i%2 == 0) {
				System.out.print(i + " ");
			} else {
				iter.remove();
			}			
		}
		System.out.println();
		System.out.print(arr);
	}
}
