package com.wrapper;

public class ValueOfAll {

	public static void main(String[] args) {
		 Byte byteWrapper = Byte.valueOf((byte) 42);
	        byte byteValue = byteWrapper.byteValue();
	        System.out.println("Byte Value: " + byteValue);

	        
	        Short shortWrapper = Short.valueOf((short) 1000);
	        short shortValue = shortWrapper.shortValue();
	        System.out.println("Short Value: " + shortValue);

	       
	        Integer intWrapper = Integer.valueOf(123);
	        int intValue = intWrapper.intValue();
	        System.out.println("Integer Value: " + intValue);

	       
	        Long longWrapper = Long.valueOf(9876543210L);
	        long longValue = longWrapper.longValue();
	        System.out.println("Long Value: " + longValue);

	       
	        Float floatWrapper = Float.valueOf(3.14f);
	        float floatValue = floatWrapper.floatValue();
	        System.out.println("Float Value: " + floatValue);

	        Double doubleWrapper = Double.valueOf(2.71828);
	        double doubleValue = doubleWrapper.doubleValue();
	        System.out.println("Double Value: " + doubleValue);

	        
	        Character charWrapper = Character.valueOf('A');

	        Boolean booleanWrapper = Boolean.valueOf(true);
	    }
	}

	


