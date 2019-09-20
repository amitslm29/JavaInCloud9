package com.org.thread.enhancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolRunnable {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0 ; i<10 ; i++) {
			Runnable print = new PrintJob("Job-" + i);
			executor.execute(print);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
	}
}

class PrintJob implements Runnable {
	
	private String name;
	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " started by Thread : " 
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " completed by Thread : " 
				+ Thread.currentThread().getName());
	}
}