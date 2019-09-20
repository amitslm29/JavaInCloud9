package com.org.thread;

/*
 * If we override start(), then our start() method will be executed
 * just like a normal method call, and new thread won’t be created.
 * Output - 
 * Start method
 */
public class ThreadDemoOverridingStart {
	
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		mt.start();
	}
	
}

class MyThread2 extends Thread {
	public void start() {
		System.out.println("Start method");
	}
	
	public void run() {
		System.out.println("Run method");
	}
}