package com.wrapper;

public class ValueOfStringInt {

	public static void main(String[] args) {
		 String intStr = "1A"; 
	        int intValue = Integer.valueOf(intStr, 16);
	        System.out.println("Integer Value: " + intValue);

	       
	        String longStr = "1A"; 
	        long longValue = Long.valueOf(longStr, 16);
	        System.out.println("Long Value: " + longValue);
	    }
	

	}


