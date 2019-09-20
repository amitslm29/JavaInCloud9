package com.org.matrix;

import java.util.Arrays;

/*
 * Sort each row of the matrix.
 * Get transpose of the matrix.
 * Again sort each row of the matrix.
 * Again get transpose of the matrix.
 */
public class SortMatrixRowAndColumnWise {

	public static void main(String[] args) {
		int mat[][] = { { 6, 7, 3, 10 }, 
				{ 9, 12, 1, 8 }, 
				{ 5, 2, 11, 4 } };
		sortMatrixRowAndColumnWise(mat);
	}

	public static void sortMatrixRowAndColumnWise(int[][] mat) {
		sortMatrixRowWise(mat);
		transposeMatrix(mat);
		sortMatrixRowWise(mat);
		transposeMatrix(mat);
		printMatrix(mat);
	}

	public static void sortMatrixRowWise(int[][] mat){
		int rows = mat.length;
		for(int i=0 ; i<rows ; i++){
			Arrays.sort(mat[i]);
		}
	}

	public static void transposeMatrix(int[][] mat) {

		int rowsInRotatedMat = mat[0].length;
		int columnsInRotatedMat = mat.length;
		int[][] transposeMat = new int[rowsInRotatedMat][columnsInRotatedMat];

		for(int i=0 ; i<mat.length ; i++){
			for(int j=0 ; j<mat[i].length ; j++){
				transposeMat[j][i] = mat[i][j];
			}
		}
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
