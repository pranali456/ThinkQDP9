package com.staticandfinal;

public class ExicutionSequ {
	
	 static {
	        System.out.println("Static block is executed.");
	    }

	    
	    public ExicutionSequ() {
	        System.out.println("Default constructor ");
	    }

	    
	    public ExicutionSequ(int parameter) {
	        System.out.println("Parameterized constructor  " + parameter);
	    }

	    
	    public static void staticMethod() {
	        System.out.println("Static method ");
	    }

	    
	    public void instanceMethod() {
	        System.out.println("Instance method ");
	    }

	    public static void main(String[] args) {
	        System.out.println("Main method ");

	       ExicutionSequ obj1 = new ExicutionSequ();

	        
	        ExicutionSequ obj2 = new ExicutionSequ(42);

	       
	        staticMethod();

	       
	        ExicutionSequ obj3 = new ExicutionSequ();
	        obj3.instanceMethod();
	    }
	}


