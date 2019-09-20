package com.org.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
	
	private List<Observer> observers = new ArrayList<>();
	private String productName;
	private String availability;
	
	public Product(String productName, String availability) {
		super();
		this.productName = productName;
		this.availability = availability;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("Notifying all subscribers on product availability");
		for(Observer ob : observers){
			ob.update(this.availability);
		}
	}

}
