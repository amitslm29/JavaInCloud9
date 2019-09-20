package com.org.systemdesign.parkinglot;

enum Color {
	WHITE, RED, GREY, SILVER, BLACK;
}

abstract class Vehicle {
	String licenseNumber;
	Color color;
}
