package com.org.thread;

/*
 * In the below program, at line number 12, main thread
 * interrupts the child thread
 */
public class InterruptMethodDemo {
	
	public static void main(String[] args) {
		MyThreadInterrupt mi = new MyThreadInterrupt();
		mi.start();
		mi.interrupt();
		System.out.println("End of Main Thread");
	}

}

class MyThreadInterrupt extends Thread {
	public void run() {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("I got interrupted");
			}
		}
	}
}