package com.staticandfinal;

public class StaticOverloading {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static double add(int a, double b) {
		return a + b;
	}

	public static double add(double a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Sum of two ints: " + add(5, 10));
		System.out.println("Sum of three ints: " + add(5, 10, 15));
		System.out.println("Sum of two doubles: " + add(3.5, 7.2));
		System.out.println("Sum of int and double: " + add(2, 4.5));
		System.out.println("Sum of double and int: " + add(3.7, 2));
	}
}
