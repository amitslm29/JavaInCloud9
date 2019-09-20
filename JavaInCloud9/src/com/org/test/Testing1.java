package com.org.test;

public class Testing1 {

	Testing1(){}

	public static void main(String[] args) {
		Sub1 b =new Sub1();		
	}
}

class Super1 {
	static int i =5;
}
class Sub1 extends Super1{
	static int i = 10;
}
