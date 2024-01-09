package com.exception2;

import java.io.IOException;

public class ThrowsException {
	
	static void method1() throws IOException,NullPointerException
	{
		String s=null;
		System.out.println(s.length());
		
		try {
			throw new IOException("no input");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void method2() throws IOException,NullPointerException
	{
		String s= null;
		System.out.println(s.length());
		
		throw new IOException("no input");
	}
		

	public static void main(String[] args) {
		
			
		}
	}


