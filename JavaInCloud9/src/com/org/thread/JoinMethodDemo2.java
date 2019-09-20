package com.org.thread;

/*
 * Waiting of child thread until the completion
 * of main thread
 */
public class JoinMethodDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		MyThreadJoin2.mt = Thread.currentThread();
		MyThreadJoin2 mj = new MyThreadJoin2();
		mj.start();
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
	
}

class MyThreadJoin2 extends Thread {
	
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Child Thread");
		}
	}
}