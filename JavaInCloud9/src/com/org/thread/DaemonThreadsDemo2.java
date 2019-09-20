package com.org.thread;

/*
 * In the below program, MyThreadDaemon1 is a daemon thread,
 * so when main thread will finish its execution, MyThreadDaemon1
 * thread will be terminated before finish its execution.
 */
public class DaemonThreadsDemo2 {
	
	public static void main(String[] args) {
		MyThreadDaemon1 md = new MyThreadDaemon1();
		md.setDaemon(true);
		md.start();
		System.out.println("End of Main Thread");
	}

}

class MyThreadDaemon1 extends Thread {
	public void run() {
		for(int i=1 ; i<=10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
