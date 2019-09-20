package com.org.array;

public class UnionIntersactionTwoSortedArray {

	public static void main(String[] args) {
		int[] firstArr = {1,2,3,4,5,6,7};
		int[] secondArr = {4,5,6,7,8,9};
		System.out.print("UNION OF FIRST ARRAY AND SECOND ARRAY : ");
		unionTwoArray(firstArr, secondArr);
		System.out.println("");
		System.out.print("INTERSACTION OF FIRST ARRAY AND SECOND ARRAY : ");
		intersactionTwoArray(firstArr, secondArr);
	}
	
	public static void unionTwoArray(int firstArray[], int secondArray[]) {
		
		int i, j, sizeFirstArray, sizeSecondArray;
		i = j = 0;
		sizeFirstArray = firstArray.length;
		sizeSecondArray = secondArray.length;
		
		while (i < sizeFirstArray && j < sizeSecondArray) {
			 if (firstArray[i] < secondArray[j]) {
				 System.out.print(firstArray[i++] + " ");
			 }else if (firstArray[i] > secondArray[j]) {
				 System.out.print(secondArray[j++] + " ");
			 }else {
				 System.out.print(firstArray[i] + " ");
				 i++;
				 j++;
			 }
		}
		
		/* Print remaining elements of larger array */
		while (i < sizeFirstArray) {
			System.out.print(firstArray[i++] + " ");
		}
		while (j < sizeSecondArray) {
			System.out.print(secondArray[j++] + " ");
		}
		
	}
	
	public static void intersactionTwoArray(int firstArray[], int secondArray[]) {
		int i, j, sizeFirstArray, sizeSecondArray;
		i = j = 0;
		sizeFirstArray = firstArray.length;
		sizeSecondArray = secondArray.length;
		
		while (i < sizeFirstArray && j < sizeSecondArray) {
			 if (firstArray[i] < secondArray[j]) {
				 i++;
			 }else if (firstArray[i] > secondArray[j]) {
				 j++;
			 }else {
				 System.out.print(firstArray[i] + " ");
				 i++;
				 j++;
			 }
		}
	}
}
