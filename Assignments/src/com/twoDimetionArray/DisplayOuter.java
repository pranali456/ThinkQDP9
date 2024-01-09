package com.twoDimetionArray;

public class DisplayOuter {
	
	 
		 public static void display(int arr[][]) {
		        for (int i = 0; i < 4; i++) {
		            for (int j = 0; j < 4; j++) {
		                if (i == 0 || i == 3 || j == 0 || j == 3) {
		                    System.out.print(arr[i][j] + " ");
		                } else {
		                    System.out.print("  "); 
		                }
		            }
		            System.out.println();
		        }
		    }

		    public static void main(String[] args) {
		        int m1[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
		        display(m1);
		    }
		}