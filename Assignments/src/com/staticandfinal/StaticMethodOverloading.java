package com.staticandfinal;

public class StaticMethodOverloading {

	
		 public static void displayMessage(String message) {
		        System.out.println("Static method without static keyword: " + message);
		    }

		    
		    public static void displayMessage(String message, int count) {
		        System.out.println("Static method with static keyword: " + message + " (Count: " + count + ")");
		    }

		    public static void main(String[] args) {
		      
		        displayMessage("Hello");
		        displayMessage("Overloaded", 3);
		    }
		}

	


