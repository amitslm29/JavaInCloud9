package com.org.designpattern.singleton;

public class SingletonBillPughImpl {
	
	public static void main(String[] args) {
		SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
		SingletonBillPugh instance2 = SingletonBillPugh.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
	
}

class SingletonBillPugh {
	
	private SingletonBillPugh() { }
	
	private static class SingletonHelper {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}
	
	public static SingletonBillPugh getInstance() {
		return SingletonHelper.INSTANCE;
	}
}


