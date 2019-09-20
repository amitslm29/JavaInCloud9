package com.org.designpattern.singleton;

public class SingletonDoubleLockImpl {
	
	public static void main(String[] args) {
		SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
		SingletonDoubleCheck instance2 = SingletonDoubleCheck.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}

class SingletonDoubleCheck {
	
	private static SingletonDoubleCheck INSTANCE;
	
	private SingletonDoubleCheck() { }
	
	public static SingletonDoubleCheck getInstance() {
		if(INSTANCE == null) {
			synchronized (SingletonDoubleCheck.class) {
				if(INSTANCE == null) {
					INSTANCE = new SingletonDoubleCheck();
				}
			}
		}
		return INSTANCE;
	}
}
