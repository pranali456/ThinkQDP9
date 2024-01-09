package com.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		 byte bytePrimitive = 42;
	        Byte byteWrapper = bytePrimitive; 
	        System.out.println("Byte Wrapper: " + byteWrapper);

	        
	        short shortPrimitive = 1000;
	        Short shortWrapper = shortPrimitive; 
	        System.out.println("Short Wrapper: " + shortWrapper);

	        
	        int intPrimitive = 123;
	        Integer intWrapper = intPrimitive; 
	        System.out.println("Integer Wrapper: " + intWrapper);

	        
	        long longPrimitive = 9876543210L;
	        Long longWrapper = longPrimitive; 
	        System.out.println("Long Wrapper: " + longWrapper);

	        
	        float floatPrimitive = 3.14f;
	        Float floatWrapper = floatPrimitive; 
	        System.out.println("Float Wrapper: " + floatWrapper);

	        
	        double doublePrimitive = 2.71828;
	        Double doubleWrapper = doublePrimitive; 
	        System.out.println("Double Wrapper: " + doubleWrapper);

	       
	        char charPrimitive = 'A';
	        Character charWrapper = charPrimitive; 
	        System.out.println("Character Wrapper: " + charWrapper);

	        
	        boolean booleanPrimitive = true;
	        Boolean booleanWrapper = booleanPrimitive; 
	        System.out.println("Boolean Wrapper: " + booleanWrapper);
	    }
	

	}


