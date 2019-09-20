package com.org.exception;

public class ThrowKeywordDemo {

	public static void main(String[] args) {
		try{
			calculateAge(10);
		} catch(ArithmeticException ae) {
			System.out.println("Caught inside main !!!");
		}
	}

	public static void calculateAge(int age) {
		try{
			if(age < 18){
				throw new ArithmeticException(); //throw an exception
			}
		} catch (ArithmeticException ae) {
			System.out.println("Caught inside calculateAge !!!");
			throw ae; // re-throwing the exception
		}
	}
}


