package com.org.matrix;

public class RotateMatrixBy90Degree {
	
	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 } };
		rotateMatrixAntiClockwise(mat);
	}
	
	public static void rotateMatrixClockwise(int[][] mat){
		
		int rowsInRotatedMat = mat[0].length;
		int columnsInRotatedMat = mat.length;
		int[][] rotatedMat = new int[rowsInRotatedMat][columnsInRotatedMat];
		
		for(int i=0 ; i<mat.length ; i++){
			for(int j=0 ; j<mat[i].length ; j++){
				rotatedMat[j][(columnsInRotatedMat-1)-i] = mat[i][j];
			}
		}
		printMatrix(rotatedMat);
	}
	
	public static void rotateMatrixAntiClockwise(int[][] mat){
		
		int rowsInRotatedMat = mat[0].length;
		int columnsInRotatedMat = mat.length;
		int[][] rotatedMat = new int[rowsInRotatedMat][columnsInRotatedMat];
		
		for(int i=0 ; i<mat.length ; i++){
			for(int j=0 ; j<mat[i].length ; j++){
				rotatedMat[(rowsInRotatedMat-1)-j][i] = mat[i][j];
			}
		}
		printMatrix(rotatedMat);
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
