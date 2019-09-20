package com.org.general;

class Calculation {
	int a = 10;
	static int b = 20;
}

public class ThisSuperDemo3 extends Calculation {

	void calculate() {
		super.a = 100;
		super.b = 200;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		//if we uncomment below line, it will throw compilation error,
		//as we cannot use super inside static context
		//super.a;

		new ThisSuperDemo3().calculate();
	}
}