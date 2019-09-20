package com.org.enumm;

enum Color {
	RED, GREEN, YELLOW;
}

public class EnumOutsideClass {
	public static void main(String[] args) {
		Color c = Color.RED;
		System.out.println(c);
	}
}


