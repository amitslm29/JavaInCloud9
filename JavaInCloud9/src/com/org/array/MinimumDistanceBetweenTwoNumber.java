package com.org.array;

/*
 * Use two loops: The outer loop picks all the elements of arr[] one by one. 
 * The inner loop picks all the elements after the element picked by outer loop. 
 * If the elements picked by outer and inner loops have same values as x or y 
 * then if needed update the minimum distance calculated so far.
 */
public class MinimumDistanceBetweenTwoNumber {
	
	public static void main(String[] args) {
		
		int arrayOfInteger[] = {2,4,5,6,3,1,9,7,8,10};
		int firstNumber = 5;
		int secondNumber = 9;
		int result = minimumDistance(arrayOfInteger, firstNumber, secondNumber);
		if (result == -1) {
			System.out.println("Invalid Input !!!");
		}else {
			System.out.println("Distance between two numbers : " + 
					minimumDistance(arrayOfInteger, firstNumber, secondNumber));
		}	
	}
	
	public static int minimumDistance(int arr[], int first, int second) {
		int i, j, size, minimum_distance;
		size = arr.length;
		minimum_distance = Integer.MAX_VALUE;
		
		if (size < 2) {
			return -1;
		}
		
		for (i=0 ; i < size ; i++) {
			for (j=i+1 ; j < size ; j++) {
				
				if ((first == arr[i] && second == arr[j] || second == arr[i] && first == arr[j]) &&
						minimum_distance > Math.abs(i-j)) {
					minimum_distance = Math.abs(i-j);
				}
			}
		}
		return minimum_distance;
	}

}
