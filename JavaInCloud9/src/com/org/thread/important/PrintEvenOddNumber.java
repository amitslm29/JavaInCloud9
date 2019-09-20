package com.org.thread.important;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * Reference - https://www.youtube.com/watch?v=Rj7Ed3Y7QOE
 */
public class PrintEvenOddNumber {
	public static void main(String[] args) {
		AtomicInteger num = new AtomicInteger(1);
		Object sharedObj = new Object();
		
		Thread even = new Thread(new EvenNumber(num, sharedObj));
		Thread odd = new Thread(new OddNumber(num, sharedObj));
		
		even.start();
		odd.start();
	}
}

class EvenNumber implements Runnable {
	private AtomicInteger num;
	private Object sharedObj;

	public EvenNumber(AtomicInteger num, Object sharedObj) {
		this.num = num;
		this.sharedObj = sharedObj;
	}

	@Override
	public void run() {
		synchronized (sharedObj) {
			while(true) {
				try{
					if(num.get()%2 != 0) {
						sharedObj.wait();
					}
					else{
						System.out.println("Even : " + num);
						num.incrementAndGet();
						Thread.sleep(1000);
						sharedObj.notify();
					}
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}
}

class OddNumber implements Runnable {
	private AtomicInteger num;
	private Object sharedObj;

	public OddNumber(AtomicInteger num, Object sharedObj) {
		this.num = num;
		this.sharedObj = sharedObj;
	}

	@Override
	public void run() {
		synchronized (sharedObj) {
			while(true) {
				try{
					if(num.get()%2 == 0) {
						sharedObj.wait();
					}
					else{
						System.out.println("Odd : " + num);
						num.incrementAndGet();
						Thread.sleep(1000);
						sharedObj.notify();
					}
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}
}
