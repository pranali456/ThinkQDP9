package com.twoDimetionArray;

public class MaxInRow {
	public static void maxRow(int arr[][]) {
		 for (int i = 0; i < arr.length; i++) {
	            int maxInRow = arr[i][0];

	            for (int j = 1; j < arr[i].length; j++) {
	                if (arr[i][j] > maxInRow) {
	                    maxInRow = arr[i][j];
	                }
	            }

	            System.out.println("Maximum in row " + (i + 1) + ": " + maxInRow);
	        }
	    }

	public static void main(String[] args) {
		int[][] arr = { { 22, 31, 9 }, { 12, 25, 16 } };
		maxRow(arr);

	}

}


