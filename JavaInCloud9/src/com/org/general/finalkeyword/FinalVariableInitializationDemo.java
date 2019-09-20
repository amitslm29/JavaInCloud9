package com.org.general.finalkeyword;

public class FinalVariableInitializationDemo {

	// Initialize final variable during declaration
	final int THRESHOLD = 5;

	// A blank final variable
	final int CAPACITY;

	// A blank final variable
	final int  MINIMUM;

	// Initialize final static variable during declaration
	static final double PI = 3.141592653589793;

	// A blank final static variable
	static final double EULERCONSTANT;

	// Initializing final variable inside
	// instance initializer block
	{
		CAPACITY = 25;
	}

	// Initializing final static variable inside
	// static initializer block
	static {
		EULERCONSTANT = 2.3;
	}

	// Initializing final variable inside constructor
	public FinalVariableInitializationDemo() {
		MINIMUM = -1;
	}
}
