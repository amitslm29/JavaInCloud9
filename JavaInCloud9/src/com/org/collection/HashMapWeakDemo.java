package com.org.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapWeakDemo {
	
	public static void main(String[] args) throws Exception {
		
		/* Output
		 {temp=100}
		 {temp=100} */
		normalHashMapMethod();
		
		/* Output
		 {temp=100}
		 Finalize method called
		 {} */
		weakHashMapMethod();
	}
	
	public static void normalHashMapMethod() throws Exception {
		HashMap<Temp, Integer> map = new HashMap<>();
		Temp temp = new Temp();
		map.put(temp, 100);
		System.out.println(map);
		temp = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}
	
	public static void weakHashMapMethod() throws Exception {
		WeakHashMap<Temp, Integer> map = new WeakHashMap<>();
		Temp temp = new Temp();
		map.put(temp, 100);
		System.out.println(map);
		temp = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}
}

class Temp {
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Finalize method called");
	}
}