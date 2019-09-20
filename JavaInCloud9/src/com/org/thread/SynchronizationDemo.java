package com.org.thread;

public class SynchronizationDemo {
	
	public static void main(String[] args) {
		Display d = new Display();
		MyThreadDisplay t1 = new MyThreadDisplay(d, "Amit");
		MyThreadDisplay t2 = new MyThreadDisplay(d, "Bhupati");
		t1.start();
		t2.start();
	}

}

class Display {
	public synchronized void wish(String name) {
		for(int i=0 ; i<10 ; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThreadDisplay extends Thread {
	Display d;
	String name;
	
	public MyThreadDisplay(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}