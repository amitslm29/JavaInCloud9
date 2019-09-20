package com.org.thread;

/*
 * If a thread calls join method on the same thread itself, it leads to
 * Deadlock. In below program, main thread calls the join method on itself.
 */
public class JoinMethodDemo3 {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
	}
}