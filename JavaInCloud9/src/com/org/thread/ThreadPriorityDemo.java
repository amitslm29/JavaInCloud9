package com.org.thread;

public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		System.out.println("Main Thread");
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(7);
		MyThread6 mt = new MyThread6();
		System.out.println("Child Thread");
		System.out.println(mt.getPriority());
		System.out.println(mt.getName());
	}
}

class MyThread6 extends Thread {
	
}