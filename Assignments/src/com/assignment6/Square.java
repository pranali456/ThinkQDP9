
//write a java program to calculate square for given number using no return type ,with return type,
//with parameter passing, with parameter and return type.
package com.assignment6;

import java.util.Scanner;

public class Square {
	private double number;

	public Square(double number) {
		this.number = number;
	}

	public void calculateAndPrintSquareNoReturn() {
		double square = number * number;
		System.out.println("Square of " + number + " is: " + square);
	}

	public double calculateSquareWithReturn(double number) {
		return number * number;
	}

	public void printSquareNoReturn(double number) {
		double square = number * number;
		System.out.println("Square of " + number + " is: " + square);
	}

	public double calculateAndReturnSquare(double number) {
		return number * number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double inputNumber = scanner.nextDouble();

		Square s1 = new Square(inputNumber);

		s1.calculateAndPrintSquareNoReturn();

		double result1 = s1.calculateSquareWithReturn(inputNumber);
		System.out.println("Square using return type method: " + result1);

		s1.printSquareNoReturn(inputNumber);

		double result2 = s1.calculateAndReturnSquare(inputNumber);
		System.out.println("Square using parameter and return type method: " + result2);
	}
}
