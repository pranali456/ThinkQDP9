package com.assignment5;

import java.util.Scanner;

public class SumOfOdd {
	
	 public static int sumEvenNumbers(int n) {
	        int sum = 0;
	        for (int i = 2; i <= n; i++) {
	            if (i % 2 != 0) {
	                sum = sum + i;
	            }
	        }
	        return sum;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = sumEvenNumbers(n);
        System.out.println("Sum of odd numbers from 2 to " + n + " is: " + result);
        sc.close();
		

	}

}
