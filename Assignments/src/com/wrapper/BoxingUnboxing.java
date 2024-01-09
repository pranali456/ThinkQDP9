package com.wrapper;

public class BoxingUnboxing {
	public static void main(String[] args) {
	
	 // Boxing (Primitive to Wrapper)
    // 1. int
    Integer intWrapper = Integer.valueOf(42);

    // 2. byte
    Byte byteWrapper = Byte.valueOf((byte) 123);

    // 3. short
    Short shortWrapper = Short.valueOf((short) 1000);

    // 4. long
    Long longWrapper = Long.valueOf(9876543210L);

    // 5. float
    Float floatWrapper = Float.valueOf(3.14f);

    // 6. double
    Double doubleWrapper = Double.valueOf(2.71828);

    // 7. char
    Character charWrapper = Character.valueOf('A');

    // 8. boolean
    Boolean booleanWrapper = Boolean.valueOf(true);

    // Unboxing (Wrapper to Primitive)
    // 1. int
    int intPrimitive = intWrapper.intValue();

    // 2. byte
    byte bytePrimitive = byteWrapper.byteValue();

    // 3. short
    short shortPrimitive = shortWrapper.shortValue();

    // 4. long
    long longPrimitive = longWrapper.longValue();

    // 5. float
    float floatPrimitive = floatWrapper.floatValue();

    // 6. double
    double doublePrimitive = doubleWrapper.doubleValue();

    // 7. char
    char charPrimitive = charWrapper.charValue();

    // 8. boolean
    boolean booleanPrimitive = booleanWrapper.booleanValue();

    
    System.out.println("Boxing (Primitive to Wrapper):");
    System.out.println("Integer: " + intWrapper);
    System.out.println("Byte: " + byteWrapper);
    System.out.println("Short: " + shortWrapper);
    System.out.println("Long: " + longWrapper);
    System.out.println("Float: " + floatWrapper);
    System.out.println("Double: " + doubleWrapper);
    System.out.println("Character: " + charWrapper);
    System.out.println("Boolean: " + booleanWrapper);

    System.out.println("\nUnboxing (Wrapper to Primitive):");
    System.out.println("int: " + intPrimitive);
    System.out.println("byte: " + bytePrimitive);
    System.out.println("short: " + shortPrimitive);
    System.out.println("long: " + longPrimitive);
    System.out.println("float: " + floatPrimitive);
    System.out.println("double: " + doublePrimitive);
    System.out.println("char: " + charPrimitive);
    System.out.println("boolean: " + booleanPrimitive);
}
}

	
		

	


