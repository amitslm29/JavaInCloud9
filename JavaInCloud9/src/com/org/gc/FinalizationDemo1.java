package com.org.gc;

/*
Output -
End of Main
End of Test class Finalize
*/
public class FinalizationDemo1 {
	
	public static void main(String[] args) {
		FinalizationDemo1 fd = new FinalizationDemo1();
		fd = null;
		System.gc();
		System.out.println("End of Main");
	}
	
	public void finalize() {
		System.out.println("End of Test class Finalize");
	}
	
}