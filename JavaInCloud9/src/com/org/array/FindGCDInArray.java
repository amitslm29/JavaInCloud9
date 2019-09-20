package com.org.array;

//Find GCD of N numbers of an array
public class FindGCDInArray {

	public static void main(String[] args) {

		int[] arr = {5, 10, 15, 20, 25, 30, 35};
		int result = findGCDInArray(arr);
		System.out.println("GCD of given numbers - " + result);
	}

	public static int findGCDInArray(int[] arr) {

		int size = arr.length;
		int result = arr[0];
		for(int i=1 ; i<size ; i++) {
			result = findGCDofTwoNumbers(result, arr[i]);
		}
		return result;
	}

	public static int findGCDofTwoNumbers(int num1, int num2) {

		//Base case
		if (num1 == 0) 
			return num2; 
		if (num2 == 0) 
			return num1; 
		if (num1 == num2) 
			return num1; 

		while(num1 != num2) {
			if(num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		return num1;
	}

	public static int findGCDofTwoNumbersAnotherApproach(int num1, int num2) {
		int gcd = 1;
		for(int i=1 ; i<Math.min(num1, num2) ; i++){
			if(num1%i == 0 && num2%i == 0){
				gcd = i;
			}
		}
		return gcd;
	}
}
