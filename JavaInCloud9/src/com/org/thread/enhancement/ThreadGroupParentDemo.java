package com.org.thread.enhancement;

public class ThreadGroupParentDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName()); //main
		System.out.println(Thread.currentThread()
				.getThreadGroup().getParent().getName()); //system
	}

}
