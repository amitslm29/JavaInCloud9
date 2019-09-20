package com.org.gc;

public class ObjectsCreatedInsideMethodDemo2 {
	public static void main(String[] args) {
		Student s = test();
		/* One object is eligible for garbage collection */
	}
	public static Student test() {
		Student s1 = new Student();
		Student s2 = new Student();
		return s1;
	}
}
