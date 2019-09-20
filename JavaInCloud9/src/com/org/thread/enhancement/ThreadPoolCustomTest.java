package com.org.thread.enhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class ThreadPoolCustomTest {
	
	public static void main(String[] args) throws InterruptedException {
		CustomThreadPool threadPool = new CustomThreadPool(3);
		for(int i=1 ; i<=5 ; i++){
			threadPool.execute(new MyRunnable());
		}
		threadPool.shutdown();
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has started the task");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has finished the task");
	}
}

class CustomThreadPool {

	private BlockingQueue<Runnable> runnableQueue;
	private List<WorkerThread> threads;
	private boolean isThreadPoolStopped;

	public CustomThreadPool(final int numberOfThreads) {
		runnableQueue = new LinkedBlockingQueue<>();
		threads = new ArrayList<>(numberOfThreads);
		isThreadPoolStopped = false;

		//Create worker threads
		for(int i=1 ; i<=numberOfThreads ; i++){
			WorkerThread thread = new WorkerThread(runnableQueue);
			thread.setName("Worker Thread - " + i);
			thread.start();
			threads.add(thread);
		}
	}
	
	public void execute(Runnable runnable) throws InterruptedException {
		if(isThreadPoolStopped)
			throw new InterruptedException("Thread Pool is shutdown...");
		runnableQueue.put(runnable);
	}
	
	public void shutdown(){
		isThreadPoolStopped = true;
	}
	
	private class WorkerThread extends Thread {
		
		private BlockingQueue<Runnable> runnableQueue;
		//private boolean isThreadPoolStopped;
		
		public WorkerThread(BlockingQueue<Runnable> runnableQueue) {
			this.runnableQueue = runnableQueue;
			isThreadPoolStopped = false;
		}
		
		@Override
		public void run(){
			while(!isThreadPoolStopped){
				try{
					Runnable runnable = runnableQueue.take();
					runnable.run();
					Thread.sleep(5000);
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}
}