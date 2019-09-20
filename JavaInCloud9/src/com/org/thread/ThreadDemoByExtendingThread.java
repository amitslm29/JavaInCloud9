package com.org.thread;

public class ThreadDemoByExtendingThread {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		
		/* Below piece of code will be executed by Main thread */
		for(int i=0 ; i<5 ; i++) {
			System.out.println("Main Thread");
		}
	}
}

class MyThread extends Thread {
	public void run() {
		/* Below piece of code will be executed by child thread */
		for(int i=0 ; i<5 ; i++) {
			System.out.println("Child Thread");
		}
	}
}
