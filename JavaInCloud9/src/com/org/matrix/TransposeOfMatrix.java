package com.org.matrix;

public class TransposeOfMatrix {
	
	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 } };
		transposeMatrix(mat);
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
		printMatrix(transposeMat);
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
