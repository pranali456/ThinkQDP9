package com.twoDimetionArray;

import java.util.Scanner;

public class LowerTriangle {
	private static void printLowerTriangular(int[][] matrix) {
		int size = matrix.length;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j <= i) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private static void displayMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Upper Triangular Matrix:");
		printLowerTriangular(matrix);
	}

}
