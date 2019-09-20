package com.org.array;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	public static void main(String[] args) {
		int[] arr = {5,7,2,9,8,1,4,3,6};
		//int kthLargest = findKthLargestElement(arr, 3);
		int kthLargest = findKthLargestElementUsingQuickSort(arr, 0, arr.length-1, 4);
		System.out.println("Kth Largest Element in given array - " + kthLargest);
	}
	
	/*
	 * Here We are finding Kth Largest Element using Heap.
	 * PriorityQueue is by default MaxHeap.
	 */
	public static int findKthLargestElement(int[] arr, int k) {
		int n = arr.length;
		int p = 0;
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i : arr){
			queue.add(i);
		}
		
		while(n-k+1 > 0){
			p = queue.remove();
			k++;
		}
		return p;
	}
	
	/*
	 * Using QuickSort mechanism
	 */
	public static int findKthLargestElementUsingQuickSort(int[] arr, int start, int end, int k){
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
	
		if(k == n-i)
			return pivot;
		else if(k > n-i)
			return findKthLargestElementUsingQuickSort(arr, start, i-1, k);
		else
			return findKthLargestElementUsingQuickSort(arr, i+1, end, k);
	}
}
