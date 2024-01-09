// write a java program to calculate cube for given number using no return type ,with return type,
//with parameter passing, with parameter and return type.
package com.assignment6;

import java.util.Scanner;

public class Cube {
	 private double number;

	   
	    public Cube(double number) {
	        this.number = number;
	    }

	    
	    public void calculateAndPrintCubeNoReturn() {
	        double cube = number * number * number;
	        System.out.println("Cube of " + number + " is: " + cube);
	    }

	    
	    public double calculateCubeWithReturn(double number) {
	        return number * number * number;
	    }

	   
	    public void printCubeNoReturn(double number) {
	        double cube = number * number * number;
	        System.out.println("Cube of " + number + " is: " + cube);
	    }

	   
	    public double calculateAndReturnCube(double number) {
	        return number * number * number;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number: ");
	        double inputNumber = scanner.nextDouble();

	        
	        Cube c1 = new Cube(inputNumber);

	       
	        c1.calculateAndPrintCubeNoReturn();

	        
	        double result1 = c1.calculateCubeWithReturn(inputNumber);
	        System.out.println("Cube using return type method: " + result1);

	        
	        c1.printCubeNoReturn(inputNumber);

	        
	        double result2 = c1.calculateAndReturnCube(inputNumber);
	        System.out.println("Cube using parameter and return type method: " + result2);
	    }
	}


