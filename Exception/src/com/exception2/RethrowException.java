package com.exception2;

public class RethrowException {
	
	private static void method1() {
	try {
	String s= null;
	System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println("in catch block method");
		throw e; // handle by jvm
	}
}

	public static void main(String[] args) {
		
		try {
			method1();
		}
		catch(Exception e)
		{
			System.out.println("In main:"+ e);
			
		}
		

	}

	
		
	}
	
	

