package com.org.thread.important;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerUsingWaitNotify {
	
	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<Integer>();
		int MAX_SIZE = 5;
		
		Thread thread1 = new Thread(new Producer(sharedList, MAX_SIZE));
		Thread thread2 = new Thread(new Consumer(sharedList, MAX_SIZE));
		
		thread1.start();
		thread2.start();
	}
}

class Producer implements Runnable {
	
	private List<Integer> sharedList;
	private int MAX_SIZE;
	private int i = 1;
	
	public Producer(List<Integer> sharedList, int MAX_SIZE) {
		this.sharedList = sharedList;
		this.MAX_SIZE = MAX_SIZE;
	}

	public void run() {
		while(true) {
			try {
				produce(i++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while(sharedList.size() == MAX_SIZE) {
				System.out.println("SharedList is full... Waiting for Consumer to consume");
				sharedList.wait();
			}
			System.out.println("Producer produced element : " + i);
			sharedList.add(i);
			Thread.sleep(1000);
			sharedList.notify();
		}
	}
}

class Consumer implements Runnable {
	
	private List<Integer> sharedList;
	private int MAX_SIZE;
	
	public Consumer(List<Integer> sharedList, int MAX_SIZE) {
		this.sharedList = sharedList;
		this.MAX_SIZE = MAX_SIZE;
	}
	
	public void run() {
		while(true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void consume() throws InterruptedException {
		synchronized (sharedList) {
			while(sharedList.isEmpty()) {
				System.out.println("ShareList is empty... Waiting for Producer to produce");
				sharedList.wait();
			}
			Thread.sleep(1000);
			System.out.println("Consumer consumed element : " + sharedList.remove(0));
			sharedList.notify();
		}
	}
}