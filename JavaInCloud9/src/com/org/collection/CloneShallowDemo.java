package com.org.collection;

public class CloneShallowDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat cat = new Cat(20);
		Dog firstDog = new Dog(10, cat);
		Dog secondDog = (Dog) firstDog.clone();
		
		System.out.println(firstDog != secondDog);
		System.out.println(firstDog.equals(secondDog));
		System.out.println(firstDog.getClass() == secondDog.getClass());
		System.out.println(firstDog.hashCode());
		System.out.println(secondDog.hashCode());
		
		secondDog.i = 100;
		secondDog.cat.j = 200;
		
		System.out.println("Original Object >>> " + firstDog.i + " " + firstDog.cat.j);
		System.out.println("Cloned Object >>> " + secondDog.i + " " + secondDog.cat.j);
		
	}

}

class Cat {
	int j;
	
	Cat(int j) {
		this.j = j;
	}
}

class Dog implements Cloneable {
	int i;
	Cat cat;
	
	Dog (int i, Cat cat) {
		this.i = i;
		this.cat = cat;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
