package com.org.designpattern.factory;

public class ShapeFactory {
	
	public static Shape drawShape(ShapeType type) {
		Shape shape = null;
		switch(type) {
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case CIRCLE:
			shape = new Circle();
			break;
		default:
			System.out.println("Not a valid input..");
			break;
		}
		return shape;
	}
}
