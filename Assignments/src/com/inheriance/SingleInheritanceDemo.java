package com.inheriance;

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}


class Circle extends Shape {
  
    void draw() {
        System.out.println("Drawing a circle.");
    }

    void calculateArea() {
        System.out.println("Calculating the area of the circle.");
    }
}



public class SingleInheritanceDemo {

	public static void main(String[] args) {
		 Circle myCircle = new Circle();
	        myCircle.draw();         
	        myCircle.calculateArea(); 

	}

}
