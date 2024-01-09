package com.inheriance;

class Shape2 {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}


class Circle2 extends Shape2 {
   
    void draw() {
        System.out.println("Drawing a circle.");
    }

    void calculateArea() {
        System.out.println("Calculating the area of the circle.");
    }
}


class Rectangle extends Shape2 {
    
    void draw() {
        System.out.println("Drawing a rectangle.");
    }

    void calculateArea() {
        System.out.println("Calculating the area of the rectangle.");
    }
}


public class HierarchicalDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();        
        myCircle.calculateArea();

        Rectangle myRectangle = new Rectangle();
        myRectangle.draw();       
        myRectangle.calculateArea();
    }
}









	


