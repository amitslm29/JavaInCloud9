package com.org.thread;

public class DeadLockThreadDemo1 extends Thread {
   public static String str1 = "Amit";
   public static String str2 = "Bhupati";

   public static void main(String[] a) {
      Thread myThread = new MyThread();
      Thread yourThread = new YourThread();

      myThread.start();
      yourThread.start();
   }
   
   private static class MyThread extends Thread {
      public void run() {
         synchronized (str1) {
            System.out.println("MyThread Holds lock on object str1");
            try {
				Thread.sleep(10);
			}
            catch (InterruptedException e) {
			}
            
			System.out.println("MyThread waiting for lock on object str2");
            synchronized (str2) {
               System.out.println("MyThread Holds lock on objects str1, str2");
            }
         }
      }
   }
   
   private static class YourThread extends Thread {
      public void run() {
         synchronized (str2) {
            System.out.println("YourThread Holds lock on object str2");
            try {
				Thread.sleep(10);
			}
            catch (InterruptedException e) {}
            System.out.println("YourThread waiting for lock on object str1");
            synchronized (str1) {
				System.out.println("YourThread Holds lock on objects str1, str2");
            }
         }
      }
   }
   
}

