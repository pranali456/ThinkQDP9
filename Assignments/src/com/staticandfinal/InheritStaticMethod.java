package com.staticandfinal;


class Parent1 {
    
    public static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child1 extends Parent1 {
    
    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }

   
}

public class InheritStaticMethod {
    public static void main(String[] args) {
       
        Parent1.staticMethod(); 

        Child1.staticMethod();  

        
        Parent1 p = new Child1();
        p.staticMethod(); 
    }



	}


