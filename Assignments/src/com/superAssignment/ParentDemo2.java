package com.superAssignment;


class Car {
    void display() {
        System.out.println("Parent class method");
    }
}

class Engine extends Car{
    
    void display() {
        super.display(); 
        System.out.println("Child class method");
    }
}

public class ParentDemo2 {
    public static void main(String[] args) {
        Engine childInstance = new Engine();
        childInstance.display();
    }
}







