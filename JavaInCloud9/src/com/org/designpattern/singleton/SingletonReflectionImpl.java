package com.org.designpattern.singleton;

import java.lang.reflect.Constructor;

public class SingletonReflectionImpl {

	public static void main(String[] args) throws Exception {

		SingletonReflection instance1 = SingletonReflection.getInstance();
		SingletonReflection instance2 = null;

		Class<SingletonReflection> singleton = SingletonReflection.class;
		Constructor con = singleton.getDeclaredConstructor(null);
		con.setAccessible(true);
		instance2 = (SingletonReflection) con.newInstance(null);

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

class SingletonReflection {
	
	private SingletonReflection() { }

	private static class SingletonHelper {
		private static final SingletonReflection INSTANCE = new SingletonReflection();
	}

	public static SingletonReflection getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
