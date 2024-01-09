// Write java Program for arithmetic operation for each operation write separate Method using parameter Passing
package com.assignment6;

import java.util.Scanner;

public class AirthmaticOperation {
	private double num1;
	private double num2;

	public AirthmaticOperation(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double divide(double num1, double num2) {
		return num1/num2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		AirthmaticOperation arithmetic = new AirthmaticOperation(num1, num2);

		double sumResult = arithmetic.add(num1, num2);
		double differenceResult = arithmetic.subtract(num1, num2);
		double productResult = arithmetic.multiply(num1, num2);
		double quotientResult = arithmetic.divide(num1, num2);

		System.out.println("Sum: " + sumResult);
		System.out.println("Difference: " + differenceResult);
		System.out.println("Product: " + productResult);
		System.out.println("Quotient: " + quotientResult);
	}
}
