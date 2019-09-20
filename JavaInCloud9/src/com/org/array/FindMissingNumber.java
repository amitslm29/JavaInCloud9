package com.org.array;

/* Find the missing number in integer array of 1 to 10 */
public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,9,10};
		System.out.println("MISSING NUMBER IS : " + findMissingNo(arr, 10));
		System.out.println("MISSING NUMBER IS : " + findMissingNoUsingXOR(arr));
	}
	
	public static int findMissingNo (int arr[], int n) {
		
		int i, size, total;
		size = arr.length;
		total = (n*(n+1))/2;
		
		for (i=0 ; i<size ; i++) {
			total = total - arr[i];
		}
		return total;
	}
	
	// A XOR A = 0
	public static int findMissingNoUsingXOR(int[] arr){
		
		int size = arr.length;
		int missingNo = 0;
		
		for(int i = 0 ; i<size ; i++){
			//if(arr[i] != i+1){
			if((arr[i]^i+1) != 0){
				missingNo = i+1;
				break;
			}
		}
		
		return missingNo;
	}
}
