package com.org.dynamicprogramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "STONE"; 
		String s2 = "LONGEST"; 
		int result = findLCS(s1,s2);
		System.out.println("Length of Longest Subsequence : " + result);
	}

	public static int findLCS(String s1, String s2){

		int m = s1.length();
		int n = s2.length();

		int[][] T = new int[m+1][n+1];

		for(int i=0 ; i<=m ; i++){
			for(int j=0 ; j<=n ; j++){
				if(i ==0 || j == 0)
					T[i][j] = 0;
				else if(s1.charAt(i-1) == s2.charAt(j-1))
					T[i][j] = T[i-1][j-1] + 1;
				else
					T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
			}
		}
		return T[m][n];
	}
}
