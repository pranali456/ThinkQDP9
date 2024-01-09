package com.staticandfinal;


class Parent {
    
    public static int staticVariable = 10;
}

class Child extends Parent {
   
}

public class InheritStaticVariable {
    public static void main(String[] args) {
        
        System.out.println("Static variable from Parent class: " + Parent.staticVariable);

       
        System.out.println("Static variable from Child class: " + Child.staticVariable);

        
        Child.staticVariable = 20;

       
        System.out.println("Static variable after modification: " + Parent.staticVariable);
        System.out.println("Static variable after modification: " + Child.staticVariable);
    }
}


	


