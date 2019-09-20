package com.org.general;

public class StaticCounterWithStatic {
	static int count = 0; //will get memory only once and retain its value

	StaticCounterWithStatic() {
		count++;
		System.out.print(count + " ");
	}

	public static void main(String[] args) {
		StaticCounterWithStatic c1=new StaticCounterWithStatic();  
		StaticCounterWithStatic c2=new StaticCounterWithStatic();  
		StaticCounterWithStatic c3=new StaticCounterWithStatic();
	}
}

