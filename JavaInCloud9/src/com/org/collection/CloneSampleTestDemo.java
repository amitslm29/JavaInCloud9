package com.org.collection;

public class CloneSampleTestDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Test first = new Test(10, 20);
		System.out.println(first.i + " " + first.j);
		Test second = (Test) first.clone();
		System.out.println(second.i + " " + second.j);
		second.i = 100;
		second.j = 200;
		System.out.println(second.i + " " + second.j);
	}

}

class Test implements Cloneable {
	
	int i;
	int j;
	
	Test (int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
