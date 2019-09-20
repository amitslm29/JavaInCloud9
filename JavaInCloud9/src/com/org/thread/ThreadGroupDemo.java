package com.org.thread;

public class ThreadGroupDemo {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		MyThreadForThreadGroup t1 = new MyThreadForThreadGroup(pg, "Child Thread-1");
		MyThreadForThreadGroup t2 = new MyThreadForThreadGroup(pg, "Child Thread-2");
		t1.start();
		t2.start();
		System.out.println("Active Thread Count - " + pg.activeCount()); // 2
		System.out.println("Active ThreadGroup Count - " + pg.activeGroupCount()); // 1
		System.out.println("Details on Parent ThreadGroup is as below.");
		pg.list();
		
		//By the time below sleep gets executed, both t1 and t2 will finish their execution.
		Thread.sleep(10000);
		System.out.println("Active Thread Count - " + pg.activeCount()); // 0
		System.out.println("Active ThreadGroup Count - " + pg.activeGroupCount()); //1
		System.out.println("Details on Parent ThreadGroup is as below.");
		pg.list();
	}
}

class MyThreadForThreadGroup extends Thread {
	
	public MyThreadForThreadGroup(ThreadGroup tg, String name) {
		super(tg, name);
	}
	
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
