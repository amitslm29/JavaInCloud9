package com.org.thread;

/*
 * Overloading of run() method is always possible, but Thread class 
 * start() can invoke no argument run() method. The other overloaded 
 * method, we have to call explicitly, like a normal method call.
 * Output -
 * No argumented run method
 */
public class ThreadDemoOverloadedRun {
	
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		mt.start();
	}
}

class MyThread1 extends Thread {
	public void run() {
		System.out.println("No argumented run method");
	}
	
	public void run(int i) {
		System.out.println("Argumented run method");
	}
}
