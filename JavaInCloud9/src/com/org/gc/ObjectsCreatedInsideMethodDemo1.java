package com.org.gc;

public class ObjectsCreatedInsideMethodDemo1 {
	public static void main(String[] args) {
		test();
		/* Two objects are eligible for garbage collection */
	}
	public static void test() {
		Student s1 = new Student();
		Student s2 = new Student();
	}
}