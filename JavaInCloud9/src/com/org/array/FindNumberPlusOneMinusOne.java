package com.org.array;

public class FindNumberPlusOneMinusOne {
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,0,-1,-2,-1,0,1,2,3,2,1,2,1,2,3,4,3,4,5,4,5,6};
		int position = findNumber(arr, -1);
		if(position == -1)
			System.out.println("Invalid Entry !!!");
		else
			System.out.println("Position of given number is : " + position);
	}
	
	public static int findNumber(int[] arr, int num) {
		
		for(int i = 0; i<arr.length ; i= i + Math.abs(num-arr[i])) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
