package com.org.enumm;

enum Mobile {
	SONY(15000), SAMSUNG(20000), IPHONE(50000), MOTOROLA;
	
	int price;
	
	Mobile() {
		this.price=10000;
	}
	
	Mobile(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class EnumWithConstructor2 {
	public static void main(String[] args) {
		Mobile[] ma = Mobile.values();
		for(Mobile m : ma) {
			System.out.println(m + "'s Price : " + m.getPrice());
		}
	}
}
