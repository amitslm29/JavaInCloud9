package com.org.thread;

import java.text.SimpleDateFormat;

public class ThreadLocalSimpleDateFormat implements Runnable {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadLocalSimpleDateFormat runnable = new ThreadLocalSimpleDateFormat();
		for(int i=0 ; i<5 ; i++) {
			Thread t = new Thread(runnable);
			Thread.sleep(2000);
			t.start();
		}
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : Default Value - " 
				+ formatter.get().toPattern());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		formatter.set(new SimpleDateFormat("ddMMyyyy HHmm"));
		
		System.out.println(Thread.currentThread().getName() + " Modified Value - " 
				+ formatter.get().toPattern());
	}
	
	private static final ThreadLocal<SimpleDateFormat> formatter = 
					new ThreadLocal<SimpleDateFormat>() {
		
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
			
		}
		
	};

}
