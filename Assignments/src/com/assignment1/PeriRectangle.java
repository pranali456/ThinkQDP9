
//Write a Java program to enter length and breadth of a rectangle and find its perimeter.
// Write a Java program to enter length and breadth of a rectangle and find its area.
package com.assignment1;

public class PeriRectangle {

	public static void main(String[] args) {
		int length=9,breadth=4;
		int perimeter,area;
		
		area=length*breadth;
		
		perimeter = 2*(length+breadth);
		
		System.out.println("perimeter of rectangle="+ perimeter);
		System.out.println("area of rectangle="+ area);
		
		

	}

}
