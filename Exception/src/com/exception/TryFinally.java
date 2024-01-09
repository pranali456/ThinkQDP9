package com.exception;

public class TryFinally {

	public static void main(String[] args) {
		 try {
			 int a=10;
			 System.out.println(a/0);
		 }
		 finally
		 {
			 System.out.println("last code");
		 }
		 // exception is handles after exicution finally block by jvm
		 // catch- jvm

	}

}
