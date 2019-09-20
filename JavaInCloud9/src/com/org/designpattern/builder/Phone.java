package com.org.designpattern.builder;

public class Phone {

	//Required Parameters
	private int price;
	private String os;

	//Optional Parameters
	private String camera;
	private double screensize;
	
	//Private constructor
	private Phone(PhoneBuilder builder){
		this.price = builder.price;
		this.os = builder.os;
		this.camera = builder.camera;
		this.screensize = builder.screensize;
	}

	//Provide only getter methods, not setters
	public int getPrice() {
		return price;
	}
	public String getOs() {
		return os;
	}
	public String getCamera() {
		return camera;
	}
	public double getScreensize() {
		return screensize;
	}
	
	public String toString() {
		return "PHONE : [OS= " + os + " || PRICE= " + price + " || CAMERA= " 
				+ camera + " || SCREENSIZE= " + screensize + "]";
	}

	//Builder Class
	public static class PhoneBuilder {
		
		//Required Parameters
		private int price;
		private String os;
		
		//Optional Parameters
		private String camera;
		private double screensize;
		
		//Constructor of Builder class only for
		//required parameters as arguments
		public PhoneBuilder(int price, String os) {
			this.price = price;
			this.os = os;
		}
		
		//Methods to set optional parameters
		//It should return the instance of Builder class
		public PhoneBuilder setCamera(String camera) {
			this.camera = camera;
			return this;
		}

		public PhoneBuilder setScreensize(double screensize) {
			this.screensize = screensize;
			return this;
		}
		
		//build() method which is used to get the
		//instance of Computer
		public Phone build() {
			return new Phone(this);
		}

	}

}
