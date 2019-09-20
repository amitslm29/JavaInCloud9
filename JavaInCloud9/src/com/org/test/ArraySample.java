package com.org.test;

public class ArraySample {
	
	public static void main(String[] args) {
		int[] arr = new int []{5,4,7,3,9,6,10,1,2,8};
		int left = 0;
		int right = arr.length - 1;
		System.out.println("ARRAY BEFORE SORTING : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		mergeSort(arr, left, right);
		System.out.println("\nARRAY AFTER SORTING : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int s1 = mid-left+1;
		int s2 = right-mid;
		
		int[] arr1 = new int[s1];
		int[] arr2 = new int[s2];
		
		for(int i=0 ; i<s1 ; i++){
			arr1[i] = arr[left+i];
		}
		
		for(int i=0 ; i<s2 ; i++){
			arr2[i] = arr[mid+1+i];
		}
		
		int i=0 , j=0 , k=left;
		
		while(i < s1 && j < s2){
			if(arr1[i] <= arr2[j]){
				arr[k] = arr1[i];
				i++;
			}
			else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < s1){
			arr[k] = arr1[i];
			i++;k++;
		}
		
		while(j < s2){
			arr[k] = arr2[j];
			j++;k++;
		}
 	}

	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right){
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
}
