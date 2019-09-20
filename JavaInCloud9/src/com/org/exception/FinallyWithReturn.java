package com.org.exception;

public class FinallyWithReturn {
	public static void main(String[] args) {
		System.out.println("Average = " + printAverage(100, 0));
		//System.out.println("Average = " + printAverage(100, 20));
		System.out.println("Exit Main.");
	}

	public static int printAverage (int totalSum, int totalNumber){
		int average =0;
		try {
			average = computeAverage(totalSum, totalNumber);
			System.out.println("Average:" + totalSum + "/" + totalNumber + "=" + average);
			return average;
		}finally{
			System.out.println("Finally Done.");
			return average*2;
		}
	}
	
	public static int computeAverage (int sum, int number){
		System.out.println("Computing Average.");
		return sum/number;
	}
}
