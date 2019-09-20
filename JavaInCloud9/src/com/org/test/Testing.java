package com.org.test;

public class Testing {
	
	public static void main(String[] args) {
		
		A a = new A();
		//a.f1();
		//a.f2();
		
		B b = new B();
		//b.f1();
		//b.f2();
		//b.f3();
		
		A aa = new B();
		aa.f1();
		aa.f2();
	
	}
	
	

}

class A {
	
	void f1(){
		System.out.println("A-f1");
	}
	
	void f2(){
		System.out.println("A-f2");
	}
}

class B extends A {
	
	void f2(){
		System.out.println("B-f2");
	}
	
	void f3(){
		System.out.println("B-f3");
	}
}
