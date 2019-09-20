package com.org.array.searching;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr = {4,5,2,3,1,8,7,9,6};
		int searchKey = 5;
		int index = linearSearch(arr, searchKey);
		if(index == -1)
			System.out.println("No such key in the given array !!!");
		else
			System.out.println("Key "+searchKey+" found at index: " + index);
	}
	
	public static int linearSearch(int[] arr, int searchKey){
		int size = arr.length;
		for(int i=0 ; i<size ; i++) {
			if(arr[i] == searchKey)
				return i;
		}
		return -1;
	}
}
