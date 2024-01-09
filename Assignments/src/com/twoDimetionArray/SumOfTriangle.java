package com.twoDimetionArray;

import java.util.Scanner;

public class SumOfTriangle {
	private static int sumLowerTriangular(int[][] matrix) {
		int sum = 0;
		int size = matrix.length;

		for (int i = 1; i < size; i++) {
			for (int j = 0; j < i; j++) {
				sum += matrix[i][j];
			}
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
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the square matrix: ");
		int size = scanner.nextInt();

		int[][] matrix = new int[size][size];

		System.out.println("Enter elements for the matrix:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Original Matrix:");
		displayMatrix(matrix);

		int sum = sumLowerTriangular(matrix);
		System.out.println("Sum of the lower triangular matrix: " + sum);

		scanner.close();
	}

}
