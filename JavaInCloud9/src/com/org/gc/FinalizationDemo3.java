package com.org.gc;

/*
Output -
End of Test class Finalize
End of Test class Finalize
End of Main
End of Test class Finalize
*/
public class FinalizationDemo3 {
	
	public static void main(String[] args) {
		FinalizationDemo3 fd = new FinalizationDemo3();
		fd.finalize();
		fd.finalize();
		fd = null;
		System.gc();
		System.out.println("End of Main");
	}
	
	public void finalize() {
		System.out.println("End of Test class Finalize");
	}

}
