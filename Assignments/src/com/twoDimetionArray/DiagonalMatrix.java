package com.twoDimetionArray;

public class DiagonalMatrix {

	static int calculateMainDiagonalSum(int[][] matrix) {
		int sum = 0;
		int size = matrix.length;

		for (int i = 0; i < size; i++) {
			sum += matrix[i][i];
		}

		return sum;
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

		int sum = calculateMainDiagonalSum(matrix);
		System.out.println("Sum of the main diagonal elements: " + sum);
		displayMatrix(matrix);
	}

}
