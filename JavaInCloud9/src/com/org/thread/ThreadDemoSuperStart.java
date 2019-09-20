package com.org.thread;

/* 
 * Output - (Below output sequence can change)
 * Run method
 * Start method
 * Main method
 */
public class ThreadDemoSuperStart {
	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		mt.start();
		System.out.println("Main method");
	}
}

class MyThread4 extends Thread {
	
	public void start() {
		super.start();
		System.out.println("Start method");
	}
	
	public void run() {
		System.out.println("Run method");
	}
}