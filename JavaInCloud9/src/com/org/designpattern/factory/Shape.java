package com.org.designpattern.factory;

enum ShapeType {
	SQUARE, RECTANGLE, CIRCLE;
}

public interface Shape {
	void draw();
}
