package com.assignment4;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Menu");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of square");
		System.out.println("3.Area of Right Angled Triangle");
		System.out.println("4.Area of rectangle");
		System.out.println("5.Circumference of a circle ");
		System.out.println("6.Perimeter of a square");
		
		
		System.out.println("Enter your option");
		int option= sc.nextInt();
		
		switch(option) 
		{
		case 1:
			System.out.println("Enter radius");
			float radius= sc.nextFloat();
			double areaCircle=3.14*radius*radius;
			System.out.println("Area of circle"+areaCircle);
			break;
			
		case 2:
			System.out.println("Enter side");
			int side=sc.nextInt();
			int areaSquare=side*side;
			System.out.println("Area of square"+areaSquare);
			break;
			
		case 3:
			System.out.println("Enter base and height");
			float base=sc.nextInt();
			float height= sc.nextFloat();
			double areaRAT=0.5*(base*height);
			System.out.println("area of right angled triangle"+areaRAT);
			
		case 4:
			System.out.println("Enter length and width");
			float length=sc.nextFloat();
			float width=sc.nextFloat();
			float areaRectangle=length*width;
			System.out.println("area of rectangle"+areaRectangle);
			break;
			
		case 5:
			System.out.println("Enter the radius");
			int radius1=sc.nextInt();
			double circumfer=2*3.14*radius1;
			System.out.println("circumference of circle"+circumfer);
			break;
			
		case 6:
			System.out.println("enter side");
			int sides=sc.nextInt();
			int periSquare=4*sides;
			System.out.println("perimeter of square"+periSquare);
			break;
			
			default:
				System.out.println("exit");
			
			
			
			
		
		}
		

	}

}
