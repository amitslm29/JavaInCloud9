package com.org.thread;

public class WaitNotifyDemo {
	
	public static void main(String[] args) throws InterruptedException {
		ChildThread ct = new ChildThread();
		ct.start();
		
		synchronized (ct) {
			System.out.println("Main thread is waiting...");
			ct.wait();
			System.out.println("Main thread got notification...");
			System.out.println("Total : " + ct.total);
		}
	}
	
}

class ChildThread extends Thread {
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation...");
			for(int i=1 ; i<=100 ; i++) {
				total = total + i;
			}
			System.out.println("Child thread giving notification...");
			this.notify();
		}
	}
}