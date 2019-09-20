package com.org.designpattern.singleton;

public class SingletonEnumImpl {
	
	public static void main(String[] args) {
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

enum SingletonEnum {
	INSTANCE;
}
