package com.org.thread;

/*
 * In the below program, child thread always calls yield
 * method, and due to this main thread will get a chance
 * more number of times and chance of completing main
 * thread first is high.
 */
public class YieldMethodDemo {
	
	public static void main(String[] args) {
		MyThreadYield my = new MyThreadYield();
		my.start();
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Main Thread");
		}
	}

}

class MyThreadYield extends Thread {
	
	public void run(){
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
