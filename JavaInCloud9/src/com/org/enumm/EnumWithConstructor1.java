package com.org.enumm;

enum Sears {
	OMS, PROFILE, PROMOTION, CHECKOUT;
	
	Sears() {
		System.out.println("Enum Constructor");
	}
}

public class EnumWithConstructor1 {
	public static void main(String[] args) {
		Sears team = Sears.OMS;
		System.out.println("Inside Main Method");
	}
}
