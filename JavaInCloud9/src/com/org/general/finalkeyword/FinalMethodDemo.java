package com.org.general.finalkeyword;

public class FinalMethodDemo {

	final void m1() {
		System.out.println("Super class final method");
	}
}

class B extends FinalMethodDemo {
	
	// Compile time error, as final method cannot
	// be overridden
	/*void m1() {
		System.out.println("illegal !!!");
	}*/
	
	

}
