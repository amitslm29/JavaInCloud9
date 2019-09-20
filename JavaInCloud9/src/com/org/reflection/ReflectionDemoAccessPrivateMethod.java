package com.org.reflection;

import java.lang.reflect.Method;

public class ReflectionDemoAccessPrivateMethod {
	
	public static void main(String[] args) throws Exception {
		Class<Test> testClass = Test.class;
		Test testInstance = (Test) testClass.newInstance();
		
		Method testMethod1 = testClass.getDeclaredMethod("first", null);
		testMethod1.setAccessible(true);
		testMethod1.invoke(testInstance, null);
		
		Method testMethod2 = testClass.getDeclaredMethod("second", String.class);
		testMethod2.setAccessible(true);
		testMethod2.invoke(testInstance, " Second");
	}
}

class Test {
	private void first() {
		System.out.println("No parameterized private method");
	}
	
	private void second(String name) {
		System.out.println("Parameterized private method" + name);
	}
}