package com.org.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListIteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Amit");
		arr.add("Rohit");
		arr.add("Ravi");
		arr.add("Haroon");
		arr.add("Bhupati");
		System.out.println(arr);
		
		ListIterator<String> iter = arr.listIterator();
		while(iter.hasNext()) {
			String s = (String) iter.next();
			if(s.equals("Ravi")) {
				iter.remove();
			} else if(s.equals("Haroon")) {
				iter.set("Ramesh");
			} else if (s.equals("Bhupati")) {
				iter.add("Adarsh");
			}
		}
		System.out.println(arr);
		
		while(iter.hasPrevious()) {
			String s = (String) iter.previous();
			System.out.print(s + " ");
		}
		
	}
}
