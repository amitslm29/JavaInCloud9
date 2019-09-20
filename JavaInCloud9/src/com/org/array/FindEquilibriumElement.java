package com.org.array;

/*
 * Find an element in array such that sum of left array is equal to sum of right array
 * Another approach - https://www.geeksforgeeks.org/find-element-array-sum-left-array-equal-sum-right-array/	
 */
public class FindEquilibriumElement {

	public static void main(String[] args) {
		int[] arr = {-7,1,5,2,-4,3,0};
		//int[] arr = {2,1,5,3,4,9,2};
		int equilibriumElement = findElement(arr);
		if(equilibriumElement == -1)
			System.out.println("No Equilibrium Element.");
		else
			System.out.println("Equilibrium Element is : " + equilibriumElement);
	}

	public static int findElement(int[] arr) {
		
		int sum = 0, leftSum = 0, size = arr.length;

		for(int i=0 ; i<size ; i++) {
			sum = sum + arr[i];
		}

		for(int i=0 ; i<size ; i++) {
			sum = sum - arr[i]; // sum is now the right sum for index i
			if(leftSum == sum)
				return arr[i];
			leftSum = leftSum + arr[i];
		}
		return -1;
	}
}
