package com.org.designpattern.singleton;

import java.io.*;

public class SingletonSerializationImpl {
	
	public static void main(String[] args) throws Exception {
		
		SingletonSerialization instance1 = SingletonSerialization.getInstance();
		SingletonSerialization instance2 = null;
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance1);
        oos.close();
         
        FileInputStream fis = new FileInputStream("test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		instance2 = (SingletonSerialization) ois.readObject();
		ois.close();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}

class SingletonSerialization implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private SingletonSerialization() { }

	private static class SingletonHelper {
		private static final SingletonSerialization INSTANCE = new SingletonSerialization();
	}

	public static SingletonSerialization getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	protected Object readResolve() {
	    return getInstance();
	}
}