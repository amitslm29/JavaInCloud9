package com.org.exception;

public class DefaultExceptionHandlerDemo {
	
	public static void main(String[] args) {
		doStuff();
	}
	
	public static void doStuff() {
		doMoreStuff();
	}
	
	public static void doMoreStuff() {
		System.out.println(10/0);
	}

}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.org.exception.DefaultExceptionHandlerDemo.doMoreStuff(DefaultExceptionHandlerDemo.java:14)
	at com.org.exception.DefaultExceptionHandlerDemo.doStuff(DefaultExceptionHandlerDemo.java:10)
	at com.org.exception.DefaultExceptionHandlerDemo.main(DefaultExceptionHandlerDemo.java:6)
*/