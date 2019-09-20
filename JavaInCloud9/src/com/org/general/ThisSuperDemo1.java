package com.org.general;

public class ThisSuperDemo1 {

	int a = 10;
	static int b = 20;
	
	void calculate() {
		this.a = 100;
		this.b = 200;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		//if we uncomment below line, it will throw compilation error,
		//as we cannot use this inside static context
		//this.a;
		
		new ThisSuperDemo1().calculate();
	}
}
