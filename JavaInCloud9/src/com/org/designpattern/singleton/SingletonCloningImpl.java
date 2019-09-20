package com.org.designpattern.singleton;

public class SingletonCloningImpl {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonCloning instance1 = SingletonCloning.getInstance();
		SingletonCloning instance2 = (SingletonCloning) instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}

class SingletonCloning implements Cloneable {
	
	private SingletonCloning() { }
	
	private static class SingletonHelper {
		private static final SingletonCloning INSTANCE = new SingletonCloning();
	}
	
	public static SingletonCloning getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}