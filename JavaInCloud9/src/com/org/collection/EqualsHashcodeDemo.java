package com.org.collection;

public class EqualsHashcodeDemo {
	
	public static void main(String[] args) {
		
		String s1 = new String("Amit");
		String s2 = new String("Amit");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode()); // 2044535
		System.out.println(s2.hashCode()); // 2044535
		
		StringBuffer sb1 = new StringBuffer("Amit");
		StringBuffer sb2 = new StringBuffer("Amit");
		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		System.out.println(sb1.hashCode()); // 705927765
		System.out.println(sb2.hashCode()); // 366712642
		
		//System.out.println(s1 == sb1); // Compile time Error - Incompatible
		System.out.println(s1.equals(sb2)); // false
		
		System.out.println(s1 == null); // false
		System.out.println(s1.equals(null)); // false
	}

}
