package com.assignment5;

public class Disarum {
	 public static int calculateDisarumNumber(int num) {
	        int sum = 0;
	        int originalNum = num;

	        while (num > 0) {
	            int digit = num % 10;
	            int power = 1;

	            for (int i = 0; i < digit; i++) {
	                power *= digit;
	            }

	            sum += power;
	            num /= 10;
	        }

	        return (sum == originalNum) ? sum : -1; 
	    }
	
       public static void main(String[] args) {
    	   int n = 135;
           int result = calculateDisarumNumber(n);

           System.out.println("Disarum number for " + n + " is: " + result);
       }
       }


