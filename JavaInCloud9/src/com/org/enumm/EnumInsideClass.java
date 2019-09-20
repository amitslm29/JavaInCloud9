package com.org.enumm;

public class EnumInsideClass {
	
	enum Color {
		RED, GREEN, YELLOW;
	}
	
	public static void main(String[] args) {
		Color c = Color.RED;
		System.out.println(c); //RED
	}
	
}
