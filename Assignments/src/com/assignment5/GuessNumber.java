package com.assignment5;

import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int correctNumber = 42; 
	        int userGuess;
	        int tries = 0;

	        System.out.println("Welcome to the Guess the Number Game!");

	        do {
	            System.out.print("Enter your guess: ");
	            userGuess = scanner.nextInt();
	            tries++;

	            if (userGuess != correctNumber) {
	                System.out.println("Sorry! Try again.");
	            }

	        } while (userGuess != correctNumber);

	        System.out.println("Congratulations! You guessed the correct number in " + tries + " tries.");
	    }
	
		

	}


