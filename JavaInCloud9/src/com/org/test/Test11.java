package com.org.test;

public class Test11 {
	
	
	
}

interface AAA {
	int temp = 1;
	void add();
}

interface BBB {
	int temp = 2;
	void add();
}

class CCC implements AAA, BBB {
	
	void print(){
		System.out.println();
	}

	@Override
	public void add() {
		
	}
}


