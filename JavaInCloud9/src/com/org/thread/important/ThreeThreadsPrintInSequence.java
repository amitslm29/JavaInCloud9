package com.org.thread.important;

/*
 * Let’s suppose there are 3 threads t1, t2 and t3, where t1 prints o1, 
 * t2 prints o2 and t3 prints o3. Write a program using wait and notify 
 * for thread synchronization so that whenever program is run, the output 
 * is always in below order.
 * o1
 * o2
 * o3
 */
public class ThreeThreadsPrintInSequence {

	public static void main(String[] args) {
		ResourceLock lock = new ResourceLock();
		T1 t1 = new T1(lock);
		T2 t2 = new T2(lock);
		T3 t3 = new T3(lock);
		t1.start();
		t2.start();
		t3.start();
	}

	static class ResourceLock {
		public volatile int flag = 1;
	}

	static class T1 extends Thread {

		ResourceLock lock;

		public T1(ResourceLock lock) {
			this.lock = lock;
		}

		@Override
		public void run(){
			synchronized (lock){
				try{
					while(lock.flag != 1){
						lock.wait();
					}
					System.out.println("o1");
					lock.flag = 2;
					lock.notifyAll();
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}

	static class T2 extends Thread {

		ResourceLock lock;

		public T2(ResourceLock lock) {
			this.lock = lock;
		}

		@Override
		public void run(){
			synchronized (lock){
				try{
					while(lock.flag != 2){
						lock.wait();
					}
					System.out.println("o2");
					lock.flag = 3;
					lock.notifyAll();
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}

	static class T3 extends Thread {

		ResourceLock lock;

		public T3(ResourceLock lock) {
			this.lock = lock;
		}

		@Override
		public void run(){
			synchronized (lock){
				try{
					while(lock.flag != 3){
						lock.wait();
					}
					System.out.println("o3");
					lock.flag = 1;
					lock.notifyAll();
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}
}