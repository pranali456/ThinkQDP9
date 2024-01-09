package com.wrapper;

public class Primitive {

	public static void main(String[] args) {
		 byte byteValue = 42;
	        Byte byteWrapper = Byte.valueOf(byteValue);
	        System.out.println("Byte Wrapper: " + byteWrapper);

	        
	        short shortValue = 1000;
	        Short shortWrapper = Short.valueOf(shortValue);
	        System.out.println("Short Wrapper: " + shortWrapper);

	        
	        int intValue = 123;
	        Integer intWrapper = Integer.valueOf(intValue);
	        System.out.println("Integer Wrapper: " + intWrapper);

	        
	        long longValue = 9876543210L;
	        Long longWrapper = Long.valueOf(longValue);
	        System.out.println("Long Wrapper: " + longWrapper);

	        
	        float floatValue = 3.14f;
	        Float floatWrapper = Float.valueOf(floatValue);
	        System.out.println("Float Wrapper: " + floatWrapper);

	        
	        double doubleValue = 2.71828;
	        Double doubleWrapper = Double.valueOf(doubleValue);
	        System.out.println("Double Wrapper: " + doubleWrapper);

	       
	        char charValue = 'A';
	        Character charWrapper = Character.valueOf(charValue);
	        System.out.println("Character Wrapper: " + charWrapper);

	       
	        boolean booleanValue = true;
	        Boolean booleanWrapper = Boolean.valueOf(booleanValue);
	        System.out.println("Boolean Wrapper: " + booleanWrapper);
	    }
	}

	


