package com.org.thread;

/*
 * In the below program, child thread will sleep for
 * 1 seconds for each run.
 */
public class SleepMethodDemo {
	
	public static void main(String[] args) {
		MyThreadSleep ms = new MyThreadSleep();
		ms.start();
	}

}

class MyThreadSleep extends Thread {
	public void run() {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
