package com.org.designpattern.observer;

public class Person implements Observer {
	String personName;
	
	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(String availability) {
		System.out.println("Hello " + personName + ", product is now " + availability);
	}
}
