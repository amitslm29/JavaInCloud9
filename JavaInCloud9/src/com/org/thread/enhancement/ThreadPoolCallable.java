package com.org.thread.enhancement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCallable {
	
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=10 ; i<=60 ; i=i+10) {
			Callable<Integer> job = new MyCallable(i);
			Future<Integer> future = executor.submit(job);
			System.out.println(future.get());
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
	}
}

class MyCallable implements Callable<Integer> {
	
	int number;
	public MyCallable(int number) {
		this.number = number;
	}

	public Integer call() throws Exception {
		Thread.sleep(1000);
		System.out.print(Thread.currentThread().getName() + " is responsible for "
				+ "finding sum of first " + number + " numbers : ");
		int sum = 0;
		for(int i=1 ; i<=number ; i++) {
			sum = sum + i;
		}
		return sum;
	}
}