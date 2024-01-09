
//Write java Program for arithmetic operation for each operation write separate Method
package com.assignment6;

import java.util.Scanner;

public class Arithmatic {
	private double num1;
	private double num2;

	public Arithmatic(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double add() {
		return num1 + num2;
	}

	public double subtract() {
		return num1 - num2;
	}

	public double multiply() {
		return num1 * num2;
	}

	public double divide() {
		return num1/num2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		Arithmatic arithmetic = new Arithmatic(num1, num2);

		double sumResult = arithmetic.add();
		double differenceResult = arithmetic.subtract();
		double productResult = arithmetic.multiply();
		double quotientResult = arithmetic.divide();

		System.out.println("Sum: " + sumResult);
		System.out.println("Difference: " + differenceResult);
		System.out.println("Product: " + productResult);
		System.out.println("Quotient: " + quotientResult);
	}
}
