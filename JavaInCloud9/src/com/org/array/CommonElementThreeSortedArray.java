package com.org.array;

public class CommonElementThreeSortedArray {
	
	public static void main(String[] args) {
		
		int[] firstArr = {1,2,3,4,5,6,7};
		int[] secondArr = {4,5,6,7,8,9};
		int[] thirdArr = {6,7,8,9,10};
		System.out.print("COMMON ELEMENT BETWEEN FIRST ARRAY, SECOND ARRAY AND THIRD ARRAY : ");
		findCommonElement(firstArr, secondArr, thirdArr);
		
	}

	public static void findCommonElement(int first[], int second[], int third[]) {
		
		int i,j,k, sizeFirst, sizeSecond, sizeThird;
		i = j = k = 0;
		sizeFirst = first.length;
		sizeSecond = second.length;
		sizeThird = third.length;
		
		while (i < sizeFirst && j < sizeSecond && k < sizeThird) {
			
			if (first[i] == second[j] && second[j] == third[k]) {
				System.out.print(first[i] + " ");
				i++; j++; k++;
			}else if (first[i] < second[j]) {
				i++;
			}else if (second[j] < third[k]) {
				j++;
			}else{
				k++;
			}
		}
	}
}
