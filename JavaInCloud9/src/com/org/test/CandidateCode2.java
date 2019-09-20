package com.org.test;

import java.util.Scanner;


/*
Minimum in SubArrays (20 Marks)
You are given an array A[] of size N and an integer K. Your task is to print the minimum element for each subarray of size K.
In other words, for each valid index i (0 <= i <= N-K), you have to print min(A[i], A[i+1], A[i+2]... A[i+K]).

Input Format
The first line will contain two integers N and K.
The second line contains N integers denoting the elements of Array A[].

Constraints
1 <= N <= 10^5
1 <= K <= N
1 <= A[i] <= 10^6

Output Format
Print the minimum element for each subarray of size K separated by space.

Sample TestCase 1
Input
5 2
10 0 3 2 5

Output
0 0 2 2
*/
public class CandidateCode2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0 ; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
	
		findMinInSubArray(arr, arr.length, 2);
	}
	
	public static void findMinInSubArray(int[] arr, int N, int K){
		
		int minimum = 0;
		
		for(int i=0 ; i<=N-K ; i++){
			minimum = arr[i];
			
			for(int j=1 ; j<K ; j++) {
				if(arr[i+j] < minimum){
					minimum = arr[i+j];
				}
			}
			
			System.out.print(minimum + " ");
		}
	}

}
