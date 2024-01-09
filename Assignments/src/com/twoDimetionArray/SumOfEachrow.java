package com.twoDimetionArray;

public class SumOfEachrow {

	public static void sumOfRows(int a[][]) {
		int row = a.length;
		int cols = a[0].length;
		int sum;

		for (int i = 0; i < row; i++) {
			sum = 0;

			for (int j = 0; j < cols; j++) {
				sum += a[i][j];
			}

			System.out.println("Sum of row " + i + ": " + sum);
		}
	}

	public static void sumOfColumns(int a[][]) {
		int row = a.length;
		int cols = a[0].length;
		int sum;

		for (int j = 0; j < cols; j++) {
			sum = 0;

			for (int i = 0; i < row; i++) {
				sum += a[i][j];
			}

			System.out.println("Sum of column " + j + ": " + sum);
		}
	}

	public static void display(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j : a[i]) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int m1[][] = { { 1, 2 }, { 4, 5 } };

		System.out.println("Original Matrix:");
		display(m1);

		sumOfRows(m1);
		sumOfColumns(m1);
	}
}
