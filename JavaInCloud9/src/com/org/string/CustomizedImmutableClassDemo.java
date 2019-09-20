package com.org.string;

// 1.Make Java class final
public final class CustomizedImmutableClassDemo {
	
	// 2.Make instance variables final
	private final Integer immutableField1;
	private final String immutavleField2;
	
	// 3.Initialize instance variables from constructor
	public CustomizedImmutableClassDemo(Integer immutableField1, String immutavleField2) {
		this.immutableField1 = immutableField1;
		this.immutavleField2 = immutavleField2;
	}

	// 4.No setter methods for instance variables, only getter methods
	public Integer getImmutableField1() {
		return immutableField1;
	}

	public String getImmutavleField2() {
		return immutavleField2;
	}
}

