package com.org.thread.enhancement;

public class ThreadGroupPriority {
	
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Master Thread Group");
		Thread t1 = new Thread(tg, "Thread-1");
		Thread t2 = new Thread(tg, "Thread-2");
		System.out.println(t1.getName() + " Priority - " + t1.getPriority()); //5
		System.out.println(t2.getName() + " Priority - " + t2.getPriority()); //5
		tg.setMaxPriority(3);
		Thread t3 = new Thread(tg, "Thread-3");
		System.out.println(t1.getName() + " Priority - " + t1.getPriority()); //5
		System.out.println(t2.getName() + " Priority - " + t2.getPriority()); //5
		System.out.println(t3.getName() + " Priority - " + t3.getPriority()); //3
	}

}
