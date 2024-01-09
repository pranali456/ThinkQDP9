package com.assignment6;

public class Rectangle {
	private double length;
	private double width;
	
	 public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	 public void calculateArea() {
	       double area = length * width;
	        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is: " + area);
	    }


	public static void main(String[] args) {
		Rectangle r1= new Rectangle(5, 4);
		Rectangle r2= new Rectangle(4, 5.5);
		Rectangle r3= new Rectangle(6.5, 2);
		
		r1.calculateArea();
		r2.calculateArea();
		r3.calculateArea();
		
		

	}

}
