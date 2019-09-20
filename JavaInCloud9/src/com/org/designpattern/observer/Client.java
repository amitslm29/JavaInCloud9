package com.org.designpattern.observer;

public class Client {
	public static void main(String[] args) {
		Person person1 = new Person("Amit");
		Person person2 = new Person("Rohit");
		
		Product product = new Product("OnePlus7Pro", "Not Available");
		product.registerObserver(person1);
		product.registerObserver(person2);
		
		product.setAvailability("Available");
	}
}
