
// Write a Java program to enter radius of a circle and find its diameter, circumference and area.
package com.assignment1;

public class Circle {

	public static void main(String[] args) {
		int radius=3;
		double pi=3.14;
		double diameter,circumference,area;
		
		diameter=2*radius;
		circumference=2*pi*radius;
		area=pi*radius*radius;
		
		System.out.println("diameter of cicle ="+ diameter);
		System.out.println("circumference of cicle ="+ circumference);
		System.out.println("area of cicle ="+ area);
		
		
	}

}
