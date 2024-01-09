
// Write a Java program to enter two angles of a triangle and find the third angle.
package com.assignment1;

public class Triangle {

	public static void main(String[] args) {
		int angle1,angle2,angle3;
		angle1=50;
		angle2=70;
		
		angle3=180-(angle1+angle2);
		System.out.println("third angle of triangle="+ angle3);

	}

}
