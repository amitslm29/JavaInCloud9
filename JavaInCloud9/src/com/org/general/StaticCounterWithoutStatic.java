package com.org.general;

public class StaticCounterWithoutStatic {
	int count = 0; //will get memory each time when the instance is created

	StaticCounterWithoutStatic() {
		count++;
		System.out.print(count + " ");
	}

	public static void main(String[] args) {
		StaticCounterWithoutStatic c1=new StaticCounterWithoutStatic();  
		StaticCounterWithoutStatic c2=new StaticCounterWithoutStatic();  
		StaticCounterWithoutStatic c3=new StaticCounterWithoutStatic();
	}
}
