package com.org.array;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5,6,7,8,9,10};
		System.out.println("Duplicate Number : " + findDuplicate(arr));
		System.out.println("Duplicate Number : " + findDuplicateUsingXOR(arr));
	}

	public static int findDuplicate(int arr[]) {
		int total=0, duplicateNo;
		int n = arr.length - 1;
		for (int num : arr) {
			total = total + num;
		}
		duplicateNo = total - ((n*(n+1))/2);
		return duplicateNo;
	}

	public static int findDuplicateUsingXOR(int[] arr){

		int size = arr.length;
		int duplicateNo = 0;

		for(int i = 0 ; i<size ; i++){
			if((arr[i]^i+1) != 0){
				duplicateNo = i;
				break;
			}
		}

		return duplicateNo;
	}

}
