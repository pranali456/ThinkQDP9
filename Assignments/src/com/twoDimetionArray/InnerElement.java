package com.twoDimetionArray;

public class InnerElement {
	private static double calculateAverageInnermost(int[][] array) {
		int sum = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}

		if (count == 0) {
			return 0;
		}

		return (double) sum / count;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		double average = calculateAverageInnermost(array);

		System.out.println("Average of innermost elements: " + average);
	}
}
