package com.org.matrix;

import java.util.Arrays;
import java.util.Comparator;

public class SortMatrixBasedOneColumn {
	
	public static void main(String[] args) {
		int mat[][] = { { 6, 7, 3, 10 }, 
				{ 9, 12, 1, 8 }, 
				{ 5, 2, 11, 4 } };
		sortMatrixByColumn(mat, 2);
	}
	
	public static void sortMatrixByColumn(int[][] mat, final int col) {
		Arrays.sort(mat, new Comparator<int[]>() {

			@Override
			public int compare(int[] col1, int[] col2) {
				return col1[col] - col2[col];
			}
			
		});
		printMatrix(mat);
	}
	
	public static void printMatrix(int[][] mat){
		for(int i=0 ; i<mat.length ; i++){
			for(int j=0 ; j<mat[i].length ; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
