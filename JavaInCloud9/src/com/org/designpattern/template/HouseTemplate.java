package com.org.designpattern.template;

public abstract class HouseTemplate {
	
	//Template method, marked as final, as subclasses can't override.
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	//Default implementation
	void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	//Methods to be implemented by subclasses
	abstract void buildWalls();
	abstract void buildPillars();

	void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}

}
