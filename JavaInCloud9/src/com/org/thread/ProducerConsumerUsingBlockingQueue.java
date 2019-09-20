package com.org.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();

		Thread producer = new Thread(new ProducerThread(sharedQueue));
		Thread consumer = new Thread(new ConsumerThread(sharedQueue));

		producer.start();
		consumer.start();
	}
}

class ProducerThread implements Runnable {

	private final BlockingQueue<Integer> sharedQueue;

	public ProducerThread(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++){
			try {
				System.out.println("Produced : " + i);
				sharedQueue.put(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ConsumerThread implements Runnable {

	private final BlockingQueue<Integer> sharedQueue;

	public ConsumerThread(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consumed : " + sharedQueue.take());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}