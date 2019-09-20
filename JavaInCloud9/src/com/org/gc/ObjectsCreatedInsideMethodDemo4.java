package com.org.gc;

public class ObjectsCreatedInsideMethodDemo4 {
	static Student s;
	public static void main(String[] args) {
		test();
		/* One object is eligible for garbage collection */
	}
	public static void test() {
		Student s1 = new Student();
		s = new Student();
	}
}
