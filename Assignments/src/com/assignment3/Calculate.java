package com.assignment3;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num1");
		System.out.println("Enter num2");
		
		float num1, num2;
		
		 num1= sc.nextFloat();
		 num2 = sc.nextFloat();
		 
		 float num3=num1+num2;
		 float num4=num1-num2;
		 float num5=num1*num2;
		 float num6=num1/num2;
		 float num7=num1%num2;
		 
		 System.out.println("......result........");
		 
		 System.out.println(num3 + " Addition of two number");
		 System.out.println(num4  + " substraction of two number");
		 System.out.println(num5  + " multi of two number");
		 System.out.println(num6 + "  Division of two number");
		 System.out.println(num6 + " modulus of two number");
		

	}

}
