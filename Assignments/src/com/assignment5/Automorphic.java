package com.assignment5;

public class Automorphic {
	 public static String checkAutomorphicNumber(int num) {
	        int square = num * num;
	        int originalNum = num;

	       
	        int count = 0;
	        while (originalNum > 0) {
	            originalNum /= 10;
	            count++;
	        }

	       int lastDigits = (int) (square % Math.pow(10, count));

	       
	        return (lastDigits == num) ? "Automorphic" : "Not Automorphic";
	    }
	

	public static void main(String[] args) {
		int n = 25;
        String result = checkAutomorphicNumber(n);

        System.out.println(result);
    }
		

	}


