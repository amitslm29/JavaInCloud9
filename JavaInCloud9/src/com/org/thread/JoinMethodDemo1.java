package com.org.thread;

/*
 * In the below program, at line number 13, main thread calls join
 * method on child thread object. Hence main thread will wait
 * until completion of child thread.
 */
public class JoinMethodDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		MyThreadJoin1 mj = new MyThreadJoin1();
		mj.start();
		mj.join();
		System.out.println("End of Main Thread");
	}

}

class MyThreadJoin1 extends Thread {
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