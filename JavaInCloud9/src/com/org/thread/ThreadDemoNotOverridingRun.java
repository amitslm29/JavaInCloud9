package com.org.thread;

/*
 * If you won't override run(), then Thread class run() 
 * method will be executed which has empty implementation. 
 * Hence, you wont get any output.
 */
public class ThreadDemoNotOverridingRun {
	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		mt.start();
	}
}

class MyThread3 extends Thread {

}
