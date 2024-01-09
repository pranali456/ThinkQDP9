package com.inheriance;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age); 
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails() {
        displayDetails(); 
        System.out.println("Roll Number: " + rollNumber);
    }
}


public class Singleinheritance2 {
    public static void main(String[] args) {
        Student student = new Student("Aliya", 20, 101);
        student.displayStudentDetails(); 
    }
}


