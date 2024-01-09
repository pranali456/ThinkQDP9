package com.overriding;


class Shape{
	
	void draw() {
		System.out.println("draw the shape");
	}
}
	
	class Circle extends Shape{
		void draw() {
			System.out.println("drawing circle");
			
		}
		
		
	}
	class Square extends Shape{
		void draw() {
			System.out.println("Drawing square");
		}
		
		
	}
	class Rectangle extends Shape{
		void draw() {
			System.out.println("drawing rectangle");
		}
		
		
	}


public class ShapeDemo {
	public static void main(String[] args) {
		
		Shape s= new Shape();
		s.draw();
		
		Circle c= new Circle();
		c.draw();
		
		Square s1= new Square();
		s1.draw();
		
		Rectangle r= new Rectangle();
		r.draw();
	}
}

		
		
		
	



