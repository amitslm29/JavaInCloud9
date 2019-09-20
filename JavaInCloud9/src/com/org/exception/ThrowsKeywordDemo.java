package com.org.exception;

public class ThrowsKeywordDemo {
	
	public static void main(String[] args) {
		try{
			calculateAge(10);
		} catch(ArithmeticException ae) {
			System.out.println("Handled in main method !!!");
		}
	}
	
	public static void calculateAge(int age) throws ArithmeticException {
		if(age < 18)
				throw new ArithmeticException();
	}
	
	

}
