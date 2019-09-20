package com.org.thread;

public class ThreadLocalInteger implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalInteger runnable = new ThreadLocalInteger();
		for(int i=0 ; i<5 ; i++) {
			Thread t = new Thread(runnable);
			Thread.sleep(2000);
			t.start();
		}
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : Default Value - "
				+ threadLocal.get());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadLocal.set(10);
		System.out.println(Thread.currentThread().getName() + " : Modified Value - "
				+ threadLocal.get());
	}
	
	private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};
	
}
