package com.org.thread.enhancement;

public class ThreadGroupDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup pg = new ThreadGroup("Parent Thread Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Thread Group");
		
		MyThreadGroup t1 = new MyThreadGroup(pg, "ChildThread-1");
		MyThreadGroup t2 = new MyThreadGroup(pg, "ChildThread-2");
		
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}

}

class MyThreadGroup extends Thread {
	
	public MyThreadGroup(ThreadGroup tg, String name) {
		super(tg, name);
	}
	
	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}