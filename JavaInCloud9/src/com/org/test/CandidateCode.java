package com.org.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
Uncommon Between Common (20 Marks)
Sneha is standing in front of two big rows consisting of N and M students respectively. Students are carrying the big
cardboard on which an integer is written. Sneha needs to find the uncommon integers (elements) between two rows of
students. Since, the rows are so big that it is difficult to find uncommon elements manually. You as a coder needs to
write the code to
Find the uncommon elements from 2 arrays in order to help sneha.

Note: Rows will be represented as arrays.

Input Format
The first line of input consists of number of students in first row, N.
Next N lines consist of an integer each.
The next line consist of number of students in second row, M.
Next M lines consist of an integer each.

Constraints
1 <= N < 1000000
1 <= M < 1000000

Output Format
Return the uncommon elements in the form of string where each element is separated by $.

Sample TestCase 1
Input
5 1 2 3 4 5 5 3 4 5 6 7

Output
1$2$6$7
*/
public class CandidateCode {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr1[] = new int[N];
		for(int i=0 ; i<N ; i++){
			arr1[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int arr2[] = new int[M];
		for(int i=0 ; i<M ; i++){
			arr2[i] = sc.nextInt();
		}
		
		findUncommon(arr1, arr2);
	}
	
	public static void findUncommon(int[] arr1, int[] arr2){
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int X : arr1){
			set.add(X);
		}
		
		for(int Y : arr2){
			if(set.contains(Y)){
				set.remove(Y);
			}
			else{
				set.add(Y);
			}
		}
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "$");
		}
	}
}
