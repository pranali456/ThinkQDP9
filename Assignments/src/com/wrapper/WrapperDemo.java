package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		 Byte byteObj1 = new Byte((byte) 42);
	        Byte byteObj2 = new Byte("42");

	        
	        Short shortObj1 = new Short((short) 1000);
	        Short shortObj2 = new Short("1000");

	       
	        Integer intObj1 = new Integer(123);
	        Integer intObj2 = new Integer("123");
	        Integer intObj3 = Integer.valueOf(123);

	        
	        Long longObj1 = new Long(9876543210L);
	        Long longObj2 = new Long("9876543210");
	        Long longObj3 = Long.valueOf("9876543210");

	       
	        Character charObj = new Character('A');

	        
	        Float floatObj1 = new Float(3.14f);
	        Float floatObj2 = new Float("3.14");
	        Float floatObj3 = Float.valueOf("3.14");

	        
	        Double doubleObj1 = new Double(2.71828);
	        Double doubleObj2 = new Double("2.71828");
	        Double doubleObj3 = Double.valueOf("2.71828");

	        
	        Boolean boolObj1 = new Boolean(true);
	        Boolean boolObj2 = new Boolean("true");
	        Boolean boolObj3 = Boolean.valueOf("true");

	        
	        System.out.println("Byte Constructors:");
	        System.out.println(byteObj1);
	        System.out.println(byteObj2);

	        System.out.println("\nShort Constructors:");
	        System.out.println(shortObj1);
	        System.out.println(shortObj2);

	        System.out.println("\nInteger Constructors:");
	        System.out.println(intObj1);
	        System.out.println(intObj2);
	        System.out.println(intObj3);

	        System.out.println("\nLong Constructors:");
	        System.out.println(longObj1);
	        System.out.println(longObj2);
	        System.out.println(longObj3);

	        System.out.println("\nCharacter Constructor:");
	        System.out.println(charObj);

	        System.out.println("\nFloat Constructors:");
	        System.out.println(floatObj1);
	        System.out.println(floatObj2);
	        System.out.println(floatObj3);

	        System.out.println("\nDouble Constructors:");
	        System.out.println(doubleObj1);
	        System.out.println(doubleObj2);
	        System.out.println(doubleObj3);

	        System.out.println("\nBoolean Constructors:");
	        System.out.println(boolObj1);
	        System.out.println(boolObj2);
	        System.out.println(boolObj3);
	    }
	}

	


