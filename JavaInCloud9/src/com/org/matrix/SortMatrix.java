package com.org.matrix;

import java.util.Arrays;

/* Create a temporary array
 * Copy all elements from matrix to array
 * Sort the array
 * Copy all elements from array to matrix */
public class SortMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 6, 7, 3, 10 }, 
				{ 9, 12, 1, 8 }, 
				{ 5, 2, 11, 4 } };
		sortMatrix(mat);
	}

	public static void sortMatrix(int[][] mat) {

		int rows = mat.length;
		int cols = mat[0].length;

		int[] temp = new int[rows*cols];
		int k = 0;

		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				temp[k++] = mat[i][j];
			}
		}

		Arrays.sort(temp);

		k = 0;
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				mat[i][j] = temp[k++];
			}
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
