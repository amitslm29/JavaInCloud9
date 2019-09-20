package com.org.matrix;

import java.util.Arrays;

public class PrintMatrixElement {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 } };
		printMatrix(mat);
	}

	public static void printMatrix(int[][] mat) {
		for(int i=0 ; i<mat.length ; i++){
			for(int j=0 ; j<mat[i].length ; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printMatrixUsingForEach(int[][] mat){
		for(int[] row : mat) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
	public static void printMatrixUsingToString(int[][] mat){
		for(int[] row : mat){
			System.out.println(Arrays.toString(row));
		}
	}

}
