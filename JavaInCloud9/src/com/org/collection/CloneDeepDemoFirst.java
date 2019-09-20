package com.org.collection;

public class CloneDeepDemoFirst {

	public static void main(String[] args) throws CloneNotSupportedException {

		BB bb = new BB(20);
		AA first = new AA(10, bb);
		AA second = (AA) first.clone();

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

class BB {
	int j;

	BB(int j) {
		this.j = j;
	}
}

class AA implements Cloneable {
	int i;
	BB bb;

	AA(int i, BB bb) {
		this.i = i;
		this.bb = bb;
	}

	public Object clone() throws CloneNotSupportedException {
		AA clonedAA = (AA) super.clone();
		clonedAA.bb = new BB(i);
		return clonedAA;
	}
}
