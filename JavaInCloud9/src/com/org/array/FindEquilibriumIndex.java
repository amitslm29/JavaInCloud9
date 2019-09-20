package com.org.array;

/*
 * Equilibrium index is an index such that the sum of elements at 
 * lower indexes is equal to the sum of elements at higher indexes. 
 * For example, in an array A[] = {-7, 1, 5, 2, -4, 3, 6}
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2]  =  A[4] + A[5] + A[6]
 * Refer - https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 * https://www.geeksforgeeks.org/find-element-array-sum-left-array-equal-sum-right-array/
 */
public class FindEquilibriumIndex {

	public static void main(String[] args) {
		int[] arr = {-7,1,5,2,-4,3,0};
		//int[] arr = {2,1,5,3,4,9,2};
		int equilibriumIndex = findIndex(arr);
		if(equilibriumIndex == -1)
			System.out.println("No Equilibrium Index.");
		else
			System.out.println("Equilibrium Index is : " + equilibriumIndex);
			System.out.println("Equilibrium Element is: " + arr[equilibriumIndex]);
	}
	
	public static int findIndex(int[] arr) {
		
		int sum = 0, leftSum = 0, size = arr.length;
		
		for(int i=0 ; i<size ; i++) {
			sum = sum + arr[i];
		}
		
		for(int i=0 ; i<size ; i++) {
			sum = sum - arr[i]; // sum is now the right sum for index i
			if(leftSum == sum)
				return i;
			leftSum = leftSum + arr[i];
		}
		return -1;
	}
}
