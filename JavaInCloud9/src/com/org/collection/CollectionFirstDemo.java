package com.org.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class CollectionFirstDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Vector<Integer> vector = new Vector<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		System.out.println(arrayList instanceof Serializable); //true
		System.out.println(arrayList instanceof Cloneable); //true
		System.out.println(arrayList instanceof RandomAccess); //true
		System.out.println(vector instanceof Serializable); //true
		System.out.println(vector instanceof Cloneable); //true
		System.out.println(vector instanceof RandomAccess); //true
		System.out.println(linkedList instanceof Serializable); //true
		System.out.println(linkedList instanceof Cloneable); //true
		System.out.println(linkedList instanceof RandomAccess); //false
	}

}
