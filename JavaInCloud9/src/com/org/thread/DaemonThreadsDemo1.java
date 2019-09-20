package com.org.thread;

public class DaemonThreadsDemo1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); // false
		//Thread.currentThread().setDaemon(true); // IllegalThreadStateException
		MyThreadDaemon md = new MyThreadDaemon();
		System.out.println(md.isDaemon()); // false
		md.setDaemon(true);
		System.out.println(md.isDaemon()); // true
		md.start();
	}
}

class MyThreadDaemon extends Thread {
	public void run() {
		System.out.println("Daemon Example");
	}	
}