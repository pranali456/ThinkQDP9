package com.inheriance;


class Shape1 {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}


class Circle1 extends Shape1{
   
    void draw() {
        System.out.println("Drawing a circle.");
    }

    void calculateArea() {
        System.out.println("Calculating the area of the circle.");
    }
}


class ColoredCircle extends Circle {
    String color;

    ColoredCircle(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}


public class Multilevel1{
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle("Red");
        coloredCircle.draw();        
        coloredCircle.calculateArea();
        coloredCircle.displayColor(); 
    }

	}


