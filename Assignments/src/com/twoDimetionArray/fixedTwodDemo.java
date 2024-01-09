package com.twoDimetionArray;

public class fixedTwodDemo {
	 private static void displayArray(int[][] array) {
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	

	public static void main(String[] args) {
		int rows = 3;

        int[] columns = { 2, 3, 4 };

       int[][] array = new int[rows][];

       
        System.out.println("Enter elements for the 2D array:");

        for (int i = 0; i < rows; i++) {
            array[i] = new int[columns[i]];

            for (int j = 0; j < columns[i]; j++) {
                
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                
            }
        }

      
        System.out.println("Entered 2D Array:");
        displayArray(array);
    }

		
		

	}


