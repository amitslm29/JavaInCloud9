package com.org.collection;

public class CloneDeepDemoSecond {
	
	public static void main(String[] args) throws CloneNotSupportedException {

		BBB bb = new BBB(20);
		AAA first = new AAA(10, bb);
		AAA second = (AAA) first.clone();

		System.out.println(first != second);
		System.out.println(first.equals(second));
		System.out.println(first.getClass() == second.getClass());
		System.out.println(first.hashCode());
		System.out.println(first.hashCode());

		second.i = 100;
		second.bb.j = 200;

		System.out.println("Original Object >>> " + first.i + " " + first.bb.j);
		System.out.println("Cloned Object >>> " + second.i + " " + second.bb.j);

	}

}

class BBB implements Cloneable {
	int j;

	BBB(int j) {
		this.j = j;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class AAA implements Cloneable {
	int i;
	BBB bb;

	AAA(int i, BBB bb) {
		this.i = i;
		this.bb = bb;
	}

	public Object clone() throws CloneNotSupportedException {
		AAA clonedAA = (AAA) super.clone();
		clonedAA.bb = (BBB) this.bb.clone();
		return clonedAA;
	}
}
