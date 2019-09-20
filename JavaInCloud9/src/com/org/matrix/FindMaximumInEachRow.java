package com.org.matrix;

public class FindMaximumInEachRow {
	
	public static void main(String[] args) {
		int mat[][] = { { 6, 7, 3, 10 }, 
				{ 9, 12, 1, 8 }, 
				{ 5, 2, 11, 4 } };
		findMaxEachRow(mat);
	}
	
	public static void findMaxEachRow(int[][] mat) {
		int i = 0;
		int max = 0;
		int rows = mat.length;
		int cols = mat[0].length;
		
		while(i < rows) {
			for(int j=0 ; j<cols ; j++) {
				if(mat[i][j] > max)
					max = mat[i][j];
			}
			System.out.print(max + " ");
			max = 0;
			i++;
		}
		
	}

}
