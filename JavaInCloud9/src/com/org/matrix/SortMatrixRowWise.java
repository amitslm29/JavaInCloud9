package com.org.matrix;

import java.util.Arrays;

public class SortMatrixRowWise {
	
	public static void main(String[] args) {
		int mat[][] = { { 6, 7, 3, 10 }, 
				{ 9, 12, 1, 8 }, 
				{ 5, 2, 11, 4 } };
		sortMatrixRowWise(mat);
	}
	
	public static void sortMatrixRowWise(int[][] mat){
		int rows = mat.length;
		for(int i=0 ; i<rows ; i++){
			Arrays.sort(mat[i]);
		}
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
