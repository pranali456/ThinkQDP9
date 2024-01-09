package com.inheriance;


class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}


class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing.");
    }
}


class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}


public class MultilevelDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();      
        myDog.breathe();  
        myDog.bark();     
    }
}












	


