package com.org.enumm;

enum EnumWithMain {
	AMIT, ROHIT, RAVI, BHUPATI, HAROON;
	
	public static void main(String[] args) {
		EnumWithMain em = EnumWithMain.HAROON;
		System.out.println(em);
	}
}
