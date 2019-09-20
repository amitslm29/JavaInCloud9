package com.org.thread.important;

/*
 * Below program arises a Deadlock situation.
 * To prevent deadlock in the below program, interchange
 * the line number 28 and 29.
 */
public class DeadLockThreadDemo {
	
	String str1 = "Amit";
	String str2 = "Swati";
	
	Thread firstThread = new Thread("First Thread") {
		public void run() {
			while(true){
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	
	Thread secondThread = new Thread("Second Thread") {
		public void run() {
			while(true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		DeadLockThreadDemo deadThread = new DeadLockThreadDemo();
		deadThread.firstThread.start();
		deadThread.secondThread.start();
	}
}
