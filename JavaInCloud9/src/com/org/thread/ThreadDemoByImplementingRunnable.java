package com.org.thread;

public class ThreadDemoByImplementingRunnable {

	public static void main(String[] args) {
		MyThreadRunnable runnable = new MyThreadRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		
		/* Below piece of code will be executed by Main thread */
		for(int i=0 ; i<5 ; i++) {
			System.out.println("Main Thread");
		}
	}
}

class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		/* Below piece of code will be executed by child thread */
		for(int i=0 ; i<5 ; i++) {
			System.out.println("Child Thread");
		}
	}
	
}