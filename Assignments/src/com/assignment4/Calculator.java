package com.assignment4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1");
		float num1=sc.nextFloat();
		
		System.out.println("Enter num2");
		float num2=sc.nextFloat();
		
		System.out.println("Enter operator");
		char operator=sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			float sum= num1+num2;
			System.out.println(num1 +"+"+ num2+"="+sum);
			break;
			
		case '-':
			float sub=num1-num2;
			
			System.out.println(num1 +"-"+ num2+"="+sub);
			break;
			
		case '*':
			float multi= num1*num2;
			System.out.println(num1 +"*"+ num2+"="+multi);
			break;
			
		case '/':
			float div=num1/num2;
			System.out.println(num1 +"/"+ num2+"="+div);
			break;
			
			default:
				System.out.println("invalid ");
		}
		sc.close();
		
			
		}

	}


