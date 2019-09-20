package com.org.thread;

/*
 * After starting a thread, if we try to restart the 
 * same thread, we will get IllegalThreadStateException
 */
public class ThreadDemoRestartingThread {
	public static void main(String[] args) {
		MyThread5 mt = new MyThread5();
		mt.start();
		mt.start();
		System.out.println("Main method");
	}
}

class MyThread5 extends Thread {
	public void run() {
		System.out.println("Run method");
	}
}