package com.org.reflection;

public class ReflectionDemo {

	public static void main(String[] args) throws InstantiationException, 
					IllegalAccessException, ClassNotFoundException {

		//Load a class (First Way)
		//Class<Animal> animalClass = Animal.class;
		
		//Load a class (Second way)
		Class animalClass = Class.forName("com.org.reflection.Animal");
		
		//Instantiate a class
		Animal animalObject = (Animal) animalClass.newInstance();
		
		//Invoke method using object
		animalObject.eat();
	}
}

class Animal {
	
	public void eat() {
		System.out.println("Animal class eat method");
	}

}
