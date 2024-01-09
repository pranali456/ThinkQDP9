package com.superAssignment;

class Parent {
    int x;

    Parent(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Parent class - x: " + x);
    }
}

class Child extends Parent {
    int y;

    Child(int x, int y) {
        super(x); 
        this.y = y;
    }

    void display() {
        super.display(); 
        System.out.println("Child class - y: " + y);
    }
}

public class ParentDemo {
    public static void main(String[] args) {
        Child childInstance = new Child(10, 20);
        childInstance.display();
    }
}



