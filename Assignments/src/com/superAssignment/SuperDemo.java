package com.superAssignment;


class Company {
    int x;

    Company(int x) {
        this.x = x;
        System.out.println("company class constructor");
    }
}

class Employe extends Company {
    int y;

    Employe(int x, int y) {
        super(x); 
        this.y = y;
        System.out.println("Child class constructor");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Employe childInstance = new Employe(10, 20);
    }
}






