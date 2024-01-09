package com.ConsructorChaining;

public class Compare {
	 public void compare(int num1, int num2) {
	        if (num1 > num2) {
	            System.out.println( num1 + "is grater");
	        } else if (num2 > num1) {
	            System.out.println( num2 + "is grater");
	        } else {
	            System.out.println("Both integers are equal.");
	        }
	    }

	    public void compare(char char1, char char2) {
	        int num1 =  char1;
	        int num2 =  char2;

	        if (num1 > num2) {
	            System.out.println( char1 + "is higher numeric value");
	        } else if (num2 > num1) {
	            System.out.println(char2 + "is higher numeric value");
	        } else {
	            System.out.println("Both characters have the same numeric value.");
	        }
	    }

	    public static void main(String[] args) {
	        Compare c1 = new Compare();

	       
	        c1.compare(5, 10);

	       
	        c1.compare('A', 'B');
	    }
	}


