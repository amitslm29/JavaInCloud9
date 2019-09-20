package com.org.gc;

/* 
Output -
End of Main 
*/
public class FinalizationDemo2 {
	
	public static void main(String[] args) {
		String str = new String("Java");
		str = null;
		System.gc();
		System.out.println("End of Main");
	}
	
	public void finalize() {
		System.out.println("End of Test class Finalize");
	}
	
}