package com.org.reflection;

import java.lang.reflect.Field;

public class ReflectionDempAccessPrivateField {

	public static void main(String[] args) throws Exception {
		
		Class testClass = Class.forName("com.org.reflection.Test1");
		Test1 testInstance = new Test1(10, "Reflection");
		
		Field firstPrivateField = testClass.getDeclaredField("first");
		firstPrivateField.setAccessible(true);
		System.out.println(firstPrivateField.get(testInstance));
		
		Field secondPrivateField = testClass.getDeclaredField("second");
		secondPrivateField.setAccessible(true);
		System.out.println(secondPrivateField.get(testInstance));
		
		
	}
}

class Test1 {
	private int first;
	private String second;
	
	public Test1(int first, String second) {
		this.first = first;
		this.second = second;
	}
}