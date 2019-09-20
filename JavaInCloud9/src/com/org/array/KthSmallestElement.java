package com.org.array;

import java.util.PriorityQueue;

public class KthSmallestElement {
	
	public static void main(String[] args) {
		int[] arr = {5,7,2,9,8,1,4,3,6};
		int kthSmallest = findKthSmallestElement(arr, 3);
		//int kthSmallest = findKthSmallestElementUsingQuickSort(arr, 0, arr.length-1, 3);
		System.out.println("Kth Smallest Element in given array - " + kthSmallest);
	}
	
	/*
	 * Here We are finding Kth Smallest Element using Heap.
	 * PriorityQueue is by default MaxHeap.
	 */
	public static int findKthSmallestElement(int[] arr, int k){
		int p = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i : arr){
			queue.add(i);
		}
		
		while(k > 0){
			p = queue.remove();
			k--;
		}
		return p;
	}
	
	//Using QuickSort mechanism
	public static int findKthSmallestElementUsingQuickSort(int[] arr, int start, int end, int k){
		int n = arr.length;
		int i = start;
		int j = end;
		int temp;
		int pivot = arr[(start+end)/2];
		while(i <= j) {
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			if(i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
	
		if(k == i)
			return pivot;
		else if(k > i)
			return findKthSmallestElementUsingQuickSort(arr, start, i-1, k);
		else
			return findKthSmallestElementUsingQuickSort(arr, i+1, end, k);
	}
}
