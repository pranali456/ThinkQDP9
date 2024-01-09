package com.assignment5;

import java.util.Scanner;

public class SingleDigit {
	 public static boolean isValidSingleDigit(int number) {
	        return number >= 0 && number <= 9;
	    }

	    public static void checkKeyNumber(int userNumber) {
	        int keyNumber = 4;

	        if (userNumber == keyNumber) {
	            System.out.println("The entered number matches the key number.");
	        } else {
	            System.out.println("The entered number does not match the key number.");
	        }
	    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a single-digit number: ");
	        int userInput = scanner.nextInt();

	        if (isValidSingleDigit(userInput)) {
	            checkKeyNumber(userInput);
	        } else {
	            System.out.println("Invalid input");
	        }
	    }

	}


