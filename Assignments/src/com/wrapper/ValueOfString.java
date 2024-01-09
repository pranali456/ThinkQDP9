package com.wrapper;

public class ValueOfString {

	public static void main(String[] args) {
		 String byteStr = "42";
	        Byte byteWrapper = Byte.valueOf(byteStr);
	        System.out.println("Byte Wrapper: " + byteWrapper);

	       
	        String shortStr = "1000";
	        Short shortWrapper = Short.valueOf(shortStr);
	        System.out.println("Short Wrapper: " + shortWrapper);

	        
	        String intStr = "123";
	        Integer intWrapper = Integer.valueOf(intStr);
	        System.out.println("Integer Wrapper: " + intWrapper);

	        
	        String longStr = "9876543210";
	        Long longWrapper = Long.valueOf(longStr);
	        System.out.println("Long Wrapper: " + longWrapper);

	       
	        String floatStr = "3.14";
	        Float floatWrapper = Float.valueOf(floatStr);
	        System.out.println("Float Wrapper: " + floatWrapper);

	       
	        String doubleStr = "2.71828";
	        Double doubleWrapper = Double.valueOf(doubleStr);
	        System.out.println("Double Wrapper: " + doubleWrapper);

	       
	        String charStr = "A";
	        Character charWrapper = Character.valueOf(charStr.charAt(0));
	        System.out.println("Character Wrapper: " + charWrapper);

	        
	        String booleanStr = "true";
	        Boolean booleanWrapper = Boolean.valueOf(booleanStr);
	        System.out.println("Boolean Wrapper: " + booleanWrapper);
	    }
	}

	


